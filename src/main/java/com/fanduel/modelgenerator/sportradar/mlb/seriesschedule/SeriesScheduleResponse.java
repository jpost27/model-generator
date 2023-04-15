
package com.fanduel.modelgenerator.sportradar.mlb.seriesschedule;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "league",
    "season",
    "series",
    "_comment"
})
@Generated("jsonschema2pojo")
public class SeriesScheduleResponse {

    @JsonProperty("league")
    public League league;
    @JsonProperty("season")
    public Season season;
    @JsonProperty("series")
    public List<Object> series = new ArrayList<Object>();
    @JsonProperty("_comment")
    public String comment;

}
