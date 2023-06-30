package com.fanduel.modelgenerator.generated.sportradar.nfl.playbyplay;

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
public class Home {
    @JsonProperty("used_challenges")
    private Integer usedChallenges;

    @JsonProperty("decision")
    private String decision;

    @JsonProperty("remaining_challenges")
    private Integer remainingChallenges;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("points")
    private Integer points;

    @JsonProperty("market")
    private String market;

    @JsonProperty("record")
    private Record record;

    @JsonProperty("name")
    private String name;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("used_timeouts")
    private Integer usedTimeouts;

    @JsonProperty("id")
    private String id;

    @JsonProperty("remaining_timeouts")
    private Integer remainingTimeouts;

    @JsonProperty("outcome")
    private String outcome;

    @JsonProperty("direction")
    private String direction;

    public Optional<Integer> getUsedChallenges() {
        return Optional.ofNullable(usedChallenges);
    }

    public Optional<String> getDecision() {
        return Optional.ofNullable(decision);
    }

    public Optional<Integer> getRemainingChallenges() {
        return Optional.ofNullable(remainingChallenges);
    }

    public Optional<String> getSrId() {
        return Optional.ofNullable(srId);
    }

    public Optional<Integer> getPoints() {
        return Optional.ofNullable(points);
    }

    public Optional<String> getMarket() {
        return Optional.ofNullable(market);
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

    public Optional<Integer> getUsedTimeouts() {
        return Optional.ofNullable(usedTimeouts);
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

    public Optional<String> getDirection() {
        return Optional.ofNullable(direction);
    }
}
