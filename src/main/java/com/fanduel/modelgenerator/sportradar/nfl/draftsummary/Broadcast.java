
package com.fanduel.modelgenerator.sportradar.nfl.draftsummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "channel",
    "network"
})
@Generated("jsonschema2pojo")
public class Broadcast {

    @JsonProperty("channel")
    public String channel;
    @JsonProperty("network")
    public String network;

}
