
package com.fanduel.modelgenerator.sportradar.mlb.seasonaltransactions;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "league",
    "season_year",
    "players",
    "_comment"
})
@Generated("jsonschema2pojo")
public class SeasonalTransactionsResponse {

    @JsonProperty("league")
    public League league;
    @JsonProperty("season_year")
    public Integer seasonYear;
    @JsonProperty("players")
    public List<Player> players = new ArrayList<Player>();
    @JsonProperty("_comment")
    public String comment;

}
