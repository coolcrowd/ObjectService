/**
 * This class is generated by jOOQ
 */
package edu.ipd.kit.crowdcontrol.objectservice.database.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Worker extends org.jooq.impl.TableImpl<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.WorkerRecord> {

	private static final long serialVersionUID = -2095837474;

	/**
	 * The singleton instance of <code>crowdcontrol.Worker</code>
	 */
	public static final edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Worker WORKER = new edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Worker();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.WorkerRecord> getRecordType() {
		return edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.WorkerRecord.class;
	}

	/**
	 * The column <code>crowdcontrol.Worker.idWorker</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.WorkerRecord, java.lang.Integer> IDWORKER = createField("idWorker", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Worker.identification</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.WorkerRecord, java.lang.String> IDENTIFICATION = createField("identification", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>crowdcontrol.Worker.platform</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.WorkerRecord, java.lang.Integer> PLATFORM = createField("platform", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Worker.email</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.WorkerRecord, java.lang.String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * Create a <code>crowdcontrol.Worker</code> table reference
	 */
	public Worker() {
		this("Worker", null);
	}

	/**
	 * Create an aliased <code>crowdcontrol.Worker</code> table reference
	 */
	public Worker(java.lang.String alias) {
		this(alias, edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Worker.WORKER);
	}

	private Worker(java.lang.String alias, org.jooq.Table<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.WorkerRecord> aliased) {
		this(alias, aliased, null);
	}

	private Worker(java.lang.String alias, org.jooq.Table<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.WorkerRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, edu.ipd.kit.crowdcontrol.objectservice.database.model.Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.WorkerRecord> getPrimaryKey() {
		return edu.ipd.kit.crowdcontrol.objectservice.database.model.Keys.KEY_WORKER_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.WorkerRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.WorkerRecord>>asList(edu.ipd.kit.crowdcontrol.objectservice.database.model.Keys.KEY_WORKER_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.WorkerRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.WorkerRecord, ?>>asList(edu.ipd.kit.crowdcontrol.objectservice.database.model.Keys.WORKERORIGIN);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Worker as(java.lang.String alias) {
		return new edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Worker(alias, this);
	}

	/**
	 * Rename this table
	 */
	public edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Worker rename(java.lang.String name) {
		return new edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Worker(name, null);
	}
}
