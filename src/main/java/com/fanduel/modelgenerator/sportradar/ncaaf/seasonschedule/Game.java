
package com.fanduel.modelgenerator.sportradar.ncaaf.seasonschedule;

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
    "coverage",
    "neutral_site",
    "game_type",
    "venue",
    "home",
    "away",
    "broadcast",
    "scoring",
    "weather",
    "title"
})
@Generated("jsonschema2pojo")
public class Game {

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
    @JsonProperty("coverage")
    public String coverage;
    @JsonProperty("neutral_site")
    public Boolean neutralSite;
    @JsonProperty("game_type")
    public String gameType;
    @JsonProperty("venue")
    public Venue venue;
    @JsonProperty("home")
    public Home home;
    @JsonProperty("away")
    public Away away;
    @JsonProperty("broadcast")
    public Broadcast broadcast;
    @JsonProperty("scoring")
    public Scoring scoring;
    @JsonProperty("weather")
    public Weather weather;
    @JsonProperty("title")
    public String title;

}
