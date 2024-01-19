package com.fanduel.modelgenerator.generated.sportradar.golf.playerprofile;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Round {
    @JsonProperty("score")
    private Integer score;

    @JsonProperty("thru")
    private Integer thru;

    @JsonProperty("sequence")
    private Integer sequence;

    @JsonProperty("strokes")
    private Integer strokes;

    @JsonProperty("bogeys")
    private Integer bogeys;

    @JsonProperty("double_bogeys")
    private Integer doubleBogeys;

    @JsonProperty("other_scores")
    private Integer otherScores;

    @JsonProperty("holes_in_one")
    private Integer holesInOne;

    @JsonProperty("pars")
    private Integer pars;

    @JsonProperty("birdies")
    private Integer birdies;

    @JsonProperty("eagles")
    private Integer eagles;

    public Optional<Integer> getScore() {
        return Optional.ofNullable(score);
    }

    public Optional<Integer> getThru() {
        return Optional.ofNullable(thru);
    }

    public Optional<Integer> getSequence() {
        return Optional.ofNullable(sequence);
    }

    public Optional<Integer> getStrokes() {
        return Optional.ofNullable(strokes);
    }

    public Optional<Integer> getBogeys() {
        return Optional.ofNullable(bogeys);
    }

    public Optional<Integer> getDoubleBogeys() {
        return Optional.ofNullable(doubleBogeys);
    }

    public Optional<Integer> getOtherScores() {
        return Optional.ofNullable(otherScores);
    }

    public Optional<Integer> getHolesInOne() {
        return Optional.ofNullable(holesInOne);
    }

    public Optional<Integer> getPars() {
        return Optional.ofNullable(pars);
    }

    public Optional<Integer> getBirdies() {
        return Optional.ofNullable(birdies);
    }

    public Optional<Integer> getEagles() {
        return Optional.ofNullable(eagles);
    }
}
