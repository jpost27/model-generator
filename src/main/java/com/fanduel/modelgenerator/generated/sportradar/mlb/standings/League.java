package com.fanduel.modelgenerator.generated.sportradar.mlb.standings;

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
public class League {
    @JsonProperty("name")
    private String name;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("season")
    private Season season;

    @JsonProperty("id")
    private String id;

    @JsonProperty("divisions")
    private List<Division> divisions;

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<String> getAlias() {
        return Optional.ofNullable(alias);
    }

    public Optional<Season> getSeason() {
        return Optional.ofNullable(season);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public List<Division> getDivisions() {
        return Optional.ofNullable(divisions).orElse(Collections.emptyList());
    }
}
