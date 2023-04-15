
package com.fanduel.modelgenerator.sportradar.mlb.seasonalsplits;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "market",
    "abbr",
    "id",
    "season",
    "splits",
    "players",
    "_comment"
})
@Generated("jsonschema2pojo")
public class SeasonalSplitsResponse {

    @JsonProperty("name")
    public String name;
    @JsonProperty("market")
    public String market;
    @JsonProperty("abbr")
    public String abbr;
    @JsonProperty("id")
    public String id;
    @JsonProperty("season")
    public Season season;
    @JsonProperty("splits")
    public Splits splits;
    @JsonProperty("players")
    public List<Player> players = new ArrayList<Player>();
    @JsonProperty("_comment")
    public String comment;

}
