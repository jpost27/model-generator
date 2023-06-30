package com.fanduel.modelgenerator.generated.sportradar.nba.leagueleaders;

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
public class Category {
    @JsonProperty("ranks")
    private List<Rank> ranks;

    @JsonProperty("name")
    private String name;

    @JsonProperty("type")
    private String type;

    public List<Rank> getRanks() {
        return Optional.ofNullable(ranks).orElse(Collections.emptyList());
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }
}
