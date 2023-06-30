package com.fanduel.modelgenerator.generated.sportradar.mlb.teamdepthchart;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Collections;
import java.util.List;
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

    @JsonProperty("positions")
    private List<Position> positions;

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

    public List<Position> getPositions() {
        return Optional.ofNullable(positions).orElse(Collections.emptyList());
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getAbbr() {
        return Optional.ofNullable(abbr);
    }
}
