package com.fanduel.modelgenerator.generated.sportradar.nfl.seasonalstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class FieldGoals {
    @JsonProperty("pct")
    private Double pct;

    @JsonProperty("longest")
    private Integer longest;

    @JsonProperty("made")
    private Integer made;

    @JsonProperty("missed")
    private Integer missed;

    @JsonProperty("yards")
    private Integer yards;

    @JsonProperty("avg_yards")
    private Double avgYards;

    @JsonProperty("blocked")
    private Integer blocked;

    @JsonProperty("attempts_50")
    private Integer attempts50;

    @JsonProperty("made_50")
    private Integer made50;

    @JsonProperty("attempts_39")
    private Integer attempts39;

    @JsonProperty("attempts_29")
    private Integer attempts29;

    @JsonProperty("attempts_19")
    private Integer attempts19;

    @JsonProperty("made_29")
    private Integer made29;

    @JsonProperty("made_19")
    private Integer made19;

    @JsonProperty("made_49")
    private Integer made49;

    @JsonProperty("made_39")
    private Integer made39;

    @JsonProperty("attempts")
    private Integer attempts;

    @JsonProperty("attempts_49")
    private Integer attempts49;
}
