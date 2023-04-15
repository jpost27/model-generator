
package com.fanduel.modelgenerator.sportradar.nfl.seasonschedule;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "network",
    "satellite",
    "internet"
})
@Generated("jsonschema2pojo")
public class Broadcast {

    @JsonProperty("network")
    public String network;
    @JsonProperty("satellite")
    public String satellite;
    @JsonProperty("internet")
    public String internet;

}
