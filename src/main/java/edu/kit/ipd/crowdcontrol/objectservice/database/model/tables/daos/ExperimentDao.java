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
public class ExperimentDao extends org.jooq.impl.DAOImpl<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ExperimentRecord, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Experiment, java.lang.Integer> {

	/**
	 * Create a new ExperimentDao without any configuration
	 */
	public ExperimentDao() {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Experiment.EXPERIMENT, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Experiment.class);
	}

	/**
	 * Create a new ExperimentDao with an attached configuration
	 */
	public ExperimentDao(org.jooq.Configuration configuration) {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Experiment.EXPERIMENT, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Experiment.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Experiment object) {
		return object.getIdexperiment();
	}

	/**
	 * Fetch records that have <code>idexperiment IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Experiment> fetchByIdexperiment(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Experiment.EXPERIMENT.IDEXPERIMENT, values);
	}

	/**
	 * Fetch a unique record that has <code>idexperiment = value</code>
	 */
	public edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Experiment fetchOneByIdexperiment(java.lang.Integer value) {
		return fetchOne(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Experiment.EXPERIMENT.IDEXPERIMENT, value);
	}

	/**
	 * Fetch records that have <code>rating_options IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Experiment> fetchByRatingOptions(java.lang.Object... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Experiment.EXPERIMENT.RATING_OPTIONS, values);
	}

	/**
	 * Fetch records that have <code>titel IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Experiment> fetchByTitel(java.lang.String... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Experiment.EXPERIMENT.TITEL, values);
	}

	/**
	 * Fetch records that have <code>description IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Experiment> fetchByDescription(java.lang.String... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Experiment.EXPERIMENT.DESCRIPTION, values);
	}

	/**
	 * Fetch records that have <code>ratings_per_answer IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Experiment> fetchByRatingsPerAnswer(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Experiment.EXPERIMENT.RATINGS_PER_ANSWER, values);
	}

	/**
	 * Fetch records that have <code>algorithm_task_chooser IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Experiment> fetchByAlgorithmTaskChooser(java.lang.String... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Experiment.EXPERIMENT.ALGORITHM_TASK_CHOOSER, values);
	}

	/**
	 * Fetch records that have <code>algorithm_quality_answer IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Experiment> fetchByAlgorithmQualityAnswer(java.lang.String... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Experiment.EXPERIMENT.ALGORITHM_QUALITY_ANSWER, values);
	}

	/**
	 * Fetch records that have <code>algorithm_quality_rating IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Experiment> fetchByAlgorithmQualityRating(java.lang.String... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Experiment.EXPERIMENT.ALGORITHM_QUALITY_RATING, values);
	}

	/**
	 * Fetch records that have <code>base_payment IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Experiment> fetchByBasePayment(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Experiment.EXPERIMENT.BASE_PAYMENT, values);
	}

	/**
	 * Fetch records that have <code>bonus_answer IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Experiment> fetchByBonusAnswer(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Experiment.EXPERIMENT.BONUS_ANSWER, values);
	}

	/**
	 * Fetch records that have <code>bonus_rating IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Experiment> fetchByBonusRating(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Experiment.EXPERIMENT.BONUS_RATING, values);
	}

	/**
	 * Fetch records that have <code>template_data IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Experiment> fetchByTemplateData(java.lang.String... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Experiment.EXPERIMENT.TEMPLATE_DATA, values);
	}

	/**
	 * Fetch records that have <code>template IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Experiment> fetchByTemplate(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Experiment.EXPERIMENT.TEMPLATE, values);
	}

	/**
	 * Fetch records that have <code>answer_type IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Experiment> fetchByAnswerType(java.lang.String... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Experiment.EXPERIMENT.ANSWER_TYPE, values);
	}
}