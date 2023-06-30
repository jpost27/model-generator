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
public class Candidate {
    @JsonProperty("market")
    private String market;

    @JsonProperty("wins")
    private Integer wins;

    @JsonProperty("ties")
    private Integer ties;

    @JsonProperty("prev_rank")
    private Integer prevRank;

    @JsonProperty("name")
    private String name;

    @JsonProperty("votes")
    private Integer votes;

    @JsonProperty("id")
    private String id;

    @JsonProperty("losses")
    private Integer losses;

    public Optional<String> getMarket() {
        return Optional.ofNullable(market);
    }

    public Optional<Integer> getWins() {
        return Optional.ofNullable(wins);
    }

    public Optional<Integer> getTies() {
        return Optional.ofNullable(ties);
    }

    public Optional<Integer> getPrevRank() {
        return Optional.ofNullable(prevRank);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<Integer> getVotes() {
        return Optional.ofNullable(votes);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Integer> getLosses() {
        return Optional.ofNullable(losses);
    }
}
