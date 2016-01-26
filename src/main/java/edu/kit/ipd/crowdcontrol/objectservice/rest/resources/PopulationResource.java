package edu.kit.ipd.crowdcontrol.objectservice.rest.resources;

import edu.kit.ipd.crowdcontrol.objectservice.database.operations.PopulationOperations;
import edu.kit.ipd.crowdcontrol.objectservice.proto.Population;
import edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList;
import edu.kit.ipd.crowdcontrol.objectservice.rest.Paginated;
import edu.kit.ipd.crowdcontrol.objectservice.rest.exceptions.BadRequestException;
import edu.kit.ipd.crowdcontrol.objectservice.rest.exceptions.NotFoundException;
import spark.Request;
import spark.Response;

import static edu.kit.ipd.crowdcontrol.objectservice.rest.RequestUtil.*;

/**
 * Handles requests to population resources.
 *
 * @author Niklas Keller
 */
public class PopulationResource {
    private PopulationOperations operations;

    public PopulationResource(PopulationOperations operations) {
        this.operations = operations;
    }

    /**
     * @param request
     *         Request provided by Spark.
     * @param response
     *         Response provided by Spark.
     *
     * @return A list of all populations.
     */
    public Paginated<Integer> all(Request request, Response response) {
        int from = getQueryInt(request, "from", 0);
        boolean asc = getQueryBool(request, "asc", true);

        return operations.getPopulationList(from, asc, 20)
                .constructPaginated(PopulationList.newBuilder(), PopulationList.Builder::addAllItems);
    }

    /**
     * @param request
     *         Request provided by Spark.
     * @param response
     *         Response provided by Spark.
     *
     * @return A single population.
     */
    public Population get(Request request, Response response) {
        return operations.getPopulation(getParamInt(request, "id"))
                .orElseThrow(() -> new NotFoundException("Resource not found."));
    }

    /**
     * @param request
     *         Request provided by Spark.
     * @param response
     *         Response provided by Spark.
     *
     * @return The created population.
     */
    public Population put(Request request, Response response) {
        Population population = request.attribute("input");

        try {
            population = operations.createPopulation(population);
        } catch (IllegalArgumentException e) {
            throw new BadRequestException("Name and content must be set!");
        }

        response.status(201);
        response.header("Location", "/populations/" + population.getId());

        return population;
    }

    /**
     * @param request
     *         Request provided by Spark.
     * @param response
     *         Response provided by Spark.
     *
     * @return {@code null}.
     */
    public Population delete(Request request, Response response) {
        boolean existed = operations.delete(getParamInt(request, "id"));

        if (!existed) {
            throw new NotFoundException("Population does not exist!");
        }

        return null;
    }
}