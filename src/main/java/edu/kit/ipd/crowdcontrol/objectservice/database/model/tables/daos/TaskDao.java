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
public class TaskDao extends org.jooq.impl.DAOImpl<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TaskRecord, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Task, java.lang.Integer> {

	/**
	 * Create a new TaskDao without any configuration
	 */
	public TaskDao() {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Task.TASK, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Task.class);
	}

	/**
	 * Create a new TaskDao with an attached configuration
	 */
	public TaskDao(org.jooq.Configuration configuration) {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Task.TASK, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Task.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Task object) {
		return object.getIdTask();
	}

	/**
	 * Fetch records that have <code>id_task IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Task> fetchByIdTask(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Task.TASK.ID_TASK, values);
	}

	/**
	 * Fetch a unique record that has <code>id_task = value</code>
	 */
	public edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Task fetchOneByIdTask(java.lang.Integer value) {
		return fetchOne(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Task.TASK.ID_TASK, value);
	}

	/**
	 * Fetch records that have <code>experiment_platform IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Task> fetchByExperimentPlatform(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Task.TASK.EXPERIMENT_PLATFORM, values);
	}

	/**
	 * Fetch records that have <code>platform_data IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Task> fetchByPlatformData(java.lang.String... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Task.TASK.PLATFORM_DATA, values);
	}

	/**
	 * Fetch records that have <code>stopgap IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Task> fetchByStopgap(edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.TaskStopgap... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Task.TASK.STOPGAP, values);
	}
}
