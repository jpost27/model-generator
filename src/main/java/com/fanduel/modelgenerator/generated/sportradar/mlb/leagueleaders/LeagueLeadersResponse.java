package com.fanduel.modelgenerator.generated.sportradar.mlb.leagueleaders;

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
public class LeagueLeadersResponse {
    @JsonProperty("leagues")
    private List<League> leagues;

    @JsonProperty("season")
    private Season season;

    @JsonProperty("_comment")
    private String comment;

    public List<League> getLeagues() {
        return Optional.ofNullable(leagues).orElse(Collections.emptyList());
    }

    public Optional<Season> getSeason() {
        return Optional.ofNullable(season);
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }
}
