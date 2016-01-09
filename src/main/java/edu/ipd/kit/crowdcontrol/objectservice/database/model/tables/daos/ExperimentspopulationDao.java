/**
 * This class is generated by jOOQ
 */
package edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExperimentspopulationDao extends org.jooq.impl.DAOImpl<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.ExperimentspopulationRecord, edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.pojos.Experimentspopulation, java.lang.String> {

	/**
	 * Create a new ExperimentspopulationDao without any configuration
	 */
	public ExperimentspopulationDao() {
		super(edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Experimentspopulation.EXPERIMENTSPOPULATION, edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.pojos.Experimentspopulation.class);
	}

	/**
	 * Create a new ExperimentspopulationDao with an attached configuration
	 */
	public ExperimentspopulationDao(org.jooq.Configuration configuration) {
		super(edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Experimentspopulation.EXPERIMENTSPOPULATION, edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.pojos.Experimentspopulation.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.String getId(edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.pojos.Experimentspopulation object) {
		return object.getIdexperimentspopulation();
	}

	/**
	 * Fetch records that have <code>idExperimentsPopulation IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.pojos.Experimentspopulation> fetchByIdexperimentspopulation(java.lang.String... values) {
		return fetch(edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Experimentspopulation.EXPERIMENTSPOPULATION.IDEXPERIMENTSPOPULATION, values);
	}

	/**
	 * Fetch a unique record that has <code>idExperimentsPopulation = value</code>
	 */
	public edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.pojos.Experimentspopulation fetchOneByIdexperimentspopulation(java.lang.String value) {
		return fetchOne(edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Experimentspopulation.EXPERIMENTSPOPULATION.IDEXPERIMENTSPOPULATION, value);
	}

	/**
	 * Fetch records that have <code>population_user IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.pojos.Experimentspopulation> fetchByPopulationUser(java.lang.Integer... values) {
		return fetch(edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Experimentspopulation.EXPERIMENTSPOPULATION.POPULATION_USER, values);
	}

	/**
	 * Fetch records that have <code>correct_answer IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.pojos.Experimentspopulation> fetchByCorrectAnswer(java.lang.Integer... values) {
		return fetch(edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Experimentspopulation.EXPERIMENTSPOPULATION.CORRECT_ANSWER, values);
	}

	/**
	 * Fetch records that have <code>referenced_platform IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.pojos.Experimentspopulation> fetchByReferencedPlatform(java.lang.String... values) {
		return fetch(edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Experimentspopulation.EXPERIMENTSPOPULATION.REFERENCED_PLATFORM, values);
	}

	/**
	 * Fetch records that have <code>not IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.pojos.Experimentspopulation> fetchByNot(java.lang.Boolean... values) {
		return fetch(edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Experimentspopulation.EXPERIMENTSPOPULATION.NOT, values);
	}
}
