package com.fanduel.modelgenerator.generated.sportradar.mlb.teamprofile;

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
public class TeamProfileResponse {
    @JsonProperty("market")
    private String market;

    @JsonProperty("division")
    private Division division;

    @JsonProperty("venue")
    private Venue venue;

    @JsonProperty("players")
    private List<Player> players;

    @JsonProperty("league")
    private League league;

    @JsonProperty("name")
    private String name;

    @JsonProperty("staff")
    private List<Staff> staff;

    @JsonProperty("_comment")
    private String comment;

    @JsonProperty("id")
    private String id;

    @JsonProperty("abbr")
    private String abbr;

    public Optional<String> getMarket() {
        return Optional.ofNullable(market);
    }

    public Optional<Division> getDivision() {
        return Optional.ofNullable(division);
    }

    public Optional<Venue> getVenue() {
        return Optional.ofNullable(venue);
    }

    public List<Player> getPlayers() {
        return Optional.ofNullable(players).orElse(Collections.emptyList());
    }

    public Optional<League> getLeague() {
        return Optional.ofNullable(league);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public List<Staff> getStaff() {
        return Optional.ofNullable(staff).orElse(Collections.emptyList());
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getAbbr() {
        return Optional.ofNullable(abbr);
    }
}
