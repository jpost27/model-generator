package com.fanduel.modelgenerator.generated.nflv7.teamprofile;

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
public class TeamProfileResponse {
    @JsonProperty("venue")
    private Venue venue;

    @JsonProperty("franchise")
    private Franchise franchise;

    @JsonProperty("conference")
    private Conference conference;

    @JsonProperty("general_manager")
    private String generalManager;

    @JsonProperty("mascot")
    private String mascot;

    @JsonProperty("fight_song")
    private String fightSong;

    @JsonProperty("conference_titles")
    private Integer conferenceTitles;

    @JsonProperty("division")
    private Division division;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("id")
    private String id;

    @JsonProperty("nicknames")
    private String nicknames;

    @JsonProperty("owner")
    private String owner;

    @JsonProperty("championship_seasons")
    private String championshipSeasons;

    @JsonProperty("players")
    private List<Player> players;

    @JsonProperty("founded")
    private Integer founded;

    @JsonProperty("championships_won")
    private Integer championshipsWon;

    @JsonProperty("division_titles")
    private Integer divisionTitles;

    @JsonProperty("team_colors")
    private List<TeamColor> teamColors;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("market")
    private String market;

    @JsonProperty("coaches")
    private List<Coach> coaches;

    @JsonProperty("playoff_appearances")
    private Integer playoffAppearances;

    @JsonProperty("name")
    private String name;

    @JsonProperty("_comment")
    private String comment;

    @JsonProperty("president")
    private String president;

    public Optional<Venue> getVenue() {
        return Optional.ofNullable(venue);
    }

    public Optional<Franchise> getFranchise() {
        return Optional.ofNullable(franchise);
    }

    public Optional<Conference> getConference() {
        return Optional.ofNullable(conference);
    }

    public Optional<String> getGeneralManager() {
        return Optional.ofNullable(generalManager);
    }

    public Optional<String> getMascot() {
        return Optional.ofNullable(mascot);
    }

    public Optional<String> getFightSong() {
        return Optional.ofNullable(fightSong);
    }

    public Optional<Integer> getConferenceTitles() {
        return Optional.ofNullable(conferenceTitles);
    }

    public Optional<Division> getDivision() {
        return Optional.ofNullable(division);
    }

    public Optional<String> getAlias() {
        return Optional.ofNullable(alias);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getNicknames() {
        return Optional.ofNullable(nicknames);
    }

    public Optional<String> getOwner() {
        return Optional.ofNullable(owner);
    }

    public Optional<String> getChampionshipSeasons() {
        return Optional.ofNullable(championshipSeasons);
    }

    public List<Player> getPlayers() {
        return Optional.ofNullable(players).orElse(Collections.emptyList());
    }

    public Optional<Integer> getFounded() {
        return Optional.ofNullable(founded);
    }

    public Optional<Integer> getChampionshipsWon() {
        return Optional.ofNullable(championshipsWon);
    }

    public Optional<Integer> getDivisionTitles() {
        return Optional.ofNullable(divisionTitles);
    }

    public List<TeamColor> getTeamColors() {
        return Optional.ofNullable(teamColors).orElse(Collections.emptyList());
    }

    public Optional<String> getSrId() {
        return Optional.ofNullable(srId);
    }

    public Optional<String> getMarket() {
        return Optional.ofNullable(market);
    }

    public List<Coach> getCoaches() {
        return Optional.ofNullable(coaches).orElse(Collections.emptyList());
    }

    public Optional<Integer> getPlayoffAppearances() {
        return Optional.ofNullable(playoffAppearances);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }

    public Optional<String> getPresident() {
        return Optional.ofNullable(president);
    }
}
