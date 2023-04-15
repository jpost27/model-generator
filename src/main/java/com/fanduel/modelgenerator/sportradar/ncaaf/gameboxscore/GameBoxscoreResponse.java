
package com.fanduel.modelgenerator.sportradar.ncaaf.gameboxscore;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "status",
    "scheduled",
    "attendance",
    "entry_mode",
    "clock",
    "quarter",
    "coverage",
    "game_type",
    "weather",
    "coin_toss",
    "summary",
    "situation",
    "last_event",
    "scoring",
    "scoring_drives",
    "scoring_plays",
    "_comment"
})
@Generated("jsonschema2pojo")
public class GameBoxscoreResponse {

    @JsonProperty("id")
    public String id;
    @JsonProperty("status")
    public String status;
    @JsonProperty("scheduled")
    public String scheduled;
    @JsonProperty("attendance")
    public Integer attendance;
    @JsonProperty("entry_mode")
    public String entryMode;
    @JsonProperty("clock")
    public String clock;
    @JsonProperty("quarter")
    public Integer quarter;
    @JsonProperty("coverage")
    public String coverage;
    @JsonProperty("game_type")
    public String gameType;
    @JsonProperty("weather")
    public Weather weather;
    @JsonProperty("coin_toss")
    public List<CoinTos> coinToss = new ArrayList<CoinTos>();
    @JsonProperty("summary")
    public Summary summary;
    @JsonProperty("situation")
    public Situation situation;
    @JsonProperty("last_event")
    public LastEvent lastEvent;
    @JsonProperty("scoring")
    public List<Scoring> scoring = new ArrayList<Scoring>();
    @JsonProperty("scoring_drives")
    public List<ScoringDrife> scoringDrives = new ArrayList<ScoringDrife>();
    @JsonProperty("scoring_plays")
    public List<ScoringPlay> scoringPlays = new ArrayList<ScoringPlay>();
    @JsonProperty("_comment")
    public String comment;

}
