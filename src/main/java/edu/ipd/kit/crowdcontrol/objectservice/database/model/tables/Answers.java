/**
 * This class is generated by jOOQ
 */
package edu.ipd.kit.crowdcontrol.objectservice.database.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Answers extends org.jooq.impl.TableImpl<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.AnswersRecord> {

	private static final long serialVersionUID = -1164210478;

	/**
	 * The singleton instance of <code>crowdcontrol.Answers</code>
	 */
	public static final edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Answers ANSWERS = new edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Answers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.AnswersRecord> getRecordType() {
		return edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.AnswersRecord.class;
	}

	/**
	 * The column <code>crowdcontrol.Answers.idAnswers</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.AnswersRecord, java.lang.Integer> IDANSWERS = createField("idAnswers", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Answers.hit_a</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.AnswersRecord, java.lang.Integer> HIT_A = createField("hit_a", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Answers.answer</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.AnswersRecord, java.lang.String> ANSWER = createField("answer", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Answers.timestamp</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.AnswersRecord, java.sql.Timestamp> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>crowdcontrol.Answers.worker_id</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.AnswersRecord, java.lang.Integer> WORKER_ID = createField("worker_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>crowdcontrol.Answers</code> table reference
	 */
	public Answers() {
		this("Answers", null);
	}

	/**
	 * Create an aliased <code>crowdcontrol.Answers</code> table reference
	 */
	public Answers(java.lang.String alias) {
		this(alias, edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Answers.ANSWERS);
	}

	private Answers(java.lang.String alias, org.jooq.Table<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.AnswersRecord> aliased) {
		this(alias, aliased, null);
	}

	private Answers(java.lang.String alias, org.jooq.Table<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.AnswersRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, edu.ipd.kit.crowdcontrol.objectservice.database.model.Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.AnswersRecord> getPrimaryKey() {
		return edu.ipd.kit.crowdcontrol.objectservice.database.model.Keys.KEY_ANSWERS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.AnswersRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.AnswersRecord>>asList(edu.ipd.kit.crowdcontrol.objectservice.database.model.Keys.KEY_ANSWERS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.AnswersRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.AnswersRecord, ?>>asList(edu.ipd.kit.crowdcontrol.objectservice.database.model.Keys.WORKERANSWERED);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Answers as(java.lang.String alias) {
		return new edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Answers(alias, this);
	}

	/**
	 * Rename this table
	 */
	public edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Answers rename(java.lang.String name) {
		return new edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Answers(name, null);
	}
}