package edu.kit.ipd.crowdcontrol.objectservice.config;

/**
 * Config of which is saved in config file
 * @author MarcelHollerbach
 * @version 1.0
 */
public class Config {
    /**
     * Databasepart of the config
     */
    public Database database;
    /**
     * all specified platforms in the config
     */
    public ConfigPlatform[] platforms;
}