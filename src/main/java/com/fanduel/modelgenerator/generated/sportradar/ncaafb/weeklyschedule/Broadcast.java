package com.fanduel.modelgenerator.generated.sportradar.ncaafb.weeklyschedule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Broadcast {
    @JsonProperty("satellite")
    private String satellite;

    @JsonProperty("network")
    private String network;

    public Optional<String> getSatellite() {
        return Optional.ofNullable(satellite);
    }

    public Optional<String> getNetwork() {
        return Optional.ofNullable(network);
    }
}
