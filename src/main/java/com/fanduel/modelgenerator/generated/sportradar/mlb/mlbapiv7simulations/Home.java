package com.fanduel.modelgenerator.generated.sportradar.mlb.mlbapiv7simulations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
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
public class Home {
    @JsonProperty("market")
    private String market;

    @JsonProperty("hits")
    private Integer hits;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private String id;

    @JsonProperty("abbr")
    private String abbr;

    @JsonProperty("runs")
    private Integer runs;

    @JsonProperty("errors")
    private Integer errors;

    public Optional<String> getMarket() {
        return Optional.ofNullable(market);
    }

    public Optional<Integer> getHits() {
        return Optional.ofNullable(hits);
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

    public Optional<Integer> getRuns() {
        return Optional.ofNullable(runs);
    }

    public Optional<Integer> getErrors() {
        return Optional.ofNullable(errors);
    }
}
