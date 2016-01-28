/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.objectservice.database.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CalibrationAnswerOption extends org.jooq.impl.TableImpl<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.CalibrationAnswerOptionRecord> {

	private static final long serialVersionUID = -1386681738;

	/**
	 * The singleton instance of <code>crowdcontrol.Calibration_answer_option</code>
	 */
	public static final edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.CalibrationAnswerOption CALIBRATION_ANSWER_OPTION = new edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.CalibrationAnswerOption();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.CalibrationAnswerOptionRecord> getRecordType() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.CalibrationAnswerOptionRecord.class;
	}

	/**
	 * The column <code>crowdcontrol.Calibration_answer_option.id_calibration_answer_option</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.CalibrationAnswerOptionRecord, java.lang.Integer> ID_CALIBRATION_ANSWER_OPTION = createField("id_calibration_answer_option", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Calibration_answer_option.calibration</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.CalibrationAnswerOptionRecord, java.lang.Integer> CALIBRATION = createField("calibration", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Calibration_answer_option.answer</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.CalibrationAnswerOptionRecord, java.lang.String> ANSWER = createField("answer", org.jooq.impl.SQLDataType.VARCHAR.length(191).nullable(false), this, "");

	/**
	 * Create a <code>crowdcontrol.Calibration_answer_option</code> table reference
	 */
	public CalibrationAnswerOption() {
		this("Calibration_answer_option", null);
	}

	/**
	 * Create an aliased <code>crowdcontrol.Calibration_answer_option</code> table reference
	 */
	public CalibrationAnswerOption(java.lang.String alias) {
		this(alias, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.CalibrationAnswerOption.CALIBRATION_ANSWER_OPTION);
	}

	private CalibrationAnswerOption(java.lang.String alias, org.jooq.Table<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.CalibrationAnswerOptionRecord> aliased) {
		this(alias, aliased, null);
	}

	private CalibrationAnswerOption(java.lang.String alias, org.jooq.Table<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.CalibrationAnswerOptionRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, edu.kit.ipd.crowdcontrol.objectservice.database.model.Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.CalibrationAnswerOptionRecord, java.lang.Integer> getIdentity() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.Keys.IDENTITY_CALIBRATION_ANSWER_OPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.CalibrationAnswerOptionRecord> getPrimaryKey() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.Keys.KEY_CALIBRATION_ANSWER_OPTION_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.CalibrationAnswerOptionRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.CalibrationAnswerOptionRecord>>asList(edu.kit.ipd.crowdcontrol.objectservice.database.model.Keys.KEY_CALIBRATION_ANSWER_OPTION_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.CalibrationAnswerOptionRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.CalibrationAnswerOptionRecord, ?>>asList(edu.kit.ipd.crowdcontrol.objectservice.database.model.Keys.POPULATIONANSWER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.CalibrationAnswerOption as(java.lang.String alias) {
		return new edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.CalibrationAnswerOption(alias, this);
	}

	/**
	 * Rename this table
	 */
	public edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.CalibrationAnswerOption rename(java.lang.String name) {
		return new edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.CalibrationAnswerOption(name, null);
	}
}