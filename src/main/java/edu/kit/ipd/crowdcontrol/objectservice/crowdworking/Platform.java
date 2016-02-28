package edu.kit.ipd.crowdcontrol.objectservice.crowdworking;

import edu.kit.ipd.crowdcontrol.objectservice.proto.Experiment;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

/**
 * Created by marcel on 19.01.16.
 */
public interface Platform {
    /**
    * if the Platform has his own payment service the implementation can return not none.
    * @return the value to indicate if it supports self paying or not.
    */
    Optional<Payment> getPayment();

    /**
     * if the Platform has his own worker identification the interface can be returned here.
     * if passed null it should return something if getWorker is supported.
     * @param params The parameters which were sent by a platform
     * @return the value to indicate if it supports worker identification or not.
     * @throws UnidentifiedWorkerException if passed invalid params
     */
    Optional<WorkerIdentification> getWorker(Map<String, String[]> params) throws UnidentifiedWorkerException;

    /**
     * Get the name of this platform
     * @return a String
     */
    String getName();

    /**
     * Returns the ID of the platform.
     * <p>
     * The String must be unique, must match {@code [a-z0-9_]+} and not change since it is the only way other services can
     * communicate with the platform.
     * @return a String
     */
    String getID();

    /**
     * Publish a passed experiment on the platform
     * @param experiment the object which should be published
     * @return this should return a unique string which is used to identify the published experiment later.
     *         Or finish with a exception if the publishing failed.
     */
    CompletableFuture<String> publishTask(Experiment experiment);

    /**
     * Unpublish the given id from the platform, after this call no worker should be able access the before published experiment.
     * @param id the id of the before published experiment
     * @return true on success, false or a exception if it failed
     */
    CompletableFuture<Boolean> unpublishTask(String id);

    /**
     * Update the published task, with the given id, to the parameters of experiment
     * @param id The id of the published Task
     * @param experiment The experiment with the new parameters
     * @return The new id or a Exception if the update failed.
     */
    CompletableFuture<String> updateTask(String id, Experiment experiment);

    /**
     * Returns if calibration questions can be asked on this platform
     * @return true or false
     */
    Boolean isCalibrationAllowed();
}
