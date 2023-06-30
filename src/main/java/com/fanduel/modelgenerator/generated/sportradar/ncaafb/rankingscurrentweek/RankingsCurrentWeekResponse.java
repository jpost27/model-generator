package com.fanduel.modelgenerator.generated.sportradar.ncaafb.rankingscurrentweek;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.Object;
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
public class RankingsCurrentWeekResponse {
    @JsonProperty("rankings")
    private List<Ranking> rankings;

    @JsonProperty("candidates")
    private List<Object> candidates;

    @JsonProperty("week")
    private Integer week;

    @JsonProperty("effective_time")
    private String effectiveTime;

    @JsonProperty("season")
    private Integer season;

    @JsonProperty("poll")
    private Poll poll;

    public List<Ranking> getRankings() {
        return Optional.ofNullable(rankings).orElse(Collections.emptyList());
    }

    public List<Object> getCandidates() {
        return Optional.ofNullable(candidates).orElse(Collections.emptyList());
    }

    public Optional<Integer> getWeek() {
        return Optional.ofNullable(week);
    }

    public Optional<String> getEffectiveTime() {
        return Optional.ofNullable(effectiveTime);
    }

    public Optional<Integer> getSeason() {
        return Optional.ofNullable(season);
    }

    public Optional<Poll> getPoll() {
        return Optional.ofNullable(poll);
    }
}
