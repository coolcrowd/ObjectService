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
public class CalibrationResultRecord extends org.jooq.impl.UpdatableRecordImpl<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.CalibrationResultRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 843737730;

	/**
	 * Setter for <code>crowdcontrol.Calibration_Result.id_calibration_result</code>.
	 */
	public void setIdCalibrationResult(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Calibration_Result.id_calibration_result</code>.
	 */
	public java.lang.Integer getIdCalibrationResult() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>crowdcontrol.Calibration_Result.worker</code>.
	 */
	public void setWorker(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Calibration_Result.worker</code>.
	 */
	public java.lang.Integer getWorker() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>crowdcontrol.Calibration_Result.answer</code>.
	 */
	public void setAnswer(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Calibration_Result.answer</code>.
	 */
	public java.lang.Integer getAnswer() {
		return (java.lang.Integer) getValue(2);
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
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.CalibrationResult.CALIBRATION_RESULT.ID_CALIBRATION_RESULT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.CalibrationResult.CALIBRATION_RESULT.WORKER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.CalibrationResult.CALIBRATION_RESULT.ANSWER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIdCalibrationResult();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getWorker();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getAnswer();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CalibrationResultRecord value1(java.lang.Integer value) {
		setIdCalibrationResult(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CalibrationResultRecord value2(java.lang.Integer value) {
		setWorker(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CalibrationResultRecord value3(java.lang.Integer value) {
		setAnswer(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CalibrationResultRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CalibrationResultRecord
	 */
	public CalibrationResultRecord() {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.CalibrationResult.CALIBRATION_RESULT);
	}

	/**
	 * Create a detached, initialised CalibrationResultRecord
	 */
	public CalibrationResultRecord(java.lang.Integer idCalibrationResult, java.lang.Integer worker, java.lang.Integer answer) {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.CalibrationResult.CALIBRATION_RESULT);

		setValue(0, idCalibrationResult);
		setValue(1, worker);
		setValue(2, answer);
	}
}