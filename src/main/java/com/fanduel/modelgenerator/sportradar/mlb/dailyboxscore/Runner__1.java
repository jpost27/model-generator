
package com.fanduel.modelgenerator.sportradar.mlb.dailyboxscore;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "starting_base",
    "first_name",
    "last_name",
    "preferred_name",
    "jersey_number",
    "id"
})
@Generated("jsonschema2pojo")
public class Runner__1 {

    @JsonProperty("starting_base")
    public Integer startingBase;
    @JsonProperty("first_name")
    public String firstName;
    @JsonProperty("last_name")
    public String lastName;
    @JsonProperty("preferred_name")
    public String preferredName;
    @JsonProperty("jersey_number")
    public String jerseyNumber;
    @JsonProperty("id")
    public String id;

}
