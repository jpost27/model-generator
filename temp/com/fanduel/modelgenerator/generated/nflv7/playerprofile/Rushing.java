package com.fanduel.modelgenerator.generated.nflv7.playerprofile;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
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

    public Optional<Integer> getTouchdowns() {
        return Optional.ofNullable(touchdowns);
    }

    public Optional<Integer> getLongest() {
        return Optional.ofNullable(longest);
    }

    public Optional<Integer> getLongestTouchdown() {
        return Optional.ofNullable(longestTouchdown);
    }

    public Optional<Integer> getYardsAfterContact() {
        return Optional.ofNullable(yardsAfterContact);
    }

    public Optional<Integer> getBrokenTackles() {
        return Optional.ofNullable(brokenTackles);
    }

    public Optional<Integer> getFirstDowns() {
        return Optional.ofNullable(firstDowns);
    }

    public Optional<Integer> getScrambles() {
        return Optional.ofNullable(scrambles);
    }

    public Optional<Integer> getKneelDowns() {
        return Optional.ofNullable(kneelDowns);
    }

    public Optional<Integer> getTlost() {
        return Optional.ofNullable(tlost);
    }

    public Optional<Double> getAvgYards() {
        return Optional.ofNullable(avgYards);
    }

    public Optional<Integer> getYards() {
        return Optional.ofNullable(yards);
    }

    public Optional<Integer> getRedzoneAttempts() {
        return Optional.ofNullable(redzoneAttempts);
    }

    public Optional<Integer> getTlostYards() {
        return Optional.ofNullable(tlostYards);
    }

    public Optional<Integer> getAttempts() {
        return Optional.ofNullable(attempts);
    }
}
