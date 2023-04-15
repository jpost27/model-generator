
package com.fanduel.modelgenerator.sportradar.mlb.teamprofile;

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
    "venue",
    "league",
    "division",
    "staff",
    "players",
    "_comment"
})
@Generated("jsonschema2pojo")
public class TeamProfileResponse {

    @JsonProperty("name")
    public String name;
    @JsonProperty("market")
    public String market;
    @JsonProperty("abbr")
    public String abbr;
    @JsonProperty("id")
    public String id;
    @JsonProperty("venue")
    public Venue venue;
    @JsonProperty("league")
    public League league;
    @JsonProperty("division")
    public Division division;
    @JsonProperty("staff")
    public List<Staff> staff = new ArrayList<Staff>();
    @JsonProperty("players")
    public List<Player> players = new ArrayList<Player>();
    @JsonProperty("_comment")
    public String comment;

}
