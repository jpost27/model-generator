package com.fanduel.modelgenerator.generated.sportradar.mlb.playerprofile;

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
    @JsonProperty("teams")
    private List<Team> teams;

    @JsonProperty("year")
    private Integer year;

    @JsonProperty("id")
    private String id;

    @JsonProperty("totals")
    private Totals totals;

    @JsonProperty("type")
    private String type;

    public List<Team> getTeams() {
        return Optional.ofNullable(teams).orElse(Collections.emptyList());
    }

    public Optional<Integer> getYear() {
        return Optional.ofNullable(year);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Totals> getTotals() {
        return Optional.ofNullable(totals);
    }

    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }
}
