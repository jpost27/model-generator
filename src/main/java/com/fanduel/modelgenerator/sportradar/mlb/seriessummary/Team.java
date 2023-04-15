
package com.fanduel.modelgenerator.sportradar.mlb.seriessummary;

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
    "statistics",
    "players"
})
@Generated("jsonschema2pojo")
public class Team {

    @JsonProperty("name")
    public String name;
    @JsonProperty("market")
    public String market;
    @JsonProperty("abbr")
    public String abbr;
    @JsonProperty("id")
    public String id;
    @JsonProperty("statistics")
    public Statistics statistics;
    @JsonProperty("players")
    public List<Player> players = new ArrayList<Player>();

}
