package com.fanduel.modelgenerator.generated.nflv7.weeklyschedule;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Setter
@Accessors(
        chain = true
)
@JsonIgnoreProperties(
        ignoreUnknown = true
)
@EqualsAndHashCode
@ToString
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
