/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.objectservice.database.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExperimentsPlatformStatus extends org.jooq.impl.TableImpl<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ExperimentsPlatformStatusRecord> {

	private static final long serialVersionUID = -791306196;

	/**
	 * The singleton instance of <code>crowdcontrol.Experiments_Platform_Status</code>
	 */
	public static final edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ExperimentsPlatformStatus EXPERIMENTS_PLATFORM_STATUS = new edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ExperimentsPlatformStatus();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ExperimentsPlatformStatusRecord> getRecordType() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ExperimentsPlatformStatusRecord.class;
	}

	/**
	 * The column <code>crowdcontrol.Experiments_Platform_Status.idExperiments_Platform_Status</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ExperimentsPlatformStatusRecord, java.lang.Integer> IDEXPERIMENTS_PLATFORM_STATUS = createField("idExperiments_Platform_Status", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Experiments_Platform_Status.status</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ExperimentsPlatformStatusRecord, edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.ExperimentsPlatformStatusStatus> STATUS = createField("status", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.ExperimentsPlatformStatusStatus.class), this, "");

	/**
	 * The column <code>crowdcontrol.Experiments_Platform_Status.timestamp</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ExperimentsPlatformStatusRecord, java.sql.Timestamp> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>crowdcontrol.Experiments_Platform_Status.platform</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ExperimentsPlatformStatusRecord, java.lang.Integer> PLATFORM = createField("platform", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>crowdcontrol.Experiments_Platform_Status</code> table reference
	 */
	public ExperimentsPlatformStatus() {
		this("Experiments_Platform_Status", null);
	}

	/**
	 * Create an aliased <code>crowdcontrol.Experiments_Platform_Status</code> table reference
	 */
	public ExperimentsPlatformStatus(java.lang.String alias) {
		this(alias, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ExperimentsPlatformStatus.EXPERIMENTS_PLATFORM_STATUS);
	}

	private ExperimentsPlatformStatus(java.lang.String alias, org.jooq.Table<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ExperimentsPlatformStatusRecord> aliased) {
		this(alias, aliased, null);
	}

	private ExperimentsPlatformStatus(java.lang.String alias, org.jooq.Table<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ExperimentsPlatformStatusRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, edu.kit.ipd.crowdcontrol.objectservice.database.model.Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ExperimentsPlatformStatusRecord> getPrimaryKey() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.Keys.KEY_EXPERIMENTS_PLATFORM_STATUS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ExperimentsPlatformStatusRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ExperimentsPlatformStatusRecord>>asList(edu.kit.ipd.crowdcontrol.objectservice.database.model.Keys.KEY_EXPERIMENTS_PLATFORM_STATUS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ExperimentsPlatformStatusRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ExperimentsPlatformStatusRecord, ?>>asList(edu.kit.ipd.crowdcontrol.objectservice.database.model.Keys.STATUS_FOR_PLATFORM);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ExperimentsPlatformStatus as(java.lang.String alias) {
		return new edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ExperimentsPlatformStatus(alias, this);
	}

	/**
	 * Rename this table
	 */
	public edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ExperimentsPlatformStatus rename(java.lang.String name) {
		return new edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ExperimentsPlatformStatus(name, null);
	}
}
