
package com.fanduel.modelgenerator.sportradar.ncaaf.seasonschedule;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "home_points",
    "away_points",
    "periods"
})
@Generated("jsonschema2pojo")
public class Scoring {

    @JsonProperty("home_points")
    public Integer homePoints;
    @JsonProperty("away_points")
    public Integer awayPoints;
    @JsonProperty("periods")
    public List<Period> periods = new ArrayList<Period>();

}
