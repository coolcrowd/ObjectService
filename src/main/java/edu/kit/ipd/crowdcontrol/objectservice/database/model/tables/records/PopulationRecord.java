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
public class PopulationRecord extends org.jooq.impl.UpdatableRecordImpl<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.PopulationRecord> implements org.jooq.Record5<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = 847223772;

	/**
	 * Setter for <code>crowdcontrol.Population.idPopulation</code>.
	 */
	public void setIdpopulation(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Population.idPopulation</code>.
	 */
	public java.lang.Integer getIdpopulation() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>crowdcontrol.Population.property</code>.
	 */
	public void setProperty(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Population.property</code>.
	 */
	public java.lang.String getProperty() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>crowdcontrol.Population.description</code>.
	 */
	public void setDescription(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Population.description</code>.
	 */
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>crowdcontrol.Population.name</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Population.name</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>crowdcontrol.Population.experiment</code>.
	 */
	public void setExperiment(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Population.experiment</code>.
	 */
	public java.lang.Integer getExperiment() {
		return (java.lang.Integer) getValue(4);
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
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Population.POPULATION.IDPOPULATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Population.POPULATION.PROPERTY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Population.POPULATION.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Population.POPULATION.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Population.POPULATION.EXPERIMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIdpopulation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getProperty();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getExperiment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PopulationRecord value1(java.lang.Integer value) {
		setIdpopulation(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PopulationRecord value2(java.lang.String value) {
		setProperty(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PopulationRecord value3(java.lang.String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PopulationRecord value4(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PopulationRecord value5(java.lang.Integer value) {
		setExperiment(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PopulationRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.Integer value5) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PopulationRecord
	 */
	public PopulationRecord() {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Population.POPULATION);
	}

	/**
	 * Create a detached, initialised PopulationRecord
	 */
	public PopulationRecord(java.lang.Integer idpopulation, java.lang.String property, java.lang.String description, java.lang.String name, java.lang.Integer experiment) {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Population.POPULATION);

		setValue(0, idpopulation);
		setValue(1, property);
		setValue(2, description);
		setValue(3, name);
		setValue(4, experiment);
	}
}