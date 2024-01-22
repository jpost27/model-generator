package com.fanduel.modelgenerator.generated.golfv3.tournamentholestatistics;

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
public class Hole {
    @JsonProperty("par")
    private Integer par;

    @JsonProperty("strokes")
    private Integer strokes;

    @JsonProperty("bogeys")
    private Integer bogeys;

    @JsonProperty("strokes_avg")
    private Double strokesAvg;

    @JsonProperty("double_bogeys")
    private Integer doubleBogeys;

    @JsonProperty("holes_in_one")
    private Integer holesInOne;

    @JsonProperty("players")
    private Integer players;

    @JsonProperty("pars")
    private Integer pars;

    @JsonProperty("eagles")
    private Integer eagles;

    @JsonProperty("sequence")
    private Integer sequence;

    @JsonProperty("number")
    private Integer number;

    @JsonProperty("avg_diff")
    private Double avgDiff;

    @JsonProperty("other_scores")
    private Integer otherScores;

    @JsonProperty("birdies")
    private Integer birdies;

    public Optional<Integer> getPar() {
        return Optional.ofNullable(par);
    }

    public Optional<Integer> getStrokes() {
        return Optional.ofNullable(strokes);
    }

    public Optional<Integer> getBogeys() {
        return Optional.ofNullable(bogeys);
    }

    public Optional<Double> getStrokesAvg() {
        return Optional.ofNullable(strokesAvg);
    }

    public Optional<Integer> getDoubleBogeys() {
        return Optional.ofNullable(doubleBogeys);
    }

    public Optional<Integer> getHolesInOne() {
        return Optional.ofNullable(holesInOne);
    }

    public Optional<Integer> getPlayers() {
        return Optional.ofNullable(players);
    }

    public Optional<Integer> getPars() {
        return Optional.ofNullable(pars);
    }

    public Optional<Integer> getEagles() {
        return Optional.ofNullable(eagles);
    }

    public Optional<Integer> getSequence() {
        return Optional.ofNullable(sequence);
    }

    public Optional<Integer> getNumber() {
        return Optional.ofNullable(number);
    }

    public Optional<Double> getAvgDiff() {
        return Optional.ofNullable(avgDiff);
    }

    public Optional<Integer> getOtherScores() {
        return Optional.ofNullable(otherScores);
    }

    public Optional<Integer> getBirdies() {
        return Optional.ofNullable(birdies);
    }
}
