
package com.fanduel.modelgenerator.sportradar.ncaaf.dailychangelog;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "league",
    "start_time",
    "end_time",
    "_comment"
})
@Generated("jsonschema2pojo")
public class DailyChangeLogResponse {

    @JsonProperty("league")
    public League league;
    @JsonProperty("start_time")
    public String startTime;
    @JsonProperty("end_time")
    public String endTime;
    @JsonProperty("_comment")
    public String comment;

}
