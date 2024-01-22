package com.fanduel.modelgenerator.generated.nflv7.gameroster;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
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
public class GameRosterResponse {
    @JsonProperty("summary")
    private Summary summary;

    @JsonProperty("away")
    private Away away;

    @JsonProperty("scheduled")
    private String scheduled;

    @JsonProperty("clock")
    private String clock;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("conference_game")
    private Boolean conferenceGame;

    @JsonProperty("home")
    private Home home;

    @JsonProperty("duration")
    private String duration;

    @JsonProperty("weather")
    private Weather weather;

    @JsonProperty("officials")
    private List<Official> officials;

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

    public Optional<Summary> getSummary() {
        return Optional.ofNullable(summary);
    }

    public Optional<Away> getAway() {
        return Optional.ofNullable(away);
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

    public Optional<Home> getHome() {
        return Optional.ofNullable(home);
    }

    public Optional<String> getDuration() {
        return Optional.ofNullable(duration);
    }

    public Optional<Weather> getWeather() {
        return Optional.ofNullable(weather);
    }

    public List<Official> getOfficials() {
        return Optional.ofNullable(officials).orElse(Collections.emptyList());
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
}
