package com.fanduel.modelgenerator.generated.sportradar.mlb.leaguehierarchy;

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
public class Team {
    @JsonProperty("market")
    private String market;

    @JsonProperty("venue")
    private Venue venue;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private String id;

    @JsonProperty("abbr")
    private String abbr;

    public Optional<String> getMarket() {
        return Optional.ofNullable(market);
    }

    public Optional<Venue> getVenue() {
        return Optional.ofNullable(venue);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getAbbr() {
        return Optional.ofNullable(abbr);
    }
}
