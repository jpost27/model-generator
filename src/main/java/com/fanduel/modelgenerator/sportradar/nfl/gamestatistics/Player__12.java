
package com.fanduel.modelgenerator.sportradar.nfl.gamestatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "jersey",
    "position",
    "sr_id",
    "first_downs",
    "avg_yards",
    "attempts",
    "touchdowns",
    "yards",
    "longest",
    "redzone_attempts",
    "tlost",
    "tlost_yards",
    "broken_tackles",
    "kneel_downs",
    "scrambles",
    "yards_after_contact",
    "longest_touchdown"
})
@Generated("jsonschema2pojo")
public class Player__12 {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("jersey")
    public String jersey;
    @JsonProperty("position")
    public String position;
    @JsonProperty("sr_id")
    public String srId;
    @JsonProperty("first_downs")
    public Integer firstDowns;
    @JsonProperty("avg_yards")
    public Double avgYards;
    @JsonProperty("attempts")
    public Integer attempts;
    @JsonProperty("touchdowns")
    public Integer touchdowns;
    @JsonProperty("yards")
    public Integer yards;
    @JsonProperty("longest")
    public Integer longest;
    @JsonProperty("redzone_attempts")
    public Integer redzoneAttempts;
    @JsonProperty("tlost")
    public Integer tlost;
    @JsonProperty("tlost_yards")
    public Integer tlostYards;
    @JsonProperty("broken_tackles")
    public Integer brokenTackles;
    @JsonProperty("kneel_downs")
    public Integer kneelDowns;
    @JsonProperty("scrambles")
    public Integer scrambles;
    @JsonProperty("yards_after_contact")
    public Integer yardsAfterContact;
    @JsonProperty("longest_touchdown")
    public Integer longestTouchdown;

}
