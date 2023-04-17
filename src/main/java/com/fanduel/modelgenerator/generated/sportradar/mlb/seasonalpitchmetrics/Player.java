package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalpitchmetrics;

import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonProperty("birthcountry")
    private String birthcountry;

    @JsonProperty("seasons")
    private List<Season> seasons;

    @JsonProperty("birthdate")
    private String birthdate;

    @JsonProperty("birthcity")
    private String birthcity;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("weight")
    private String weight;

    @JsonProperty("bat_hand")
    private String batHand;

    @JsonProperty("team")
    private Team team;

    @JsonProperty("throw_hand")
    private String throwHand;

    @JsonProperty("primary_position")
    private String primaryPosition;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("pro_debut")
    private String proDebut;

    @JsonProperty("jersey_number")
    private String jerseyNumber;

    @JsonProperty("high_school")
    private String highSchool;

    @JsonProperty("birthstate")
    private String birthstate;

    @JsonProperty("id")
    private String id;

    @JsonProperty("position")
    private String position;

    @JsonProperty("preferred_name")
    private String preferredName;

    @JsonProperty("updated")
    private String updated;

    @JsonProperty("status")
    private String status;

    @JsonProperty("height")
    private String height;
}
