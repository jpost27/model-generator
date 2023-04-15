
package com.fanduel.modelgenerator.sportradar.mlb.playbyplay;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "player_id",
    "order",
    "position",
    "team_id",
    "preferred_name",
    "first_name",
    "last_name",
    "jersey_number",
    "id",
    "description",
    "sequence_number"
})
@Generated("jsonschema2pojo")
public class Lineup {

    @JsonProperty("player_id")
    public String playerId;
    @JsonProperty("order")
    public Integer order;
    @JsonProperty("position")
    public Integer position;
    @JsonProperty("team_id")
    public String teamId;
    @JsonProperty("preferred_name")
    public String preferredName;
    @JsonProperty("first_name")
    public String firstName;
    @JsonProperty("last_name")
    public String lastName;
    @JsonProperty("jersey_number")
    public String jerseyNumber;
    @JsonProperty("id")
    public String id;
    @JsonProperty("description")
    public String description;
    @JsonProperty("sequence_number")
    public Integer sequenceNumber;

}
