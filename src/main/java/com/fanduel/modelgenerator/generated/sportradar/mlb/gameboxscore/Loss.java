package com.fanduel.modelgenerator.generated.sportradar.mlb.gameboxscore;

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
public class Loss {
    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("save")
    private Integer save;

    @JsonProperty("primary_position")
    private String primaryPosition;

    @JsonProperty("hold")
    private Integer hold;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("loss")
    private Integer loss;

    @JsonProperty("blown_save")
    private Integer blownSave;

    @JsonProperty("jersey_number")
    private String jerseyNumber;

    @JsonProperty("preferred_name")
    private String preferredName;

    @JsonProperty("position")
    private String position;

    @JsonProperty("id")
    private String id;

    @JsonProperty("win")
    private Integer win;

    @JsonProperty("status")
    private String status;

    public Optional<String> getLastName() {
        return Optional.ofNullable(lastName);
    }

    public Optional<Integer> getSave() {
        return Optional.ofNullable(save);
    }

    public Optional<String> getPrimaryPosition() {
        return Optional.ofNullable(primaryPosition);
    }

    public Optional<Integer> getHold() {
        return Optional.ofNullable(hold);
    }

    public Optional<String> getFirstName() {
        return Optional.ofNullable(firstName);
    }

    public Optional<Integer> getLoss() {
        return Optional.ofNullable(loss);
    }

    public Optional<Integer> getBlownSave() {
        return Optional.ofNullable(blownSave);
    }

    public Optional<String> getJerseyNumber() {
        return Optional.ofNullable(jerseyNumber);
    }

    public Optional<String> getPreferredName() {
        return Optional.ofNullable(preferredName);
    }

    public Optional<String> getPosition() {
        return Optional.ofNullable(position);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Integer> getWin() {
        return Optional.ofNullable(win);
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }
}
