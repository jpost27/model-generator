package com.fanduel.modelgenerator.generated.sportradar.mlb.teamprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Player {
    @JsonProperty("college")
    private String college;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("birthdate")
    private String birthdate;

    @JsonProperty("birthcity")
    private String birthcity;

    @JsonProperty("injuries")
    private List<Injury> injuries;

    @JsonProperty("bat_hand")
    private String batHand;

    @JsonProperty("suffix")
    private String suffix;

    @JsonProperty("primary_position")
    private String primaryPosition;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("pro_debut")
    private String proDebut;

    @JsonProperty("id")
    private String id;

    @JsonProperty("preferred_name")
    private String preferredName;

    @JsonProperty("height")
    private String height;

    @JsonProperty("birthcountry")
    private String birthcountry;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("weight")
    private String weight;

    @JsonProperty("active")
    private Boolean active;

    @JsonProperty("dl60")
    private Boolean dl60;

    @JsonProperty("throw_hand")
    private String throwHand;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("jersey_number")
    private String jerseyNumber;

    @JsonProperty("high_school")
    private String highSchool;

    @JsonProperty("birthstate")
    private String birthstate;

    @JsonProperty("position")
    private String position;

    @JsonProperty("updated")
    private String updated;

    @JsonProperty("status")
    private String status;
}
