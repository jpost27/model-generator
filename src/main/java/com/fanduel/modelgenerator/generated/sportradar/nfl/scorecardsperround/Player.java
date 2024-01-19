package com.fanduel.modelgenerator.generated.sportradar.nfl.scorecardsperround;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Player {
    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("country")
    private String country;

    @JsonProperty("thru")
    private Integer thru;

    @JsonProperty("strokes")
    private Integer strokes;

    @JsonProperty("bogeys")
    private Integer bogeys;

    @JsonProperty("double_bogeys")
    private Integer doubleBogeys;

    @JsonProperty("holes_in_one")
    private Integer holesInOne;

    @JsonProperty("scores")
    private List<Score> scores;

    @JsonProperty("pars")
    private Integer pars;

    @JsonProperty("abbr_name")
    private String abbrName;

    @JsonProperty("eagles")
    private Integer eagles;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("score")
    private Integer score;

    @JsonProperty("other_scores")
    private Integer otherScores;

    @JsonProperty("course")
    private Course course;

    @JsonProperty("id")
    private String id;

    @JsonProperty("birdies")
    private Integer birdies;

    @JsonProperty("status")
    private String status;

    public Optional<String> getLastName() {
        return Optional.ofNullable(lastName);
    }

    public Optional<String> getCountry() {
        return Optional.ofNullable(country);
    }

    public Optional<Integer> getThru() {
        return Optional.ofNullable(thru);
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

    public Optional<Integer> getHolesInOne() {
        return Optional.ofNullable(holesInOne);
    }

    public List<Score> getScores() {
        return Optional.ofNullable(scores).orElse(Collections.emptyList());
    }

    public Optional<Integer> getPars() {
        return Optional.ofNullable(pars);
    }

    public Optional<String> getAbbrName() {
        return Optional.ofNullable(abbrName);
    }

    public Optional<Integer> getEagles() {
        return Optional.ofNullable(eagles);
    }

    public Optional<String> getFirstName() {
        return Optional.ofNullable(firstName);
    }

    public Optional<Integer> getScore() {
        return Optional.ofNullable(score);
    }

    public Optional<Integer> getOtherScores() {
        return Optional.ofNullable(otherScores);
    }

    public Optional<Course> getCourse() {
        return Optional.ofNullable(course);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Integer> getBirdies() {
        return Optional.ofNullable(birdies);
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }
}
