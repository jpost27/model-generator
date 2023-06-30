package com.fanduel.modelgenerator.generated.sportradar.nfl.playbyplay;

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
public class Period {
    @JsonProperty("number")
    private Integer number;

    @JsonProperty("sequence")
    private Integer sequence;

    @JsonProperty("scoring")
    private Scoring scoring;

    @JsonProperty("period_type")
    private String periodType;

    @JsonProperty("coin_toss")
    private CoinToss coinToss;

    @JsonProperty("id")
    private String id;

    @JsonProperty("pbp")
    private List<Pbp> pbp;

    public Optional<Integer> getNumber() {
        return Optional.ofNullable(number);
    }

    public Optional<Integer> getSequence() {
        return Optional.ofNullable(sequence);
    }

    public Optional<Scoring> getScoring() {
        return Optional.ofNullable(scoring);
    }

    public Optional<String> getPeriodType() {
        return Optional.ofNullable(periodType);
    }

    public Optional<CoinToss> getCoinToss() {
        return Optional.ofNullable(coinToss);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public List<Pbp> getPbp() {
        return Optional.ofNullable(pbp).orElse(Collections.emptyList());
    }
}
