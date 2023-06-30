package com.fanduel.modelgenerator.generated.sportradar.mlb.seasons;

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
public class SeasonsResponse {
    @JsonProperty("seasons")
    private List<Season> seasons;

    @JsonProperty("league")
    private League league;

    @JsonProperty("_comment")
    private String comment;

    public List<Season> getSeasons() {
        return Optional.ofNullable(seasons).orElse(Collections.emptyList());
    }

    public Optional<League> getLeague() {
        return Optional.ofNullable(league);
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }
}
