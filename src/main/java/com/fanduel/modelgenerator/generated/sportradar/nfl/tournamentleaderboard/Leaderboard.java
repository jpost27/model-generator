package com.fanduel.modelgenerator.generated.sportradar.nfl.tournamentleaderboard;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Double;
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
public class Leaderboard {
    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("country")
    private String country;

    @JsonProperty("tied")
    private Boolean tied;

    @JsonProperty("strokes")
    private Integer strokes;

    @JsonProperty("abbr_name")
    private String abbrName;

    @JsonProperty("points")
    private Double points;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("score")
    private Integer score;

    @JsonProperty("money")
    private Double money;

    @JsonProperty("id")
    private String id;

    @JsonProperty("position")
    private Integer position;

    @JsonProperty("rounds")
    private List<Round> rounds;

    @JsonProperty("status")
    private String status;

    public Optional<String> getLastName() {
        return Optional.ofNullable(lastName);
    }

    public Optional<String> getCountry() {
        return Optional.ofNullable(country);
    }

    public Optional<Boolean> getTied() {
        return Optional.ofNullable(tied);
    }

    public Optional<Integer> getStrokes() {
        return Optional.ofNullable(strokes);
    }

    public Optional<String> getAbbrName() {
        return Optional.ofNullable(abbrName);
    }

    public Optional<Double> getPoints() {
        return Optional.ofNullable(points);
    }

    public Optional<String> getFirstName() {
        return Optional.ofNullable(firstName);
    }

    public Optional<Integer> getScore() {
        return Optional.ofNullable(score);
    }

    public Optional<Double> getMoney() {
        return Optional.ofNullable(money);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Integer> getPosition() {
        return Optional.ofNullable(position);
    }

    public List<Round> getRounds() {
        return Optional.ofNullable(rounds).orElse(Collections.emptyList());
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }
}
