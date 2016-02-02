package edu.kit.ipd.crowdcontrol.objectservice.crowdworking.mturk;

import edu.kit.ipd.crowdcontrol.objectservice.crowdworking.mturk.Utils;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

/**
 * Holds data and functions which are used for the same connection to a mturk instance
 * @author MarcelHollerbach
 * @version 1.0
 */
public class MTurkConnection {
    private final String url;
    private final Map<String, Object> staticDefaultValues;
    private final String awsSecretAccessKey;
    private final SimpleDateFormat simpleDateFormat;

    public MTurkConnection(String awsAccessKeyId, String awsSecretAccessKey, String url) {
        this.awsSecretAccessKey = awsSecretAccessKey;
        this.url = url;

        staticDefaultValues = new HashMap<>();
        staticDefaultValues.put("AWSAccessKeyId",awsAccessKeyId);
        staticDefaultValues.put("Service", "AWSMechanicalTurkRequester");

        //must be 2005-01-31T23:59:59Z.
        simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd'T'HH:mm:ssZ");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
    }

    /**
     * Get the Url this instance is running on
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * Get the secret Access Key of the given instance
     * @return
     */
    public String getAwsSecretAccessKey() {
        return awsSecretAccessKey;
    }

    public Map<String, Object> getCallParameter(String operation, String responseGroup, String version) {
        Map<String, Object> result = new HashMap<>();

        result.putAll(staticDefaultValues);
        result.put("Operation", operation);
        try {
            result.put("Signature", Utils.calculateRequestSignature("AWSMechanicalTurkRequester",
                    operation, simpleDateFormat.format(new Date()),
                    awsSecretAccessKey));
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            e.printStackTrace();
        }

        result.put("Timestamp", simpleDateFormat.format(new Date()));
        result.put("ResponseGroup", responseGroup);
        result.put("Version", version);
        return result;
    }
}
