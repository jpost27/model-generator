package com.fanduel.modelgenerator.generated.sportradar.ncaafb.teamroster;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class TeamRosterResponse {
    @JsonProperty("market")
    private String market;

    @JsonProperty("division")
    private Division division;

    @JsonProperty("coaches")
    private List<Coach> coaches;

    @JsonProperty("subdivision")
    private String subdivision;

    @JsonProperty("venue")
    private Venue venue;

    @JsonProperty("franchise")
    private Franchise franchise;

    @JsonProperty("conference")
    private Conference conference;

    @JsonProperty("players")
    private List<Player> players;

    @JsonProperty("name")
    private String name;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("_comment")
    private String comment;

    @JsonProperty("id")
    private String id;

    public Optional<String> getMarket() {
        return Optional.ofNullable(market);
    }

    public Optional<Division> getDivision() {
        return Optional.ofNullable(division);
    }

    public List<Coach> getCoaches() {
        return Optional.ofNullable(coaches).orElse(Collections.emptyList());
    }

    public Optional<String> getSubdivision() {
        return Optional.ofNullable(subdivision);
    }

    public Optional<Venue> getVenue() {
        return Optional.ofNullable(venue);
    }

    public Optional<Franchise> getFranchise() {
        return Optional.ofNullable(franchise);
    }

    public Optional<Conference> getConference() {
        return Optional.ofNullable(conference);
    }

    public List<Player> getPlayers() {
        return Optional.ofNullable(players).orElse(Collections.emptyList());
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<String> getAlias() {
        return Optional.ofNullable(alias);
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }
}
