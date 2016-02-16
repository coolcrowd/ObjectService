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
public class ExperimentsCalibrationDao extends org.jooq.impl.DAOImpl<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ExperimentsCalibrationRecord, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.ExperimentsCalibration, java.lang.Integer> {

	/**
	 * Create a new ExperimentsCalibrationDao without any configuration
	 */
	public ExperimentsCalibrationDao() {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ExperimentsCalibration.EXPERIMENTS_CALIBRATION, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.ExperimentsCalibration.class);
	}

	/**
	 * Create a new ExperimentsCalibrationDao with an attached configuration
	 */
	public ExperimentsCalibrationDao(org.jooq.Configuration configuration) {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ExperimentsCalibration.EXPERIMENTS_CALIBRATION, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.ExperimentsCalibration.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.ExperimentsCalibration object) {
		return object.getIdExperimentsCalibration();
	}

	/**
	 * Fetch records that have <code>id_experiments_calibration IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.ExperimentsCalibration> fetchByIdExperimentsCalibration(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ExperimentsCalibration.EXPERIMENTS_CALIBRATION.ID_EXPERIMENTS_CALIBRATION, values);
	}

	/**
	 * Fetch a unique record that has <code>id_experiments_calibration = value</code>
	 */
	public edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.ExperimentsCalibration fetchOneByIdExperimentsCalibration(java.lang.Integer value) {
		return fetchOne(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ExperimentsCalibration.EXPERIMENTS_CALIBRATION.ID_EXPERIMENTS_CALIBRATION, value);
	}

	/**
	 * Fetch records that have <code>experiments_platform IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.ExperimentsCalibration> fetchByExperimentsPlatform(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ExperimentsCalibration.EXPERIMENTS_CALIBRATION.EXPERIMENTS_PLATFORM, values);
	}

	/**
	 * Fetch records that have <code>answer IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.ExperimentsCalibration> fetchByAnswer(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ExperimentsCalibration.EXPERIMENTS_CALIBRATION.ANSWER, values);
	}

	/**
	 * Fetch records that have <code>not IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.ExperimentsCalibration> fetchByNot(java.lang.Boolean... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ExperimentsCalibration.EXPERIMENTS_CALIBRATION.NOT, values);
	}
}
