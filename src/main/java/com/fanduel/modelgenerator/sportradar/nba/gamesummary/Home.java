
package com.fanduel.modelgenerator.sportradar.nba.gamesummary;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "alias",
    "market",
    "id",
    "points",
    "bonus",
    "sr_id",
    "remaining_timeouts",
    "reference",
    "record",
    "scoring",
    "statistics",
    "coaches",
    "players"
})
@Generated("jsonschema2pojo")
public class Home {

    @JsonProperty("name")
    public String name;
    @JsonProperty("alias")
    public String alias;
    @JsonProperty("market")
    public String market;
    @JsonProperty("id")
    public String id;
    @JsonProperty("points")
    public Integer points;
    @JsonProperty("bonus")
    public Boolean bonus;
    @JsonProperty("sr_id")
    public String srId;
    @JsonProperty("remaining_timeouts")
    public Integer remainingTimeouts;
    @JsonProperty("reference")
    public String reference;
    @JsonProperty("record")
    public Record record;
    @JsonProperty("scoring")
    public List<Scoring> scoring = new ArrayList<Scoring>();
    @JsonProperty("statistics")
    public Statistics statistics;
    @JsonProperty("coaches")
    public List<Coach> coaches = new ArrayList<Coach>();
    @JsonProperty("players")
    public List<Player> players = new ArrayList<Player>();

}
