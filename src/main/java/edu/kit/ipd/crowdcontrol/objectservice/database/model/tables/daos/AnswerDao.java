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
public class AnswerDao extends org.jooq.impl.DAOImpl<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.AnswerRecord, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Answer, java.lang.Integer> {

	/**
	 * Create a new AnswerDao without any configuration
	 */
	public AnswerDao() {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Answer.ANSWER, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Answer.class);
	}

	/**
	 * Create a new AnswerDao with an attached configuration
	 */
	public AnswerDao(org.jooq.Configuration configuration) {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Answer.ANSWER, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Answer.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Answer object) {
		return object.getIdanswer();
	}

	/**
	 * Fetch records that have <code>idAnswer IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Answer> fetchByIdanswer(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Answer.ANSWER.IDANSWER, values);
	}

	/**
	 * Fetch a unique record that has <code>idAnswer = value</code>
	 */
	public edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Answer fetchOneByIdanswer(java.lang.Integer value) {
		return fetchOne(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Answer.ANSWER.IDANSWER, value);
	}

	/**
	 * Fetch records that have <code>task IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Answer> fetchByTask(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Answer.ANSWER.TASK, values);
	}

	/**
	 * Fetch records that have <code>answer IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Answer> fetchByAnswer(java.lang.String... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Answer.ANSWER.ANSWER_, values);
	}

	/**
	 * Fetch records that have <code>timestamp IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Answer> fetchByTimestamp(java.sql.Timestamp... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Answer.ANSWER.TIMESTAMP, values);
	}

	/**
	 * Fetch records that have <code>worker_id IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Answer> fetchByWorkerId(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Answer.ANSWER.WORKER_ID, values);
	}

	/**
	 * Fetch records that have <code>quality IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Answer> fetchByQuality(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Answer.ANSWER.QUALITY, values);
	}
}