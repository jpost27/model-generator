package com.fanduel.modelgenerator.generated.sportradar.ncaafb.leaguehierarchy;

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
public class LeagueHierarchyResponse {
    @JsonProperty("league")
    private League league;

    @JsonProperty("_comment")
    private String comment;

    @JsonProperty("divisions")
    private List<Division> divisions;

    public Optional<League> getLeague() {
        return Optional.ofNullable(league);
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }

    public List<Division> getDivisions() {
        return Optional.ofNullable(divisions).orElse(Collections.emptyList());
    }
}
