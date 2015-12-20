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
public class Populationanswers extends org.jooq.impl.TableImpl<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.PopulationanswersRecord> {

	private static final long serialVersionUID = 471752338;

	/**
	 * The singleton instance of <code>crowdcontrol.PopulationAnswers</code>
	 */
	public static final edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Populationanswers POPULATIONANSWERS = new edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Populationanswers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.PopulationanswersRecord> getRecordType() {
		return edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.PopulationanswersRecord.class;
	}

	/**
	 * The column <code>crowdcontrol.PopulationAnswers.idPopulationAnswers</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.PopulationanswersRecord, java.lang.Integer> IDPOPULATIONANSWERS = createField("idPopulationAnswers", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.PopulationAnswers.population</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.PopulationanswersRecord, java.lang.Integer> POPULATION = createField("population", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>crowdcontrol.PopulationAnswers.answer</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.PopulationanswersRecord, java.lang.String> ANSWER = createField("answer", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * Create a <code>crowdcontrol.PopulationAnswers</code> table reference
	 */
	public Populationanswers() {
		this("PopulationAnswers", null);
	}

	/**
	 * Create an aliased <code>crowdcontrol.PopulationAnswers</code> table reference
	 */
	public Populationanswers(java.lang.String alias) {
		this(alias, edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Populationanswers.POPULATIONANSWERS);
	}

	private Populationanswers(java.lang.String alias, org.jooq.Table<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.PopulationanswersRecord> aliased) {
		this(alias, aliased, null);
	}

	private Populationanswers(java.lang.String alias, org.jooq.Table<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.PopulationanswersRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, edu.ipd.kit.crowdcontrol.objectservice.database.model.Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.PopulationanswersRecord> getPrimaryKey() {
		return edu.ipd.kit.crowdcontrol.objectservice.database.model.Keys.KEY_POPULATIONANSWERS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.PopulationanswersRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.PopulationanswersRecord>>asList(edu.ipd.kit.crowdcontrol.objectservice.database.model.Keys.KEY_POPULATIONANSWERS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.PopulationanswersRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.PopulationanswersRecord, ?>>asList(edu.ipd.kit.crowdcontrol.objectservice.database.model.Keys.POPULATIONANSWER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Populationanswers as(java.lang.String alias) {
		return new edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Populationanswers(alias, this);
	}

	/**
	 * Rename this table
	 */
	public edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Populationanswers rename(java.lang.String name) {
		return new edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Populationanswers(name, null);
	}
}
