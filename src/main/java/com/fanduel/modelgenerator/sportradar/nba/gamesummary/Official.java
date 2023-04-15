
package com.fanduel.modelgenerator.sportradar.nba.gamesummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "full_name",
    "first_name",
    "last_name",
    "number",
    "assignment",
    "experience"
})
@Generated("jsonschema2pojo")
public class Official {

    @JsonProperty("id")
    public String id;
    @JsonProperty("full_name")
    public String fullName;
    @JsonProperty("first_name")
    public String firstName;
    @JsonProperty("last_name")
    public String lastName;
    @JsonProperty("number")
    public String number;
    @JsonProperty("assignment")
    public String assignment;
    @JsonProperty("experience")
    public String experience;

}
