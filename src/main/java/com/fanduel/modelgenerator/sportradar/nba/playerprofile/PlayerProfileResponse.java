
package com.fanduel.modelgenerator.sportradar.nba.playerprofile;

import java.util.ArrayList;
import java.util.List;
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
    "jersey_number",
    "experience",
    "college",
    "high_school",
    "birth_place",
    "birthdate",
    "updated",
    "sr_id",
    "rookie_year",
    "reference",
    "league",
    "team",
    "draft",
    "seasons"
})
@Generated("jsonschema2pojo")
public class PlayerProfileResponse {

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
    @JsonProperty("jersey_number")
    public String jerseyNumber;
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
    @JsonProperty("sr_id")
    public String srId;
    @JsonProperty("rookie_year")
    public Integer rookieYear;
    @JsonProperty("reference")
    public String reference;
    @JsonProperty("league")
    public League league;
    @JsonProperty("team")
    public Team team;
    @JsonProperty("draft")
    public Draft draft;
    @JsonProperty("seasons")
    public List<Season> seasons = new ArrayList<Season>();

}
