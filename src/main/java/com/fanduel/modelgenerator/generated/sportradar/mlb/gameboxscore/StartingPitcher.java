package com.fanduel.modelgenerator.generated.sportradar.mlb.gameboxscore;

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
public class StartingPitcher {
    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("loss")
    private Integer loss;

    @JsonProperty("era")
    private Double era;

    @JsonProperty("jersey_number")
    private String jerseyNumber;

    @JsonProperty("preferred_name")
    private String preferredName;

    @JsonProperty("id")
    private String id;

    @JsonProperty("win")
    private Integer win;

    public Optional<String> getFirstName() {
        return Optional.ofNullable(firstName);
    }

    public Optional<String> getLastName() {
        return Optional.ofNullable(lastName);
    }

    public Optional<Integer> getLoss() {
        return Optional.ofNullable(loss);
    }

    public Optional<Double> getEra() {
        return Optional.ofNullable(era);
    }

    public Optional<String> getJerseyNumber() {
        return Optional.ofNullable(jerseyNumber);
    }

    public Optional<String> getPreferredName() {
        return Optional.ofNullable(preferredName);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Integer> getWin() {
        return Optional.ofNullable(win);
    }
}
