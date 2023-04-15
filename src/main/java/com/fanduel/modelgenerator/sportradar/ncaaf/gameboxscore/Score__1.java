
package com.fanduel.modelgenerator.sportradar.ncaaf.gameboxscore;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sequence",
    "clock",
    "points",
    "home_points",
    "away_points",
    "points-after-play"
})
@Generated("jsonschema2pojo")
public class Score__1 {

    @JsonProperty("sequence")
    public Integer sequence;
    @JsonProperty("clock")
    public String clock;
    @JsonProperty("points")
    public Integer points;
    @JsonProperty("home_points")
    public Integer homePoints;
    @JsonProperty("away_points")
    public Integer awayPoints;
    @JsonProperty("points-after-play")
    public PointsAfterPlay__1 pointsAfterPlay;

}
