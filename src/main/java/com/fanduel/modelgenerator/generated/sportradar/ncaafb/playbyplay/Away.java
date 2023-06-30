package com.fanduel.modelgenerator.generated.sportradar.ncaafb.playbyplay;

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
public class Away {
    @JsonProperty("market")
    private String market;

    @JsonProperty("decision")
    private String decision;

    @JsonProperty("record")
    private Record record;

    @JsonProperty("name")
    private String name;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("remaining_challenges")
    private Integer remainingChallenges;

    @JsonProperty("id")
    private String id;

    @JsonProperty("remaining_timeouts")
    private Integer remainingTimeouts;

    @JsonProperty("outcome")
    private String outcome;

    @JsonProperty("points")
    private Integer points;

    public Optional<String> getMarket() {
        return Optional.ofNullable(market);
    }

    public Optional<String> getDecision() {
        return Optional.ofNullable(decision);
    }

    public Optional<Record> getRecord() {
        return Optional.ofNullable(record);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<String> getAlias() {
        return Optional.ofNullable(alias);
    }

    public Optional<Integer> getRemainingChallenges() {
        return Optional.ofNullable(remainingChallenges);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Integer> getRemainingTimeouts() {
        return Optional.ofNullable(remainingTimeouts);
    }

    public Optional<String> getOutcome() {
        return Optional.ofNullable(outcome);
    }

    public Optional<Integer> getPoints() {
        return Optional.ofNullable(points);
    }
}
