
package com.fanduel.modelgenerator.sportradar.nba.gameboxscore;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "full_name",
    "jersey_number",
    "id",
    "position",
    "primary_position",
    "sr_id",
    "reference",
    "statistics"
})
@Generated("jsonschema2pojo")
public class Rebound__1 {

    @JsonProperty("full_name")
    public String fullName;
    @JsonProperty("jersey_number")
    public String jerseyNumber;
    @JsonProperty("id")
    public String id;
    @JsonProperty("position")
    public String position;
    @JsonProperty("primary_position")
    public String primaryPosition;
    @JsonProperty("sr_id")
    public String srId;
    @JsonProperty("reference")
    public String reference;
    @JsonProperty("statistics")
    public Statistics__4 statistics;

}
