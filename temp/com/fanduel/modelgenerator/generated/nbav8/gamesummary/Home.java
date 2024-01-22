package com.fanduel.modelgenerator.generated.nbav8.gamesummary;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Setter
@Accessors(
        chain = true
)
@JsonIgnoreProperties(
        ignoreUnknown = true
)
@EqualsAndHashCode
@ToString
@Generated("fanduel-model-generator")
public class Home {
    @JsonProperty("scoring")
    private List<Scoring> scoring;

    @JsonProperty("bonus")
    private Boolean bonus;

    @JsonProperty("players")
    private List<Player> players;

    @JsonProperty("points")
    private Integer points;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("market")
    private String market;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("coaches")
    private List<Coach> coaches;

    @JsonProperty("record")
    private Record record;

    @JsonProperty("name")
    private String name;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("id")
    private String id;

    @JsonProperty("remaining_timeouts")
    private Integer remainingTimeouts;

    @JsonProperty("statistics")
    private Statistics statistics;

    public List<Scoring> getScoring() {
        return Optional.ofNullable(scoring).orElse(Collections.emptyList());
    }

    public Optional<Boolean> getBonus() {
        return Optional.ofNullable(bonus);
    }

    public List<Player> getPlayers() {
        return Optional.ofNullable(players).orElse(Collections.emptyList());
    }

    public Optional<Integer> getPoints() {
        return Optional.ofNullable(points);
    }

    public Optional<String> getSrId() {
        return Optional.ofNullable(srId);
    }

    public Optional<String> getMarket() {
        return Optional.ofNullable(market);
    }

    public Optional<String> getReference() {
        return Optional.ofNullable(reference);
    }

    public List<Coach> getCoaches() {
        return Optional.ofNullable(coaches).orElse(Collections.emptyList());
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

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Integer> getRemainingTimeouts() {
        return Optional.ofNullable(remainingTimeouts);
    }

    public Optional<Statistics> getStatistics() {
        return Optional.ofNullable(statistics);
    }
}
