package com.fanduel.modelgenerator.generated.nbav7.gamesummary;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.String;
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

    @JsonProperty("on_court")
    private Boolean onCourt;

    @JsonProperty("starter")
    private Boolean starter;

    @JsonProperty("ejected")
    private Boolean ejected;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("active")
    private Boolean active;

    @JsonProperty("name_suffix")
    private String nameSuffix;

    @JsonProperty("played")
    private Boolean played;

    @JsonProperty("primary_position")
    private String primaryPosition;

    @JsonProperty("not_playing_reason")
    private String notPlayingReason;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("not_playing_description")
    private String notPlayingDescription;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("jersey_number")
    private String jerseyNumber;

    @JsonProperty("id")
    private String id;

    @JsonProperty("position")
    private String position;

    @JsonProperty("statistics")
    private Statistics statistics;

    public Optional<String> getLastName() {
        return Optional.ofNullable(lastName);
    }

    public Optional<Boolean> getOnCourt() {
        return Optional.ofNullable(onCourt);
    }

    public Optional<Boolean> getStarter() {
        return Optional.ofNullable(starter);
    }

    public Optional<Boolean> getEjected() {
        return Optional.ofNullable(ejected);
    }

    public Optional<String> getFullName() {
        return Optional.ofNullable(fullName);
    }

    public Optional<Boolean> getActive() {
        return Optional.ofNullable(active);
    }

    public Optional<String> getNameSuffix() {
        return Optional.ofNullable(nameSuffix);
    }

    public Optional<Boolean> getPlayed() {
        return Optional.ofNullable(played);
    }

    public Optional<String> getPrimaryPosition() {
        return Optional.ofNullable(primaryPosition);
    }

    public Optional<String> getNotPlayingReason() {
        return Optional.ofNullable(notPlayingReason);
    }

    public Optional<String> getSrId() {
        return Optional.ofNullable(srId);
    }

    public Optional<String> getNotPlayingDescription() {
        return Optional.ofNullable(notPlayingDescription);
    }

    public Optional<String> getReference() {
        return Optional.ofNullable(reference);
    }

    public Optional<String> getFirstName() {
        return Optional.ofNullable(firstName);
    }

    public Optional<String> getJerseyNumber() {
        return Optional.ofNullable(jerseyNumber);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getPosition() {
        return Optional.ofNullable(position);
    }

    public Optional<Statistics> getStatistics() {
        return Optional.ofNullable(statistics);
    }
}
