/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.objectservice.database.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Crowdcontrol extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 546944901;

	/**
	 * The singleton instance of <code>crowdcontrol</code>
	 */
	public static final Crowdcontrol CROWDCONTROL = new Crowdcontrol();

	/**
	 * No further instances allowed
	 */
	private Crowdcontrol() {
		super("crowdcontrol");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.AlgorithmAnswerQuality.ALGORITHM_ANSWER_QUALITY,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.AlgorithmAnswerQualityParam.ALGORITHM_ANSWER_QUALITY_PARAM,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.AlgorithmRatingQuality.ALGORITHM_RATING_QUALITY,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.AlgorithmRatingQualityParam.ALGORITHM_RATING_QUALITY_PARAM,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.AlgorithmTaskChooser.ALGORITHM_TASK_CHOOSER,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.AlgorithmTaskChooserParam.ALGORITHM_TASK_CHOOSER_PARAM,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Answer.ANSWER,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Calibration.CALIBRATION,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.CalibrationAnswerOption.CALIBRATION_ANSWER_OPTION,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.CalibrationResult.CALIBRATION_RESULT,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ChosenAnswerQualityParam.CHOSEN_ANSWER_QUALITY_PARAM,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ChosenRatingQualityParam.CHOSEN_RATING_QUALITY_PARAM,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ChosenTaskChooserParam.CHOSEN_TASK_CHOOSER_PARAM,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Constraint.CONSTRAINT,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.DatabaseVersion.DATABASE_VERSION,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Experiment.EXPERIMENT,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ExperimentsCalibration.EXPERIMENTS_CALIBRATION,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ExperimentsPlatform.EXPERIMENTS_PLATFORM,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ExperimentsPlatformMode.EXPERIMENTS_PLATFORM_MODE,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ExperimentsPlatformStatus.EXPERIMENTS_PLATFORM_STATUS,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.GiftCode.GIFT_CODE,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Notification.NOTIFICATION,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.NotificationReceiverEmail.NOTIFICATION_RECEIVER_EMAIL,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.NotificationToken.NOTIFICATION_TOKEN,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Platform.PLATFORM,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Rating.RATING,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.RatingConstraint.RATING_CONSTRAINT,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.RatingOptionExperiment.RATING_OPTION_EXPERIMENT,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.RatingOptionTemplate.RATING_OPTION_TEMPLATE,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Tag.TAG,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Task.TASK,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Template.TEMPLATE,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.TemplateConstraint.TEMPLATE_CONSTRAINT,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.TemplateTag.TEMPLATE_TAG,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Worker.WORKER,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.WorkerBalance.WORKER_BALANCE);
	}
}
