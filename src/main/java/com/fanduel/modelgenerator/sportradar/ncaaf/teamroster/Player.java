
package com.fanduel.modelgenerator.sportradar.ncaaf.teamroster;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "jersey",
    "last_name",
    "first_name",
    "abbr_name",
    "weight",
    "height",
    "position",
    "birth_place",
    "status",
    "eligibility",
    "name_suffix"
})
@Generated("jsonschema2pojo")
public class Player {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("jersey")
    public String jersey;
    @JsonProperty("last_name")
    public String lastName;
    @JsonProperty("first_name")
    public String firstName;
    @JsonProperty("abbr_name")
    public String abbrName;
    @JsonProperty("weight")
    public Double weight;
    @JsonProperty("height")
    public Integer height;
    @JsonProperty("position")
    public String position;
    @JsonProperty("birth_place")
    public String birthPlace;
    @JsonProperty("status")
    public String status;
    @JsonProperty("eligibility")
    public String eligibility;
    @JsonProperty("name_suffix")
    public String nameSuffix;

}
