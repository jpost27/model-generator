package com.fanduel.modelgenerator.generated.sportradar.nba.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
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
public class Away {
    @JsonProperty("market")
    private String market;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("scoring")
    private List<Scoring> scoring;

    @JsonProperty("bonus")
    private Boolean bonus;

    @JsonProperty("name")
    private String name;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("leaders")
    private Leaders leaders;

    @JsonProperty("id")
    private String id;

    @JsonProperty("points")
    private Integer points;

    @JsonProperty("sr_id")
    private String srId;

    public Optional<String> getMarket() {
        return Optional.ofNullable(market);
    }

    public Optional<String> getReference() {
        return Optional.ofNullable(reference);
    }

    public List<Scoring> getScoring() {
        return Optional.ofNullable(scoring).orElse(Collections.emptyList());
    }

    public Optional<Boolean> getBonus() {
        return Optional.ofNullable(bonus);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<String> getAlias() {
        return Optional.ofNullable(alias);
    }

    public Optional<Leaders> getLeaders() {
        return Optional.ofNullable(leaders);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Integer> getPoints() {
        return Optional.ofNullable(points);
    }

    public Optional<String> getSrId() {
        return Optional.ofNullable(srId);
    }
}
