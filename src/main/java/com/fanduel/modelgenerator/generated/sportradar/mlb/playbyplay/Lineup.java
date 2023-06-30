package com.fanduel.modelgenerator.generated.sportradar.mlb.playbyplay;

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
public class Lineup {
    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("sequence_number")
    private Integer sequenceNumber;

    @JsonProperty("team_id")
    private String teamId;

    @JsonProperty("jersey_number")
    private String jerseyNumber;

    @JsonProperty("description")
    private String description;

    @JsonProperty("position")
    private Integer position;

    @JsonProperty("preferred_name")
    private String preferredName;

    @JsonProperty("id")
    private String id;

    @JsonProperty("player_id")
    private String playerId;

    @JsonProperty("order")
    private Integer order;

    public Optional<String> getFirstName() {
        return Optional.ofNullable(firstName);
    }

    public Optional<String> getLastName() {
        return Optional.ofNullable(lastName);
    }

    public Optional<Integer> getSequenceNumber() {
        return Optional.ofNullable(sequenceNumber);
    }

    public Optional<String> getTeamId() {
        return Optional.ofNullable(teamId);
    }

    public Optional<String> getJerseyNumber() {
        return Optional.ofNullable(jerseyNumber);
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }

    public Optional<Integer> getPosition() {
        return Optional.ofNullable(position);
    }

    public Optional<String> getPreferredName() {
        return Optional.ofNullable(preferredName);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getPlayerId() {
        return Optional.ofNullable(playerId);
    }

    public Optional<Integer> getOrder() {
        return Optional.ofNullable(order);
    }
}
