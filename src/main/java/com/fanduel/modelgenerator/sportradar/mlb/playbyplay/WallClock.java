
package com.fanduel.modelgenerator.sportradar.mlb.playbyplay;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "start_time",
    "end_time"
})
@Generated("jsonschema2pojo")
public class WallClock {

    @JsonProperty("start_time")
    public String startTime;
    @JsonProperty("end_time")
    public String endTime;

}
