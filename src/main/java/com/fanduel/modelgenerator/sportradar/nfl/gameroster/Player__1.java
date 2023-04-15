
package com.fanduel.modelgenerator.sportradar.nfl.gameroster;

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
    "preferred_name",
    "birth_date",
    "weight",
    "height",
    "position",
    "age",
    "birth_place",
    "high_school",
    "college",
    "college_conf",
    "rookie_year",
    "status",
    "sr_id",
    "draft",
    "name_suffix"
})
@Generated("jsonschema2pojo")
public class Player__1 {

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
    @JsonProperty("preferred_name")
    public String preferredName;
    @JsonProperty("birth_date")
    public String birthDate;
    @JsonProperty("weight")
    public Double weight;
    @JsonProperty("height")
    public Integer height;
    @JsonProperty("position")
    public String position;
    @JsonProperty("age")
    public Integer age;
    @JsonProperty("birth_place")
    public String birthPlace;
    @JsonProperty("high_school")
    public String highSchool;
    @JsonProperty("college")
    public String college;
    @JsonProperty("college_conf")
    public String collegeConf;
    @JsonProperty("rookie_year")
    public Integer rookieYear;
    @JsonProperty("status")
    public String status;
    @JsonProperty("sr_id")
    public String srId;
    @JsonProperty("draft")
    public Draft__1 draft;
    @JsonProperty("name_suffix")
    public String nameSuffix;

}
