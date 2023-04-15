
package com.fanduel.modelgenerator.sportradar.nfl.teamroster;

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
    "alias",
    "sr_id",
    "franchise",
    "venue",
    "division",
    "conference",
    "coaches",
    "players",
    "_comment"
})
@Generated("jsonschema2pojo")
public class TeamRosterResponse {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("market")
    public String market;
    @JsonProperty("alias")
    public String alias;
    @JsonProperty("sr_id")
    public String srId;
    @JsonProperty("franchise")
    public Franchise franchise;
    @JsonProperty("venue")
    public Venue venue;
    @JsonProperty("division")
    public Division division;
    @JsonProperty("conference")
    public Conference conference;
    @JsonProperty("coaches")
    public List<Coach> coaches = new ArrayList<Coach>();
    @JsonProperty("players")
    public List<Player> players = new ArrayList<Player>();
    @JsonProperty("_comment")
    public String comment;

}
