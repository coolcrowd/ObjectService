/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records;


import edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.AnswerReservation;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AnswerReservationRecord extends UpdatableRecordImpl<AnswerReservationRecord> implements Record5<Integer, Integer, Integer, Timestamp, Boolean> {

	private static final long serialVersionUID = 1742376892;

	/**
	 * Setter for <code>crowdcontrol.Answer_Reservation.id_answer_Reservation</code>.
	 */
	public void setIdAnswerReservation(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Answer_Reservation.id_answer_Reservation</code>.
	 */
	public Integer getIdAnswerReservation() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>crowdcontrol.Answer_Reservation.worker</code>.
	 */
	public void setWorker(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Answer_Reservation.worker</code>.
	 */
	public Integer getWorker() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>crowdcontrol.Answer_Reservation.experiment</code>.
	 */
	public void setExperiment(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Answer_Reservation.experiment</code>.
	 */
	public Integer getExperiment() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>crowdcontrol.Answer_Reservation.timestamp</code>.
	 */
	public void setTimestamp(Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Answer_Reservation.timestamp</code>.
	 */
	public Timestamp getTimestamp() {
		return (Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>crowdcontrol.Answer_Reservation.used</code>.
	 */
	public void setUsed(Boolean value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Answer_Reservation.used</code>.
	 */
	public Boolean getUsed() {
		return (Boolean) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, Integer, Integer, Timestamp, Boolean> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, Integer, Integer, Timestamp, Boolean> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return AnswerReservation.ANSWER_RESERVATION.ID_ANSWER_RESERVATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return AnswerReservation.ANSWER_RESERVATION.WORKER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return AnswerReservation.ANSWER_RESERVATION.EXPERIMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field4() {
		return AnswerReservation.ANSWER_RESERVATION.TIMESTAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field5() {
		return AnswerReservation.ANSWER_RESERVATION.USED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getIdAnswerReservation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getWorker();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getExperiment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value4() {
		return getTimestamp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value5() {
		return getUsed();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AnswerReservationRecord value1(Integer value) {
		setIdAnswerReservation(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AnswerReservationRecord value2(Integer value) {
		setWorker(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AnswerReservationRecord value3(Integer value) {
		setExperiment(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AnswerReservationRecord value4(Timestamp value) {
		setTimestamp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AnswerReservationRecord value5(Boolean value) {
		setUsed(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AnswerReservationRecord values(Integer value1, Integer value2, Integer value3, Timestamp value4, Boolean value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AnswerReservationRecord
	 */
	public AnswerReservationRecord() {
		super(AnswerReservation.ANSWER_RESERVATION);
	}

	/**
	 * Create a detached, initialised AnswerReservationRecord
	 */
	public AnswerReservationRecord(Integer idAnswerReservation, Integer worker, Integer experiment, Timestamp timestamp, Boolean used) {
		super(AnswerReservation.ANSWER_RESERVATION);

		setValue(0, idAnswerReservation);
		setValue(1, worker);
		setValue(2, experiment);
		setValue(3, timestamp);
		setValue(4, used);
	}
}
