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
public class TimeZones {
    @JsonProperty("venue")
    private String venue;

    @JsonProperty("away")
    private String away;

    @JsonProperty("home")
    private String home;

    public Optional<String> getVenue() {
        return Optional.ofNullable(venue);
    }

    public Optional<String> getAway() {
        return Optional.ofNullable(away);
    }

    public Optional<String> getHome() {
        return Optional.ofNullable(home);
    }
}
