/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PopulationDao extends org.jooq.impl.DAOImpl<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.PopulationRecord, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Population, java.lang.Integer> {

	/**
	 * Create a new PopulationDao without any configuration
	 */
	public PopulationDao() {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Population.POPULATION, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Population.class);
	}

	/**
	 * Create a new PopulationDao with an attached configuration
	 */
	public PopulationDao(org.jooq.Configuration configuration) {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Population.POPULATION, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Population.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Population object) {
		return object.getIdPopulation();
	}

	/**
	 * Fetch records that have <code>id_population IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Population> fetchByIdPopulation(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Population.POPULATION.ID_POPULATION, values);
	}

	/**
	 * Fetch a unique record that has <code>id_population = value</code>
	 */
	public edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Population fetchOneByIdPopulation(java.lang.Integer value) {
		return fetchOne(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Population.POPULATION.ID_POPULATION, value);
	}

	/**
	 * Fetch records that have <code>property IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Population> fetchByProperty(java.lang.String... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Population.POPULATION.PROPERTY, values);
	}

	/**
	 * Fetch records that have <code>description IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Population> fetchByDescription(java.lang.String... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Population.POPULATION.DESCRIPTION, values);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Population> fetchByName(java.lang.String... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Population.POPULATION.NAME, values);
	}

	/**
	 * Fetch records that have <code>experiment IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Population> fetchByExperiment(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Population.POPULATION.EXPERIMENT, values);
	}

	/**
	 * Fetch a unique record that has <code>experiment = value</code>
	 */
	public edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Population fetchOneByExperiment(java.lang.Integer value) {
		return fetchOne(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Population.POPULATION.EXPERIMENT, value);
	}
}