
package com.fanduel.modelgenerator.sportradar.mlb.leagueleaders;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "preferred_name",
    "first_name",
    "last_name",
    "jersey_number",
    "id",
    "status",
    "position",
    "primary_position",
    "era",
    "rank",
    "team"
})
@Generated("jsonschema2pojo")
public class Player__8 {

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
    @JsonProperty("status")
    public String status;
    @JsonProperty("position")
    public String position;
    @JsonProperty("primary_position")
    public String primaryPosition;
    @JsonProperty("era")
    public String era;
    @JsonProperty("rank")
    public Integer rank;
    @JsonProperty("team")
    public Team__16 team;

}
