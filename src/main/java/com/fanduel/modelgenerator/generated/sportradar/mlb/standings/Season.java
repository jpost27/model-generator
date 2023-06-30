package com.fanduel.modelgenerator.generated.sportradar.mlb.standings;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
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
public class Season {
    @JsonProperty("year")
    private Integer year;

    @JsonProperty("leagues")
    private List<League> leagues;

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type;

    public Optional<Integer> getYear() {
        return Optional.ofNullable(year);
    }

    public List<League> getLeagues() {
        return Optional.ofNullable(leagues).orElse(Collections.emptyList());
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }
}
