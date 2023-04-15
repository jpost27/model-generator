
package com.fanduel.modelgenerator.sportradar.nfl.seasonalstatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "attempts",
    "made",
    "blocked",
    "yards",
    "avg_yards",
    "longest",
    "missed",
    "pct",
    "attempts_19",
    "attempts_29",
    "attempts_39",
    "attempts_49",
    "attempts_50",
    "made_19",
    "made_29",
    "made_39",
    "made_49",
    "made_50"
})
@Generated("jsonschema2pojo")
public class FieldGoals__1 {

    @JsonProperty("attempts")
    public Integer attempts;
    @JsonProperty("made")
    public Integer made;
    @JsonProperty("blocked")
    public Integer blocked;
    @JsonProperty("yards")
    public Integer yards;
    @JsonProperty("avg_yards")
    public Double avgYards;
    @JsonProperty("longest")
    public Integer longest;
    @JsonProperty("missed")
    public Integer missed;
    @JsonProperty("pct")
    public Double pct;
    @JsonProperty("attempts_19")
    public Integer attempts19;
    @JsonProperty("attempts_29")
    public Integer attempts29;
    @JsonProperty("attempts_39")
    public Integer attempts39;
    @JsonProperty("attempts_49")
    public Integer attempts49;
    @JsonProperty("attempts_50")
    public Integer attempts50;
    @JsonProperty("made_19")
    public Integer made19;
    @JsonProperty("made_29")
    public Integer made29;
    @JsonProperty("made_39")
    public Integer made39;
    @JsonProperty("made_49")
    public Integer made49;
    @JsonProperty("made_50")
    public Integer made50;

}
