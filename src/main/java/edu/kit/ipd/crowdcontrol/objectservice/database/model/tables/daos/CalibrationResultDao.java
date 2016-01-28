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
public class CalibrationResultDao extends org.jooq.impl.DAOImpl<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.CalibrationResultRecord, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.CalibrationResult, java.lang.Integer> {

	/**
	 * Create a new CalibrationResultDao without any configuration
	 */
	public CalibrationResultDao() {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.CalibrationResult.CALIBRATION_RESULT, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.CalibrationResult.class);
	}

	/**
	 * Create a new CalibrationResultDao with an attached configuration
	 */
	public CalibrationResultDao(org.jooq.Configuration configuration) {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.CalibrationResult.CALIBRATION_RESULT, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.CalibrationResult.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.CalibrationResult object) {
		return object.getIdCalibrationResult();
	}

	/**
	 * Fetch records that have <code>id_calibration_result IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.CalibrationResult> fetchByIdCalibrationResult(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.CalibrationResult.CALIBRATION_RESULT.ID_CALIBRATION_RESULT, values);
	}

	/**
	 * Fetch a unique record that has <code>id_calibration_result = value</code>
	 */
	public edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.CalibrationResult fetchOneByIdCalibrationResult(java.lang.Integer value) {
		return fetchOne(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.CalibrationResult.CALIBRATION_RESULT.ID_CALIBRATION_RESULT, value);
	}

	/**
	 * Fetch records that have <code>worker IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.CalibrationResult> fetchByWorker(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.CalibrationResult.CALIBRATION_RESULT.WORKER, values);
	}

	/**
	 * Fetch records that have <code>answer IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.CalibrationResult> fetchByAnswer(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.CalibrationResult.CALIBRATION_RESULT.ANSWER, values);
	}
}