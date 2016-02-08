package edu.kit.ipd.crowdcontrol.objectservice.notification;

/**
 * NotificationNotSentException is thrown when there was an error sending a notification.
 *
 * @author Simon Korz
 * @version 1.0
 */
public class NotificationNotSentException extends RuntimeException {
    /**
     * Constructs a new runtime exception with the specified detail message and
     * cause.  <p>Note that the detail message associated with
     * {@code cause} is <i>not</i> automatically incorporated in
     * this runtime exception's detail message.
     *
     * @param message the detail message (which is saved for later retrieval
     *                by the {@link #getMessage()} method).
     * @param cause   the cause (which is saved for later retrieval by the
     *                {@link #getCause()} method).  (A <tt>null</tt> value is
     *                permitted, and indicates that the cause is nonexistent or
     *                unknown.)
     * @since 1.4
     */
    public NotificationNotSentException(String message, Throwable cause) {
        super(message, cause);
    }
}