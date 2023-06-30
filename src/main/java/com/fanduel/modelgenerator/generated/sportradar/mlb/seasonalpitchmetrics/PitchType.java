package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalpitchmetrics;

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
public class PitchType {
    @JsonProperty("outs")
    private Outs outs;

    @JsonProperty("onbase")
    private Onbase onbase;

    @JsonProperty("gbfb")
    private Double gbfb;

    @JsonProperty("count")
    private Integer count;

    @JsonProperty("in_play")
    private InPlay inPlay;

    @JsonProperty("max_speed")
    private Double maxSpeed;

    @JsonProperty("type")
    private String type;

    @JsonProperty("min_speed")
    private Double minSpeed;

    @JsonProperty("outcome")
    private Outcome outcome;

    @JsonProperty("swings")
    private Swings swings;

    @JsonProperty("avg_speed")
    private Double avgSpeed;

    public Optional<Outs> getOuts() {
        return Optional.ofNullable(outs);
    }

    public Optional<Onbase> getOnbase() {
        return Optional.ofNullable(onbase);
    }

    public Optional<Double> getGbfb() {
        return Optional.ofNullable(gbfb);
    }

    public Optional<Integer> getCount() {
        return Optional.ofNullable(count);
    }

    public Optional<InPlay> getInPlay() {
        return Optional.ofNullable(inPlay);
    }

    public Optional<Double> getMaxSpeed() {
        return Optional.ofNullable(maxSpeed);
    }

    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }

    public Optional<Double> getMinSpeed() {
        return Optional.ofNullable(minSpeed);
    }

    public Optional<Outcome> getOutcome() {
        return Optional.ofNullable(outcome);
    }

    public Optional<Swings> getSwings() {
        return Optional.ofNullable(swings);
    }

    public Optional<Double> getAvgSpeed() {
        return Optional.ofNullable(avgSpeed);
    }
}
