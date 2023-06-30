package com.fanduel.modelgenerator.generated.sportradar.mlb.dailysummary;

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
    @JsonProperty("date")
    private String date;

    @JsonProperty("name")
    private String name;

    @JsonProperty("games")
    private List<Game> games;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("id")
    private String id;

    public Optional<String> getDate() {
        return Optional.ofNullable(date);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public List<Game> getGames() {
        return Optional.ofNullable(games).orElse(Collections.emptyList());
    }

    public Optional<String> getAlias() {
        return Optional.ofNullable(alias);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }
}
