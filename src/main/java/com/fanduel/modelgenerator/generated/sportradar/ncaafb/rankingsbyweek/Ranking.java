package com.fanduel.modelgenerator.generated.sportradar.ncaafb.rankingsbyweek;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Ranking {
    @JsonProperty("market")
    private String market;

    @JsonProperty("wins")
    private Integer wins;

    @JsonProperty("ties")
    private Integer ties;

    @JsonProperty("fp_votes")
    private Integer fpVotes;

    @JsonProperty("prev_rank")
    private Integer prevRank;

    @JsonProperty("name")
    private String name;

    @JsonProperty("rank")
    private Integer rank;

    @JsonProperty("id")
    private String id;

    @JsonProperty("losses")
    private Integer losses;

    @JsonProperty("points")
    private Integer points;

    public Optional<String> getMarket() {
        return Optional.ofNullable(market);
    }

    public Optional<Integer> getWins() {
        return Optional.ofNullable(wins);
    }

    public Optional<Integer> getTies() {
        return Optional.ofNullable(ties);
    }

    public Optional<Integer> getFpVotes() {
        return Optional.ofNullable(fpVotes);
    }

    public Optional<Integer> getPrevRank() {
        return Optional.ofNullable(prevRank);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<Integer> getRank() {
        return Optional.ofNullable(rank);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Integer> getLosses() {
        return Optional.ofNullable(losses);
    }

    public Optional<Integer> getPoints() {
        return Optional.ofNullable(points);
    }
}
