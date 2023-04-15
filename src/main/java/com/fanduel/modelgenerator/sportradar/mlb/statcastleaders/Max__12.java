
package com.fanduel.modelgenerator.sportradar.mlb.statcastleaders;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "status",
    "position",
    "primary_position",
    "first_name",
    "last_name",
    "preferred_name",
    "rank",
    "units",
    "game_id",
    "release_spin_rate",
    "opposing_player",
    "jersey_number",
    "team"
})
@Generated("jsonschema2pojo")
public class Max__12 {

    @JsonProperty("id")
    public String id;
    @JsonProperty("status")
    public String status;
    @JsonProperty("position")
    public String position;
    @JsonProperty("primary_position")
    public String primaryPosition;
    @JsonProperty("first_name")
    public String firstName;
    @JsonProperty("last_name")
    public String lastName;
    @JsonProperty("preferred_name")
    public String preferredName;
    @JsonProperty("rank")
    public Integer rank;
    @JsonProperty("units")
    public String units;
    @JsonProperty("game_id")
    public String gameId;
    @JsonProperty("release_spin_rate")
    public Double releaseSpinRate;
    @JsonProperty("opposing_player")
    public OpposingPlayer__11 opposingPlayer;
    @JsonProperty("jersey_number")
    public String jerseyNumber;
    @JsonProperty("team")
    public Team__25 team;

}
