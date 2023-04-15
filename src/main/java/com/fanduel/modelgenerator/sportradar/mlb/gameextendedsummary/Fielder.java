
package com.fanduel.modelgenerator.sportradar.mlb.gameextendedsummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sequence",
    "preferred_name",
    "first_name",
    "last_name",
    "jersey_number",
    "id",
    "type"
})
@Generated("jsonschema2pojo")
public class Fielder {

    @JsonProperty("sequence")
    public Integer sequence;
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
    @JsonProperty("type")
    public String type;

}
