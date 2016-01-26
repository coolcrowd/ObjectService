package edu.kit.ipd.crowdcontrol.objectservice.rest.resources;

import edu.kit.ipd.crowdcontrol.objectservice.database.operations.NotificationRestOperations;
import edu.kit.ipd.crowdcontrol.objectservice.proto.Notification;
import edu.kit.ipd.crowdcontrol.objectservice.proto.NotificationList;
import edu.kit.ipd.crowdcontrol.objectservice.rest.Paginated;
import edu.kit.ipd.crowdcontrol.objectservice.rest.exceptions.BadRequestException;
import edu.kit.ipd.crowdcontrol.objectservice.rest.exceptions.NotFoundException;
import spark.Request;
import spark.Response;

import static edu.kit.ipd.crowdcontrol.objectservice.rest.RequestUtil.*;

public class NotificationResource {
    private NotificationRestOperations operations;

    public NotificationResource(NotificationRestOperations operations) {
        this.operations = operations;
    }

    /**
     * @param request
     *         Request provided by Spark.
     * @param response
     *         Response provided by Spark.
     *
     * @return A list of all templates.
     */
    public Paginated<Integer> all(Request request, Response response) {
        int from = getQueryInt(request, "from", 0);
        boolean asc = getQueryBool(request, "asc", true);

        return operations.getNotificationsFrom(from, asc, 20)
                .constructPaginated(NotificationList.newBuilder(), NotificationList.Builder::addAllItems);
    }

    /**
     * @param request
     *         Request provided by Spark.
     * @param response
     *         Response provided by Spark.
     *
     * @return A single template.
     */
    public Notification get(Request request, Response response) {
        return operations.getNotification(getParamInt(request, "id"))
                .orElseThrow(() -> new NotFoundException("Resource not found."));
    }

    /**
     * @param request
     *         Request provided by Spark.
     * @param response
     *         Response provided by Spark.
     *
     * @return The created template.
     */
    public Notification put(Request request, Response response) {
        Notification notification = request.attribute("input");
        try {
            notification = operations.insertNotification(notification);
        } catch (IllegalArgumentException e) {
            throw new BadRequestException("All parameters must be set!");
        }

        response.status(201);
        response.header("Location", "/notifications/" + notification.getId());

        return notification;
    }

    /**
     * @param request
     *         Request provided by Spark.
     * @param response
     *         Response provided by Spark.
     *
     * @return The modified template.
     */
    public Notification patch(Request request, Response response) {
        Notification notification = request.attribute("input");
        return operations.updateNotification(getParamInt(request, "id"), notification);
    }

    /**
     * @param request
     *         Request provided by Spark.
     * @param response
     *         Response provided by Spark.
     *
     * @return {@code null}.
     */
    public Notification delete(Request request, Response response) {
        boolean existed = operations.deleteNotification(getParamInt(request, "id"));

        if (!existed) {
            throw new NotFoundException("Template does not exist!");
        }

        return null;
    }
}