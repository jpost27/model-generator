package com.fanduel.modelgenerator.generated.sportradar.nfl.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class GameBoxscoreResponse {
    @JsonProperty("summary")
    private Summary summary;

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

    @JsonProperty("sr_id")
    private String srId;

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
}
