package com.fanduel.modelgenerator.generated.manual.NfNflPlayerStatlines.nfnflplayerstatlines;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
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
public class Statline {
    @JsonProperty("date")
    private String date;

    @JsonProperty("opponent_sport_radar_team_id")
    private String opponentSportRadarTeamId;

    @JsonProperty("opponent_id")
    private String opponentId;

    @JsonProperty("xp_miss")
    private String xpMiss;

    @JsonProperty("week")
    private String week;

    @JsonProperty("fg_miss")
    private String fgMiss;

    @JsonProperty("fum_lost")
    private String fumLost;

    @JsonProperty("fg_miss_50")
    private String fgMiss50;

    @JsonProperty("fg_miss_30")
    private String fgMiss30;

    @JsonProperty("xp_a")
    private String xpA;

    @JsonProperty("fp")
    private Integer fp;

    @JsonProperty("fg_a_17")
    private String fgA17;

    @JsonProperty("targets")
    private String targets;

    @JsonProperty("rec")
    private String rec;

    @JsonProperty("fg_a_40")
    private String fgA40;

    @JsonProperty("fg_a_20")
    private String fgA20;

    @JsonProperty("rec_tds")
    private String recTds;

    @JsonProperty("fg_made_50")
    private String fgMade50;

    @JsonProperty("rec_yards")
    private String recYards;

    @JsonProperty("opponent")
    private String opponent;

    @JsonProperty("fg_made_30")
    private String fgMade30;

    @JsonProperty("fg_made_17")
    private String fgMade17;

    @JsonProperty("season")
    private String season;

    @JsonProperty("rush_yards")
    private String rushYards;

    @JsonProperty("rush_attempts")
    private String rushAttempts;

    @JsonProperty("playoffs")
    private Boolean playoffs;

    @JsonProperty("pass_completions")
    private String passCompletions;

    @JsonProperty("pass_ints")
    private String passInts;

    @JsonProperty("fg_a")
    private String fgA;

    @JsonProperty("fg_miss_40")
    private String fgMiss40;

    @JsonProperty("fg_miss_20")
    private String fgMiss20;

    @JsonProperty("pass_yards")
    private String passYards;

    @JsonProperty("fg_made")
    private String fgMade;

    @JsonProperty("fg_made_20")
    private String fgMade20;

    @JsonProperty("fg_a_30")
    private String fgA30;

    @JsonProperty("fg_made_40")
    private String fgMade40;

    @JsonProperty("fg_a_50")
    private String fgA50;

    @JsonProperty("team_id")
    private String teamId;

    @JsonProperty("pass_attempts")
    private String passAttempts;

    @JsonProperty("pass_tds")
    private String passTds;

    @JsonProperty("rush_tds")
    private String rushTds;

    @JsonProperty("xp_made")
    private String xpMade;

    @JsonProperty("sacks")
    private String sacks;

    @JsonProperty("fg_miss_17")
    private String fgMiss17;

    public Optional<String> getDate() {
        return Optional.ofNullable(date);
    }

    public Optional<String> getOpponentSportRadarTeamId() {
        return Optional.ofNullable(opponentSportRadarTeamId);
    }

    public Optional<String> getOpponentId() {
        return Optional.ofNullable(opponentId);
    }

    public Optional<String> getXpMiss() {
        return Optional.ofNullable(xpMiss);
    }

    public Optional<String> getWeek() {
        return Optional.ofNullable(week);
    }

    public Optional<String> getFgMiss() {
        return Optional.ofNullable(fgMiss);
    }

    public Optional<String> getFumLost() {
        return Optional.ofNullable(fumLost);
    }

    public Optional<String> getFgMiss50() {
        return Optional.ofNullable(fgMiss50);
    }

    public Optional<String> getFgMiss30() {
        return Optional.ofNullable(fgMiss30);
    }

    public Optional<String> getXpA() {
        return Optional.ofNullable(xpA);
    }

    public Optional<Integer> getFp() {
        return Optional.ofNullable(fp);
    }

    public Optional<String> getFgA17() {
        return Optional.ofNullable(fgA17);
    }

    public Optional<String> getTargets() {
        return Optional.ofNullable(targets);
    }

    public Optional<String> getRec() {
        return Optional.ofNullable(rec);
    }

    public Optional<String> getFgA40() {
        return Optional.ofNullable(fgA40);
    }

    public Optional<String> getFgA20() {
        return Optional.ofNullable(fgA20);
    }

    public Optional<String> getRecTds() {
        return Optional.ofNullable(recTds);
    }

    public Optional<String> getFgMade50() {
        return Optional.ofNullable(fgMade50);
    }

    public Optional<String> getRecYards() {
        return Optional.ofNullable(recYards);
    }

    public Optional<String> getOpponent() {
        return Optional.ofNullable(opponent);
    }

    public Optional<String> getFgMade30() {
        return Optional.ofNullable(fgMade30);
    }

    public Optional<String> getFgMade17() {
        return Optional.ofNullable(fgMade17);
    }

    public Optional<String> getSeason() {
        return Optional.ofNullable(season);
    }

    public Optional<String> getRushYards() {
        return Optional.ofNullable(rushYards);
    }

    public Optional<String> getRushAttempts() {
        return Optional.ofNullable(rushAttempts);
    }

    public Optional<Boolean> getPlayoffs() {
        return Optional.ofNullable(playoffs);
    }

    public Optional<String> getPassCompletions() {
        return Optional.ofNullable(passCompletions);
    }

    public Optional<String> getPassInts() {
        return Optional.ofNullable(passInts);
    }

    public Optional<String> getFgA() {
        return Optional.ofNullable(fgA);
    }

    public Optional<String> getFgMiss40() {
        return Optional.ofNullable(fgMiss40);
    }

    public Optional<String> getFgMiss20() {
        return Optional.ofNullable(fgMiss20);
    }

    public Optional<String> getPassYards() {
        return Optional.ofNullable(passYards);
    }

    public Optional<String> getFgMade() {
        return Optional.ofNullable(fgMade);
    }

    public Optional<String> getFgMade20() {
        return Optional.ofNullable(fgMade20);
    }

    public Optional<String> getFgA30() {
        return Optional.ofNullable(fgA30);
    }

    public Optional<String> getFgMade40() {
        return Optional.ofNullable(fgMade40);
    }

    public Optional<String> getFgA50() {
        return Optional.ofNullable(fgA50);
    }

    public Optional<String> getTeamId() {
        return Optional.ofNullable(teamId);
    }

    public Optional<String> getPassAttempts() {
        return Optional.ofNullable(passAttempts);
    }

    public Optional<String> getPassTds() {
        return Optional.ofNullable(passTds);
    }

    public Optional<String> getRushTds() {
        return Optional.ofNullable(rushTds);
    }

    public Optional<String> getXpMade() {
        return Optional.ofNullable(xpMade);
    }

    public Optional<String> getSacks() {
        return Optional.ofNullable(sacks);
    }

    public Optional<String> getFgMiss17() {
        return Optional.ofNullable(fgMiss17);
    }
}
