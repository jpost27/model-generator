package com.fanduel.modelgenerator.generated.nbav7.teamprofilerosters;

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
public class TeamProfileRostersResponse {
    @JsonProperty("venue")
    private Venue venue;

    @JsonProperty("conference")
    private Conference conference;

    @JsonProperty("players")
    private List<Player> players;

    @JsonProperty("league")
    private League league;

    @JsonProperty("founded")
    private Integer founded;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("market")
    private String market;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("division")
    private Division division;

    @JsonProperty("coaches")
    private List<Coach> coaches;

    @JsonProperty("name")
    private String name;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("id")
    private String id;

    public Optional<Venue> getVenue() {
        return Optional.ofNullable(venue);
    }

    public Optional<Conference> getConference() {
        return Optional.ofNullable(conference);
    }

    public List<Player> getPlayers() {
        return Optional.ofNullable(players).orElse(Collections.emptyList());
    }

    public Optional<League> getLeague() {
        return Optional.ofNullable(league);
    }

    public Optional<Integer> getFounded() {
        return Optional.ofNullable(founded);
    }

    public Optional<String> getSrId() {
        return Optional.ofNullable(srId);
    }

    public Optional<String> getMarket() {
        return Optional.ofNullable(market);
    }

    public Optional<String> getReference() {
        return Optional.ofNullable(reference);
    }

    public Optional<Division> getDivision() {
        return Optional.ofNullable(division);
    }

    public List<Coach> getCoaches() {
        return Optional.ofNullable(coaches).orElse(Collections.emptyList());
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<String> getAlias() {
        return Optional.ofNullable(alias);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }
}
