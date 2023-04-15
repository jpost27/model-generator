
package com.fanduel.modelgenerator.sportradar.nba.freeagents;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "status",
    "full_name",
    "first_name",
    "last_name",
    "abbr_name",
    "height",
    "weight",
    "position",
    "primary_position",
    "experience",
    "college",
    "high_school",
    "birth_place",
    "birthdate",
    "updated",
    "rookie_year",
    "reference",
    "sr_id",
    "name_suffix"
})
@Generated("jsonschema2pojo")
public class FreeAgent {

    @JsonProperty("id")
    public String id;
    @JsonProperty("status")
    public String status;
    @JsonProperty("full_name")
    public String fullName;
    @JsonProperty("first_name")
    public String firstName;
    @JsonProperty("last_name")
    public String lastName;
    @JsonProperty("abbr_name")
    public String abbrName;
    @JsonProperty("height")
    public Integer height;
    @JsonProperty("weight")
    public Integer weight;
    @JsonProperty("position")
    public String position;
    @JsonProperty("primary_position")
    public String primaryPosition;
    @JsonProperty("experience")
    public String experience;
    @JsonProperty("college")
    public String college;
    @JsonProperty("high_school")
    public String highSchool;
    @JsonProperty("birth_place")
    public String birthPlace;
    @JsonProperty("birthdate")
    public String birthdate;
    @JsonProperty("updated")
    public String updated;
    @JsonProperty("rookie_year")
    public Integer rookieYear;
    @JsonProperty("reference")
    public String reference;
    @JsonProperty("sr_id")
    public String srId;
    @JsonProperty("name_suffix")
    public String nameSuffix;

}
