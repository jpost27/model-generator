package com.fanduel.modelgenerator.generated.sportradar.nfl.seasonschedule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Broadcast {
    @JsonProperty("satellite")
    private String satellite;

    @JsonProperty("internet")
    private String internet;

    @JsonProperty("network")
    private String network;
}
