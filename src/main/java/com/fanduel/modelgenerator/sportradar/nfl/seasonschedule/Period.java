
package com.fanduel.modelgenerator.sportradar.nfl.seasonschedule;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "period_type",
    "id",
    "number",
    "sequence",
    "home_points",
    "away_points"
})
@Generated("jsonschema2pojo")
public class Period {

    @JsonProperty("period_type")
    public String periodType;
    @JsonProperty("id")
    public String id;
    @JsonProperty("number")
    public Integer number;
    @JsonProperty("sequence")
    public Integer sequence;
    @JsonProperty("home_points")
    public Integer homePoints;
    @JsonProperty("away_points")
    public Integer awayPoints;

}
