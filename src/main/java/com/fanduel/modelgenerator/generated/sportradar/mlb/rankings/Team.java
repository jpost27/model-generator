package com.fanduel.modelgenerator.generated.sportradar.mlb.rankings;

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

    @JsonProperty("name")
    private String name;

    @JsonProperty("rank")
    private Rank rank;

    @JsonProperty("id")
    private String id;

    @JsonProperty("abbr")
    private String abbr;

    public Optional<String> getMarket() {
        return Optional.ofNullable(market);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<Rank> getRank() {
        return Optional.ofNullable(rank);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getAbbr() {
        return Optional.ofNullable(abbr);
    }
}
