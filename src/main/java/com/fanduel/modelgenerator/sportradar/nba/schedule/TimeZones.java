
package com.fanduel.modelgenerator.sportradar.nba.schedule;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "venue",
    "home",
    "away"
})
@Generated("jsonschema2pojo")
public class TimeZones {

    @JsonProperty("venue")
    public String venue;
    @JsonProperty("home")
    public String home;
    @JsonProperty("away")
    public String away;

}
