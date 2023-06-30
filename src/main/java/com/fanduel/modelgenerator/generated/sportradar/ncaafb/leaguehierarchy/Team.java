package com.fanduel.modelgenerator.generated.sportradar.ncaafb.leaguehierarchy;

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

    @JsonProperty("subdivision")
    private String subdivision;

    @JsonProperty("franchise")
    private Franchise franchise;

    @JsonProperty("name")
    private String name;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("id")
    private String id;

    public Optional<String> getMarket() {
        return Optional.ofNullable(market);
    }

    public Optional<Venue> getVenue() {
        return Optional.ofNullable(venue);
    }

    public Optional<String> getSubdivision() {
        return Optional.ofNullable(subdivision);
    }

    public Optional<Franchise> getFranchise() {
        return Optional.ofNullable(franchise);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<String> getAlias() {
        return Optional.ofNullable(alias);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }
}
