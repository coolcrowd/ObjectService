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
public class PopulationanswersDao extends org.jooq.impl.DAOImpl<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.PopulationanswersRecord, edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.pojos.Populationanswers, java.lang.Integer> {

	/**
	 * Create a new PopulationanswersDao without any configuration
	 */
	public PopulationanswersDao() {
		super(edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Populationanswers.POPULATIONANSWERS, edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.pojos.Populationanswers.class);
	}

	/**
	 * Create a new PopulationanswersDao with an attached configuration
	 */
	public PopulationanswersDao(org.jooq.Configuration configuration) {
		super(edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Populationanswers.POPULATIONANSWERS, edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.pojos.Populationanswers.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.pojos.Populationanswers object) {
		return object.getIdpopulationanswers();
	}

	/**
	 * Fetch records that have <code>idPopulationAnswers IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.pojos.Populationanswers> fetchByIdpopulationanswers(java.lang.Integer... values) {
		return fetch(edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Populationanswers.POPULATIONANSWERS.IDPOPULATIONANSWERS, values);
	}

	/**
	 * Fetch a unique record that has <code>idPopulationAnswers = value</code>
	 */
	public edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.pojos.Populationanswers fetchOneByIdpopulationanswers(java.lang.Integer value) {
		return fetchOne(edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Populationanswers.POPULATIONANSWERS.IDPOPULATIONANSWERS, value);
	}

	/**
	 * Fetch records that have <code>population IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.pojos.Populationanswers> fetchByPopulation(java.lang.Integer... values) {
		return fetch(edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Populationanswers.POPULATIONANSWERS.POPULATION, values);
	}

	/**
	 * Fetch records that have <code>answer IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.pojos.Populationanswers> fetchByAnswer(java.lang.String... values) {
		return fetch(edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Populationanswers.POPULATIONANSWERS.ANSWER, values);
	}
}
