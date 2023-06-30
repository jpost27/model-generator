package com.fanduel.modelgenerator.generated.sportradar.mlb.dailyboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Runner {
    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("starting_base")
    private Integer startingBase;

    @JsonProperty("jersey_number")
    private String jerseyNumber;

    @JsonProperty("preferred_name")
    private String preferredName;

    @JsonProperty("id")
    private String id;

    public Optional<String> getFirstName() {
        return Optional.ofNullable(firstName);
    }

    public Optional<String> getLastName() {
        return Optional.ofNullable(lastName);
    }

    public Optional<Integer> getStartingBase() {
        return Optional.ofNullable(startingBase);
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
}
