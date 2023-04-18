package com.fanduel.modelgenerator.generated.sportradar.nhl.schedule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Broadcast {
    @JsonProperty("channel")
    private String channel;

    @JsonProperty("network")
    private String network;
}
