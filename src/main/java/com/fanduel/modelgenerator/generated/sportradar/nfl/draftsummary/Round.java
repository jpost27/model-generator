package com.fanduel.modelgenerator.generated.sportradar.nfl.draftsummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Round {
    @JsonProperty("number")
    private Integer number;

    @JsonProperty("end_date")
    private String endDate;

    @JsonProperty("picks")
    private List<Pick> picks;

    @JsonProperty("id")
    private String id;

    @JsonProperty("start_date")
    private String startDate;

    @JsonProperty("status")
    private String status;

    public Optional<Integer> getNumber() {
        return Optional.ofNullable(number);
    }

    public Optional<String> getEndDate() {
        return Optional.ofNullable(endDate);
    }

    public List<Pick> getPicks() {
        return Optional.ofNullable(picks).orElse(Collections.emptyList());
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getStartDate() {
        return Optional.ofNullable(startDate);
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }
}
