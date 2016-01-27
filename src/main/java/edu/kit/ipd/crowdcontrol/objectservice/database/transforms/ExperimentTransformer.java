package edu.kit.ipd.crowdcontrol.objectservice.database.transforms;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ConstraintRecord;
import edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ExperimentRecord;
import edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.PopulationRecord;
import edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TagRecord;
import edu.kit.ipd.crowdcontrol.objectservice.proto.AnswerType;
import edu.kit.ipd.crowdcontrol.objectservice.proto.Experiment;
import org.jooq.tools.json.JSONObject;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by marcel on 26.01.16.
 */
public class ExperimentTransformer extends AbstractTransform {
    public static Experiment toProto(ExperimentRecord record, Experiment.State state,
                                     List<ConstraintRecord> constraintRecords,
                                     List<PopulationRecord> populationRecords,
                                     List<TagRecord> tagRecords) {
        Type type = new TypeToken<Map<String, String>>(){}.getType();
        return Experiment.newBuilder()
                .setId(record.getIdExperiment())
                .setDescription(record.getDescription())
                /*.set*/
                .setRatingsPerAnswer(record.getRatingsPerAnswer())
                .setAnswersPerWorker(record.getAnwersPerWorker())
                .setRatingsPerWorker(record.getRatingsPerWorker())
                .setAnswerType(AnswerType.valueOf(record.getAnswerType()))
                .setAlgorithmTaskChooser(record.getAlgorithmTaskChooser())
                .setAlgorithmQualityAnswer(record.getAlgorithmQualityAnswer())
                .setAlgorithmQualityRating(record.getAlgorithmQualityRating())
                .setPaymentBase(record.getBasePayment())
                .setPaymentAnswer(record.getBonusAnswer())
                .setPaymentRating(record.getBonusRating())
                .setState(state)
                .putAllPlaceholders(new Gson().fromJson(record.getTemplateData(), type))
                .addAllConstraints(constraintRecords.stream().map(ConstraintsTransformer::toProto).collect(Collectors.toList()))
                .addAllPopulations(populationRecords.stream().map(PopulationTransformer::toProto).collect(Collectors.toList()))
                .addAllTags(tagRecords.stream().map(TagTransformer::toProto).collect(Collectors.toList()))
                .build();
    }


    public static ExperimentRecord toRecord(Experiment experiment) {
        return new ExperimentRecord(experiment.getId(),
                experiment.getTitle(),
                experiment.getDescription(),
                -1,
                experiment.getRatingsPerAnswer(),
                experiment.getAnswersPerWorker(),
                experiment.getRatingsPerWorker(),
                transform(experiment.getAnswerType()),
                experiment.getAlgorithmTaskChooser(),
                experiment.getAlgorithmQualityAnswer(),
                experiment.getAlgorithmQualityRating(),
                experiment.getPaymentBase(),
                experiment.getPaymentAnswer(),
                experiment.getPaymentRating(),
                (new JSONObject(experiment.getPlaceholders())).toString(),
                experiment.getTemplateId());
    }

    private static String transform(AnswerType answerType) {
        if (answerType == AnswerType.INVALID) return null;
        return answerType.name();
    }

    public static ExperimentRecord mergeProto(ExperimentRecord record_, Experiment experiment) {
        return merge(record_, experiment, (integer, record) -> {
            switch (integer) {
                case Experiment.ALGORITHM_QUALITY_ANSWER_FIELD_NUMBER:
                    record.setAlgorithmQualityAnswer(experiment.getAlgorithmQualityAnswer());
                    break;
                case Experiment.ALGORITHM_QUALITY_RATING_FIELD_NUMBER:
                    record.setAlgorithmQualityRating(experiment.getAlgorithmQualityRating());
                    break;
                case Experiment.ALGORITHM_TASK_CHOOSER_FIELD_NUMBER:
                    record.setAlgorithmTaskChooser(experiment.getAlgorithmTaskChooser());
                    break;
                case Experiment.ANSWER_TYPE_FIELD_NUMBER:
                    record.setAnswerType(transform(experiment.getAnswerType()));
                    break;
                case Experiment.ANSWERS_PER_WORKER_FIELD_NUMBER:
                    record.setAnwersPerWorker(experiment.getAnswersPerWorker());
                    break;
                case Experiment.CONSTRAINTS_FIELD_NUMBER:
                    //
                    break;
                case Experiment.DESCRIPTION_FIELD_NUMBER:
                    record.setDescription(experiment.getDescription());
                    break;
                case Experiment.ID_FIELD_NUMBER:
                    record.setIdExperiment(experiment.getId());
                    break;
                case Experiment.PAYMENT_ANSWER_FIELD_NUMBER:
                    record.setBonusAnswer(experiment.getPaymentAnswer());
                    break;
                case Experiment.PAYMENT_BASE_FIELD_NUMBER:
                    record.setBasePayment(experiment.getPaymentBase());
                    break;
                case Experiment.PAYMENT_RATING_FIELD_NUMBER:
                    record.setBonusRating(experiment.getPaymentRating());
                    break;
                case Experiment.PLACEHOLDERS_FIELD_NUMBER:
                    record.setTemplateData(new JSONObject(experiment.getPlaceholders()).toString());
                    break;
                case Experiment.POPULATIONS_FIELD_NUMBER:
                    //
                    break;
                case Experiment.RATINGS_PER_ANSWER_FIELD_NUMBER:
                    record.setRatingsPerAnswer(experiment.getRatingsPerAnswer());
                    break;
                case Experiment.STATE_FIELD_NUMBER:
                    //
                    break;
                case Experiment.TAGS_FIELD_NUMBER:
                    //
                    break;
                case Experiment.TEMPLATE_ID_FIELD_NUMBER:
                    record.setTemplate(experiment.getTemplateId());
                    break;
                case Experiment.TITLE_FIELD_NUMBER:
                    record.setTitel(experiment.getTitle());
                    break;
            }
        });
    }
}