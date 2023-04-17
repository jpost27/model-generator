package com.fanduel.modelgenerator.generated.sportradar.nba.playintournament;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Broadcast {
    @JsonProperty("channel")
    private String channel;

    @JsonProperty("type")
    private String type;

    @JsonProperty("locale")
    private String locale;

    @JsonProperty("network")
    private String network;
}
