package com.fanduel.modelgenerator.generated.manual.scanattachments.scanattachments;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Runner {
    @JsonProperty("result")
    private Result result;

    @JsonProperty("sortPriority")
    private Integer sortPriority;

    @JsonProperty("selectionId")
    private Integer selectionId;

    @JsonProperty("runnerName")
    private String runnerName;

    @JsonProperty("runnerStatus")
    private String runnerStatus;

    @JsonProperty("handicap")
    private Double handicap;

    public Optional<Result> getResult() {
        return Optional.ofNullable(result);
    }

    public Optional<Integer> getSortPriority() {
        return Optional.ofNullable(sortPriority);
    }

    public Optional<Integer> getSelectionId() {
        return Optional.ofNullable(selectionId);
    }

    public Optional<String> getRunnerName() {
        return Optional.ofNullable(runnerName);
    }

    public Optional<String> getRunnerStatus() {
        return Optional.ofNullable(runnerStatus);
    }

    public Optional<Double> getHandicap() {
        return Optional.ofNullable(handicap);
    }
}
