
package com.fanduel.modelgenerator.sportradar.mlb.teamprofile;

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
    "position",
    "primary_position",
    "first_name",
    "last_name",
    "preferred_name",
    "jersey_number",
    "full_name",
    "height",
    "weight",
    "throw_hand",
    "bat_hand",
    "college",
    "high_school",
    "birthdate",
    "birthstate",
    "birthcountry",
    "birthcity",
    "pro_debut",
    "updated",
    "reference",
    "active",
    "injuries",
    "dl60",
    "suffix"
})
@Generated("jsonschema2pojo")
public class Player {

    @JsonProperty("id")
    public String id;
    @JsonProperty("status")
    public String status;
    @JsonProperty("position")
    public String position;
    @JsonProperty("primary_position")
    public String primaryPosition;
    @JsonProperty("first_name")
    public String firstName;
    @JsonProperty("last_name")
    public String lastName;
    @JsonProperty("preferred_name")
    public String preferredName;
    @JsonProperty("jersey_number")
    public String jerseyNumber;
    @JsonProperty("full_name")
    public String fullName;
    @JsonProperty("height")
    public String height;
    @JsonProperty("weight")
    public String weight;
    @JsonProperty("throw_hand")
    public String throwHand;
    @JsonProperty("bat_hand")
    public String batHand;
    @JsonProperty("college")
    public String college;
    @JsonProperty("high_school")
    public String highSchool;
    @JsonProperty("birthdate")
    public String birthdate;
    @JsonProperty("birthstate")
    public String birthstate;
    @JsonProperty("birthcountry")
    public String birthcountry;
    @JsonProperty("birthcity")
    public String birthcity;
    @JsonProperty("pro_debut")
    public String proDebut;
    @JsonProperty("updated")
    public String updated;
    @JsonProperty("reference")
    public String reference;
    @JsonProperty("active")
    public Boolean active;
    @JsonProperty("injuries")
    public List<Injury> injuries = new ArrayList<Injury>();
    @JsonProperty("dl60")
    public Boolean dl60;
    @JsonProperty("suffix")
    public String suffix;

}
