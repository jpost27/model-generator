
package com.fanduel.modelgenerator.sportradar.ncaaf.gamestatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "season",
    "week",
    "venue",
    "home",
    "away"
})
@Generated("jsonschema2pojo")
public class Summary {

    @JsonProperty("season")
    public Season season;
    @JsonProperty("week")
    public Week week;
    @JsonProperty("venue")
    public Venue venue;
    @JsonProperty("home")
    public Home home;
    @JsonProperty("away")
    public Away away;

}
