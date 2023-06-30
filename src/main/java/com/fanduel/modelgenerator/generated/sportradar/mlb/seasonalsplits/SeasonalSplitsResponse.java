package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalsplits;

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
public class SeasonalSplitsResponse {
    @JsonProperty("market")
    private String market;

    @JsonProperty("splits")
    private Splits splits;

    @JsonProperty("players")
    private List<Player> players;

    @JsonProperty("name")
    private String name;

    @JsonProperty("season")
    private Season season;

    @JsonProperty("_comment")
    private String comment;

    @JsonProperty("id")
    private String id;

    @JsonProperty("abbr")
    private String abbr;

    public Optional<String> getMarket() {
        return Optional.ofNullable(market);
    }

    public Optional<Splits> getSplits() {
        return Optional.ofNullable(splits);
    }

    public List<Player> getPlayers() {
        return Optional.ofNullable(players).orElse(Collections.emptyList());
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<Season> getSeason() {
        return Optional.ofNullable(season);
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getAbbr() {
        return Optional.ofNullable(abbr);
    }
}
