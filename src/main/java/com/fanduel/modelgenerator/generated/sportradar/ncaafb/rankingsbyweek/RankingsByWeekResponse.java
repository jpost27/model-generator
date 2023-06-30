package com.fanduel.modelgenerator.generated.sportradar.ncaafb.rankingsbyweek;

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
public class RankingsByWeekResponse {
    @JsonProperty("season_type")
    private String seasonType;

    @JsonProperty("rankings")
    private List<Ranking> rankings;

    @JsonProperty("candidates")
    private List<Candidate> candidates;

    @JsonProperty("week")
    private Integer week;

    @JsonProperty("season")
    private Integer season;

    @JsonProperty("poll")
    private Poll poll;

    public Optional<String> getSeasonType() {
        return Optional.ofNullable(seasonType);
    }

    public List<Ranking> getRankings() {
        return Optional.ofNullable(rankings).orElse(Collections.emptyList());
    }

    public List<Candidate> getCandidates() {
        return Optional.ofNullable(candidates).orElse(Collections.emptyList());
    }

    public Optional<Integer> getWeek() {
        return Optional.ofNullable(week);
    }

    public Optional<Integer> getSeason() {
        return Optional.ofNullable(season);
    }

    public Optional<Poll> getPoll() {
        return Optional.ofNullable(poll);
    }
}
