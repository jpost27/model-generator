
package com.fanduel.modelgenerator.sportradar.mlb.dailyschedule;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "status",
    "coverage",
    "game_number",
    "day_night",
    "scheduled",
    "home_team",
    "away_team",
    "attendance",
    "duration",
    "double_header",
    "entry_mode",
    "reference",
    "venue",
    "home",
    "away",
    "broadcast"
})
@Generated("jsonschema2pojo")
public class Game {

    @JsonProperty("id")
    public String id;
    @JsonProperty("status")
    public String status;
    @JsonProperty("coverage")
    public String coverage;
    @JsonProperty("game_number")
    public Integer gameNumber;
    @JsonProperty("day_night")
    public String dayNight;
    @JsonProperty("scheduled")
    public String scheduled;
    @JsonProperty("home_team")
    public String homeTeam;
    @JsonProperty("away_team")
    public String awayTeam;
    @JsonProperty("attendance")
    public Integer attendance;
    @JsonProperty("duration")
    public String duration;
    @JsonProperty("double_header")
    public Boolean doubleHeader;
    @JsonProperty("entry_mode")
    public String entryMode;
    @JsonProperty("reference")
    public String reference;
    @JsonProperty("venue")
    public Venue venue;
    @JsonProperty("home")
    public Home home;
    @JsonProperty("away")
    public Away away;
    @JsonProperty("broadcast")
    public Broadcast broadcast;

}
