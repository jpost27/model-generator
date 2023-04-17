package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonaltransactions;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class SeasonalTransactionsResponse {
    @JsonProperty("players")
    private List<Player> players;

    @JsonProperty("league")
    private League league;

    @JsonProperty("_comment")
    private String comment;

    @JsonProperty("season_year")
    private Integer seasonYear;
}
