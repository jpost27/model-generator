package com.fanduel.modelgenerator.generated.nbav7.schedule;

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
    @JsonProperty("channel")
    private String channel;

    @JsonProperty("type")
    private String type;

    @JsonProperty("locale")
    private String locale;

    @JsonProperty("network")
    private String network;

    public Optional<String> getChannel() {
        return Optional.ofNullable(channel);
    }

    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }

    public Optional<String> getLocale() {
        return Optional.ofNullable(locale);
    }

    public Optional<String> getNetwork() {
        return Optional.ofNullable(network);
    }
}
