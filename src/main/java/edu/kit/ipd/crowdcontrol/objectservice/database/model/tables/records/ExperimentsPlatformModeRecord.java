/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExperimentsPlatformModeRecord extends org.jooq.impl.UpdatableRecordImpl<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ExperimentsPlatformModeRecord> implements org.jooq.Record4<java.lang.Integer, java.lang.Integer, edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.ExperimentsPlatformModeStopgap, java.sql.Timestamp> {

	private static final long serialVersionUID = 2068570593;

	/**
	 * Setter for <code>crowdcontrol.Experiments_Platform_Mode.idExperiments_Platform_Stopgap</code>.
	 */
	public void setIdexperimentsPlatformStopgap(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiments_Platform_Mode.idExperiments_Platform_Stopgap</code>.
	 */
	public java.lang.Integer getIdexperimentsPlatformStopgap() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>crowdcontrol.Experiments_Platform_Mode.experiments_platform</code>.
	 */
	public void setExperimentsPlatform(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiments_Platform_Mode.experiments_platform</code>.
	 */
	public java.lang.Integer getExperimentsPlatform() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>crowdcontrol.Experiments_Platform_Mode.stopgap</code>.
	 */
	public void setStopgap(edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.ExperimentsPlatformModeStopgap value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiments_Platform_Mode.stopgap</code>.
	 */
	public edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.ExperimentsPlatformModeStopgap getStopgap() {
		return (edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.ExperimentsPlatformModeStopgap) getValue(2);
	}

	/**
	 * Setter for <code>crowdcontrol.Experiments_Platform_Mode.timestamp</code>.
	 */
	public void setTimestamp(java.sql.Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiments_Platform_Mode.timestamp</code>.
	 */
	public java.sql.Timestamp getTimestamp() {
		return (java.sql.Timestamp) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Integer, edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.ExperimentsPlatformModeStopgap, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Integer, edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.ExperimentsPlatformModeStopgap, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ExperimentsPlatformMode.EXPERIMENTS_PLATFORM_MODE.IDEXPERIMENTS_PLATFORM_STOPGAP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ExperimentsPlatformMode.EXPERIMENTS_PLATFORM_MODE.EXPERIMENTS_PLATFORM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.ExperimentsPlatformModeStopgap> field3() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ExperimentsPlatformMode.EXPERIMENTS_PLATFORM_MODE.STOPGAP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ExperimentsPlatformMode.EXPERIMENTS_PLATFORM_MODE.TIMESTAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIdexperimentsPlatformStopgap();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getExperimentsPlatform();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.ExperimentsPlatformModeStopgap value3() {
		return getStopgap();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getTimestamp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentsPlatformModeRecord value1(java.lang.Integer value) {
		setIdexperimentsPlatformStopgap(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentsPlatformModeRecord value2(java.lang.Integer value) {
		setExperimentsPlatform(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentsPlatformModeRecord value3(edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.ExperimentsPlatformModeStopgap value) {
		setStopgap(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentsPlatformModeRecord value4(java.sql.Timestamp value) {
		setTimestamp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentsPlatformModeRecord values(java.lang.Integer value1, java.lang.Integer value2, edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.ExperimentsPlatformModeStopgap value3, java.sql.Timestamp value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ExperimentsPlatformModeRecord
	 */
	public ExperimentsPlatformModeRecord() {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ExperimentsPlatformMode.EXPERIMENTS_PLATFORM_MODE);
	}

	/**
	 * Create a detached, initialised ExperimentsPlatformModeRecord
	 */
	public ExperimentsPlatformModeRecord(java.lang.Integer idexperimentsPlatformStopgap, java.lang.Integer experimentsPlatform, edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.ExperimentsPlatformModeStopgap stopgap, java.sql.Timestamp timestamp) {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ExperimentsPlatformMode.EXPERIMENTS_PLATFORM_MODE);

		setValue(0, idexperimentsPlatformStopgap);
		setValue(1, experimentsPlatform);
		setValue(2, stopgap);
		setValue(3, timestamp);
	}
}