package com.fanduel.modelgenerator.generated.sportradar.nba.seriesschedule;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Source {
    @JsonProperty("round")
    private Integer round;

    @JsonProperty("id")
    private String id;

    @JsonProperty("title")
    private String title;

    @JsonProperty("outcome")
    private String outcome;

    public Optional<Integer> getRound() {
        return Optional.ofNullable(round);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getTitle() {
        return Optional.ofNullable(title);
    }

    public Optional<String> getOutcome() {
        return Optional.ofNullable(outcome);
    }
}
