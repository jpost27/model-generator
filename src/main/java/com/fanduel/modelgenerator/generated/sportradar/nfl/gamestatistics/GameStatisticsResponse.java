package com.fanduel.modelgenerator.generated.sportradar.nfl.gamestatistics;

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
public class GameStatisticsResponse {
    @JsonProperty("summary")
    private Summary summary;

    @JsonProperty("scheduled")
    private String scheduled;

    @JsonProperty("clock")
    private String clock;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("conference_game")
    private Boolean conferenceGame;

    @JsonProperty("weather")
    private Weather weather;

    @JsonProperty("_comment")
    private String comment;

    @JsonProperty("id")
    private String id;

    @JsonProperty("attendance")
    private Integer attendance;

    @JsonProperty("status")
    private String status;

    @JsonProperty("entry_mode")
    private String entryMode;

    @JsonProperty("quarter")
    private Integer quarter;

    @JsonProperty("statistics")
    private Statistics statistics;

    public Optional<Summary> getSummary() {
        return Optional.ofNullable(summary);
    }

    public Optional<String> getScheduled() {
        return Optional.ofNullable(scheduled);
    }

    public Optional<String> getClock() {
        return Optional.ofNullable(clock);
    }

    public Optional<String> getSrId() {
        return Optional.ofNullable(srId);
    }

    public Optional<Boolean> getConferenceGame() {
        return Optional.ofNullable(conferenceGame);
    }

    public Optional<Weather> getWeather() {
        return Optional.ofNullable(weather);
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

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }

    public Optional<String> getEntryMode() {
        return Optional.ofNullable(entryMode);
    }

    public Optional<Integer> getQuarter() {
        return Optional.ofNullable(quarter);
    }

    public Optional<Statistics> getStatistics() {
        return Optional.ofNullable(statistics);
    }
}
