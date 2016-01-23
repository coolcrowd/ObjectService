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
public class ChosenRatingQualityParamRecord extends org.jooq.impl.UpdatableRecordImpl<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ChosenRatingQualityParamRecord> implements org.jooq.Record4<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 519963185;

	/**
	 * Setter for <code>crowdcontrol.Chosen_Rating_Quality_Param.id_Algorithm_Rating_Quality_Chosen</code>.
	 */
	public void setIdAlgorithmRatingQualityChosen(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Chosen_Rating_Quality_Param.id_Algorithm_Rating_Quality_Chosen</code>.
	 */
	public java.lang.Integer getIdAlgorithmRatingQualityChosen() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>crowdcontrol.Chosen_Rating_Quality_Param.value</code>.
	 */
	public void setValue(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Chosen_Rating_Quality_Param.value</code>.
	 */
	public java.lang.String getValue() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>crowdcontrol.Chosen_Rating_Quality_Param.experiment</code>.
	 */
	public void setExperiment(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Chosen_Rating_Quality_Param.experiment</code>.
	 */
	public java.lang.Integer getExperiment() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>crowdcontrol.Chosen_Rating_Quality_Param.param</code>.
	 */
	public void setParam(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Chosen_Rating_Quality_Param.param</code>.
	 */
	public java.lang.Integer getParam() {
		return (java.lang.Integer) getValue(3);
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
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ChosenRatingQualityParam.CHOSEN_RATING_QUALITY_PARAM.ID_ALGORITHM_RATING_QUALITY_CHOSEN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ChosenRatingQualityParam.CHOSEN_RATING_QUALITY_PARAM.VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ChosenRatingQualityParam.CHOSEN_RATING_QUALITY_PARAM.EXPERIMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ChosenRatingQualityParam.CHOSEN_RATING_QUALITY_PARAM.PARAM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIdAlgorithmRatingQualityChosen();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getExperiment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getParam();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ChosenRatingQualityParamRecord value1(java.lang.Integer value) {
		setIdAlgorithmRatingQualityChosen(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ChosenRatingQualityParamRecord value2(java.lang.String value) {
		setValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ChosenRatingQualityParamRecord value3(java.lang.Integer value) {
		setExperiment(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ChosenRatingQualityParamRecord value4(java.lang.Integer value) {
		setParam(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ChosenRatingQualityParamRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.Integer value3, java.lang.Integer value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ChosenRatingQualityParamRecord
	 */
	public ChosenRatingQualityParamRecord() {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ChosenRatingQualityParam.CHOSEN_RATING_QUALITY_PARAM);
	}

	/**
	 * Create a detached, initialised ChosenRatingQualityParamRecord
	 */
	public ChosenRatingQualityParamRecord(java.lang.Integer idAlgorithmRatingQualityChosen, java.lang.String value, java.lang.Integer experiment, java.lang.Integer param) {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ChosenRatingQualityParam.CHOSEN_RATING_QUALITY_PARAM);

		setValue(0, idAlgorithmRatingQualityChosen);
		setValue(1, value);
		setValue(2, experiment);
		setValue(3, param);
	}
}
