
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
    "receptions",
    "targets",
    "yards",
    "avg_yards",
    "longest",
    "touchdowns",
    "longest_touchdown",
    "yards_after_catch",
    "redzone_targets",
    "air_yards",
    "broken_tackles",
    "dropped_passes",
    "catchable_passes",
    "yards_after_contact"
})
@Generated("jsonschema2pojo")
public class Player__1 {

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
    @JsonProperty("receptions")
    public Integer receptions;
    @JsonProperty("targets")
    public Integer targets;
    @JsonProperty("yards")
    public Integer yards;
    @JsonProperty("avg_yards")
    public Double avgYards;
    @JsonProperty("longest")
    public Integer longest;
    @JsonProperty("touchdowns")
    public Integer touchdowns;
    @JsonProperty("longest_touchdown")
    public Integer longestTouchdown;
    @JsonProperty("yards_after_catch")
    public Integer yardsAfterCatch;
    @JsonProperty("redzone_targets")
    public Integer redzoneTargets;
    @JsonProperty("air_yards")
    public Integer airYards;
    @JsonProperty("broken_tackles")
    public Integer brokenTackles;
    @JsonProperty("dropped_passes")
    public Integer droppedPasses;
    @JsonProperty("catchable_passes")
    public Integer catchablePasses;
    @JsonProperty("yards_after_contact")
    public Integer yardsAfterContact;

}
