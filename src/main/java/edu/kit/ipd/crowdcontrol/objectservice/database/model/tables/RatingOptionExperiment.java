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
public class RatingOptionExperiment extends org.jooq.impl.TableImpl<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.RatingOptionExperimentRecord> {

	private static final long serialVersionUID = 33653590;

	/**
	 * The singleton instance of <code>crowdcontrol.Rating_Option_Experiment</code>
	 */
	public static final edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.RatingOptionExperiment RATING_OPTION_EXPERIMENT = new edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.RatingOptionExperiment();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.RatingOptionExperimentRecord> getRecordType() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.RatingOptionExperimentRecord.class;
	}

	/**
	 * The column <code>crowdcontrol.Rating_Option_Experiment.id_Rating_Option_Experiment</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.RatingOptionExperimentRecord, java.lang.Integer> ID_RATING_OPTION_EXPERIMENT = createField("id_Rating_Option_Experiment", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Rating_Option_Experiment.name</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.RatingOptionExperimentRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.length(65535).nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Rating_Option_Experiment.value</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.RatingOptionExperimentRecord, java.lang.Integer> VALUE = createField("value", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Rating_Option_Experiment.experiment</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.RatingOptionExperimentRecord, java.lang.Integer> EXPERIMENT = createField("experiment", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>crowdcontrol.Rating_Option_Experiment</code> table reference
	 */
	public RatingOptionExperiment() {
		this("Rating_Option_Experiment", null);
	}

	/**
	 * Create an aliased <code>crowdcontrol.Rating_Option_Experiment</code> table reference
	 */
	public RatingOptionExperiment(java.lang.String alias) {
		this(alias, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.RatingOptionExperiment.RATING_OPTION_EXPERIMENT);
	}

	private RatingOptionExperiment(java.lang.String alias, org.jooq.Table<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.RatingOptionExperimentRecord> aliased) {
		this(alias, aliased, null);
	}

	private RatingOptionExperiment(java.lang.String alias, org.jooq.Table<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.RatingOptionExperimentRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, edu.kit.ipd.crowdcontrol.objectservice.database.model.Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.RatingOptionExperimentRecord, java.lang.Integer> getIdentity() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.Keys.IDENTITY_RATING_OPTION_EXPERIMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.RatingOptionExperimentRecord> getPrimaryKey() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.Keys.KEY_RATING_OPTION_EXPERIMENT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.RatingOptionExperimentRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.RatingOptionExperimentRecord>>asList(edu.kit.ipd.crowdcontrol.objectservice.database.model.Keys.KEY_RATING_OPTION_EXPERIMENT_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.RatingOptionExperimentRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.RatingOptionExperimentRecord, ?>>asList(edu.kit.ipd.crowdcontrol.objectservice.database.model.Keys.RATING_OPTIONS_EXPERIMENT_REFERENCE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.RatingOptionExperiment as(java.lang.String alias) {
		return new edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.RatingOptionExperiment(alias, this);
	}

	/**
	 * Rename this table
	 */
	public edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.RatingOptionExperiment rename(java.lang.String name) {
		return new edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.RatingOptionExperiment(name, null);
	}
}