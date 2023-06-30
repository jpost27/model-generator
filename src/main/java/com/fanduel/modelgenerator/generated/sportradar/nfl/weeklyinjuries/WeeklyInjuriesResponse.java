package com.fanduel.modelgenerator.generated.sportradar.nfl.weeklyinjuries;

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
public class WeeklyInjuriesResponse {
    @JsonProperty("week")
    private Week week;

    @JsonProperty("teams")
    private List<Team> teams;

    @JsonProperty("season")
    private Season season;

    @JsonProperty("_comment")
    private String comment;

    public Optional<Week> getWeek() {
        return Optional.ofNullable(week);
    }

    public List<Team> getTeams() {
        return Optional.ofNullable(teams).orElse(Collections.emptyList());
    }

    public Optional<Season> getSeason() {
        return Optional.ofNullable(season);
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }
}
