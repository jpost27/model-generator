
package com.fanduel.modelgenerator.sportradar.mlb.gameextendedsummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "starting_base",
    "ending_base",
    "out",
    "outcome_id",
    "preferred_name",
    "first_name",
    "last_name",
    "jersey_number",
    "id",
    "description"
})
@Generated("jsonschema2pojo")
public class Runner__1 {

    @JsonProperty("starting_base")
    public Integer startingBase;
    @JsonProperty("ending_base")
    public Integer endingBase;
    @JsonProperty("out")
    public Boolean out;
    @JsonProperty("outcome_id")
    public String outcomeId;
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

}
