/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records;


import edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.ExperimentsPlatformModeMode;
import edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ExperimentsPlatformMode;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class ExperimentsPlatformModeRecord extends UpdatableRecordImpl<ExperimentsPlatformModeRecord> implements Record4<Integer, Integer, ExperimentsPlatformModeMode, Timestamp> {

	private static final long serialVersionUID = 118115201;

	/**
	 * Setter for <code>crowdcontrol.Experiments_Platform_Mode.id_Experiments_Platform_Mode</code>.
	 */
	public void setIdExperimentsPlatformMode(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiments_Platform_Mode.id_Experiments_Platform_Mode</code>.
	 */
	public Integer getIdExperimentsPlatformMode() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>crowdcontrol.Experiments_Platform_Mode.experiments_platform</code>.
	 */
	public void setExperimentsPlatform(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiments_Platform_Mode.experiments_platform</code>.
	 */
	public Integer getExperimentsPlatform() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>crowdcontrol.Experiments_Platform_Mode.mode</code>.
	 */
	public void setMode(ExperimentsPlatformModeMode value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiments_Platform_Mode.mode</code>.
	 */
	public ExperimentsPlatformModeMode getMode() {
		return (ExperimentsPlatformModeMode) getValue(2);
	}

	/**
	 * Setter for <code>crowdcontrol.Experiments_Platform_Mode.timestamp</code>.
	 */
	public void setTimestamp(Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiments_Platform_Mode.timestamp</code>.
	 */
	public Timestamp getTimestamp() {
		return (Timestamp) getValue(3);
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
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Integer, Integer, ExperimentsPlatformModeMode, Timestamp> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Integer, Integer, ExperimentsPlatformModeMode, Timestamp> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return ExperimentsPlatformMode.EXPERIMENTS_PLATFORM_MODE.ID_EXPERIMENTS_PLATFORM_MODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return ExperimentsPlatformMode.EXPERIMENTS_PLATFORM_MODE.EXPERIMENTS_PLATFORM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ExperimentsPlatformModeMode> field3() {
		return ExperimentsPlatformMode.EXPERIMENTS_PLATFORM_MODE.MODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field4() {
		return ExperimentsPlatformMode.EXPERIMENTS_PLATFORM_MODE.TIMESTAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getIdExperimentsPlatformMode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getExperimentsPlatform();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentsPlatformModeMode value3() {
		return getMode();
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
	public ExperimentsPlatformModeRecord value1(Integer value) {
		setIdExperimentsPlatformMode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentsPlatformModeRecord value2(Integer value) {
		setExperimentsPlatform(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentsPlatformModeRecord value3(ExperimentsPlatformModeMode value) {
		setMode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentsPlatformModeRecord value4(Timestamp value) {
		setTimestamp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentsPlatformModeRecord values(Integer value1, Integer value2, ExperimentsPlatformModeMode value3, Timestamp value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ExperimentsPlatformModeRecord
	 */
	public ExperimentsPlatformModeRecord() {
		super(ExperimentsPlatformMode.EXPERIMENTS_PLATFORM_MODE);
	}

	/**
	 * Create a detached, initialised ExperimentsPlatformModeRecord
	 */
	public ExperimentsPlatformModeRecord(Integer idExperimentsPlatformMode, Integer experimentsPlatform, ExperimentsPlatformModeMode mode, Timestamp timestamp) {
		super(ExperimentsPlatformMode.EXPERIMENTS_PLATFORM_MODE);

		setValue(0, idExperimentsPlatformMode);
		setValue(1, experimentsPlatform);
		setValue(2, mode);
		setValue(3, timestamp);
	}
}
