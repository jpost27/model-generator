package com.fanduel.modelgenerator.generated.sportradar.ncaafb.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
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
public class GameBoxscoreResponse {
    @JsonProperty("coverage")
    private String coverage;

    @JsonProperty("summary")
    private Summary summary;

    @JsonProperty("game_type")
    private String gameType;

    @JsonProperty("scoring")
    private List<Scoring> scoring;

    @JsonProperty("scoring_plays")
    private List<ScoringPlay> scoringPlays;

    @JsonProperty("scheduled")
    private String scheduled;

    @JsonProperty("coin_toss")
    private List<CoinTos> coinToss;

    @JsonProperty("clock")
    private String clock;

    @JsonProperty("last_event")
    private LastEvent lastEvent;

    @JsonProperty("weather")
    private Weather weather;

    @JsonProperty("scoring_drives")
    private List<ScoringDrife> scoringDrives;

    @JsonProperty("_comment")
    private String comment;

    @JsonProperty("id")
    private String id;

    @JsonProperty("attendance")
    private Integer attendance;

    @JsonProperty("situation")
    private Situation situation;

    @JsonProperty("status")
    private String status;

    @JsonProperty("entry_mode")
    private String entryMode;

    @JsonProperty("quarter")
    private Integer quarter;

    public Optional<String> getCoverage() {
        return Optional.ofNullable(coverage);
    }

    public Optional<Summary> getSummary() {
        return Optional.ofNullable(summary);
    }

    public Optional<String> getGameType() {
        return Optional.ofNullable(gameType);
    }

    public List<Scoring> getScoring() {
        return Optional.ofNullable(scoring).orElse(Collections.emptyList());
    }

    public List<ScoringPlay> getScoringPlays() {
        return Optional.ofNullable(scoringPlays).orElse(Collections.emptyList());
    }

    public Optional<String> getScheduled() {
        return Optional.ofNullable(scheduled);
    }

    public List<CoinTos> getCoinToss() {
        return Optional.ofNullable(coinToss).orElse(Collections.emptyList());
    }

    public Optional<String> getClock() {
        return Optional.ofNullable(clock);
    }

    public Optional<LastEvent> getLastEvent() {
        return Optional.ofNullable(lastEvent);
    }

    public Optional<Weather> getWeather() {
        return Optional.ofNullable(weather);
    }

    public List<ScoringDrife> getScoringDrives() {
        return Optional.ofNullable(scoringDrives).orElse(Collections.emptyList());
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Integer> getAttendance() {
        return Optional.ofNullable(attendance);
    }

    public Optional<Situation> getSituation() {
        return Optional.ofNullable(situation);
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }

    public Optional<String> getEntryMode() {
        return Optional.ofNullable(entryMode);
    }

    public Optional<Integer> getQuarter() {
        return Optional.ofNullable(quarter);
    }
}
