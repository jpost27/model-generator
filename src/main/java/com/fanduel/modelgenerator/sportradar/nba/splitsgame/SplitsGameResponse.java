
package com.fanduel.modelgenerator.sportradar.nba.splitsgame;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "market",
    "sr_id",
    "reference",
    "season",
    "splits",
    "players"
})
@Generated("jsonschema2pojo")
public class SplitsGameResponse {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("market")
    public String market;
    @JsonProperty("sr_id")
    public String srId;
    @JsonProperty("reference")
    public String reference;
    @JsonProperty("season")
    public Season season;
    @JsonProperty("splits")
    public List<Split> splits = new ArrayList<Split>();
    @JsonProperty("players")
    public List<Player> players = new ArrayList<Player>();

}
