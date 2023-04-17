package com.fanduel.modelgenerator.generated.sportradar.nfl.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Rushing {
    @JsonProperty("touchdowns")
    private Integer touchdowns;

    @JsonProperty("longest")
    private Integer longest;

    @JsonProperty("longest_touchdown")
    private Integer longestTouchdown;

    @JsonProperty("yards_after_contact")
    private Integer yardsAfterContact;

    @JsonProperty("broken_tackles")
    private Integer brokenTackles;

    @JsonProperty("first_downs")
    private Integer firstDowns;

    @JsonProperty("scrambles")
    private Integer scrambles;

    @JsonProperty("kneel_downs")
    private Integer kneelDowns;

    @JsonProperty("tlost")
    private Integer tlost;

    @JsonProperty("avg_yards")
    private Double avgYards;

    @JsonProperty("yards")
    private Integer yards;

    @JsonProperty("redzone_attempts")
    private Integer redzoneAttempts;

    @JsonProperty("tlost_yards")
    private Integer tlostYards;

    @JsonProperty("attempts")
    private Integer attempts;
}
