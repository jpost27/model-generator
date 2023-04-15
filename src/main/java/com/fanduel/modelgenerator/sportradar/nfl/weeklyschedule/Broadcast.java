
package com.fanduel.modelgenerator.sportradar.nfl.weeklyschedule;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "network",
    "satellite"
})
@Generated("jsonschema2pojo")
public class Broadcast {

    @JsonProperty("network")
    public String network;
    @JsonProperty("satellite")
    public String satellite;

}
