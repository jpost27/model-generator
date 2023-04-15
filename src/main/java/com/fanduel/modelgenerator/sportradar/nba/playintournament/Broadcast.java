
package com.fanduel.modelgenerator.sportradar.nba.playintournament;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "network",
    "type",
    "locale",
    "channel"
})
@Generated("jsonschema2pojo")
public class Broadcast {

    @JsonProperty("network")
    public String network;
    @JsonProperty("type")
    public String type;
    @JsonProperty("locale")
    public String locale;
    @JsonProperty("channel")
    public String channel;

}
