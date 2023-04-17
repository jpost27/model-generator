package com.fanduel.modelgenerator.generated.sportradar.nba.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class PlayerProfileResponse {
    @JsonProperty("college")
    private String college;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("seasons")
    private List<Season> seasons;

    @JsonProperty("birthdate")
    private String birthdate;

    @JsonProperty("abbr_name")
    private String abbrName;

    @JsonProperty("league")
    private League league;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("weight")
    private Integer weight;

    @JsonProperty("team")
    private Team team;

    @JsonProperty("experience")
    private String experience;

    @JsonProperty("primary_position")
    private String primaryPosition;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("birth_place")
    private String birthPlace;

    @JsonProperty("rookie_year")
    private Integer rookieYear;

    @JsonProperty("draft")
    private Draft draft;

    @JsonProperty("jersey_number")
    private String jerseyNumber;

    @JsonProperty("high_school")
    private String highSchool;

    @JsonProperty("id")
    private String id;

    @JsonProperty("position")
    private String position;

    @JsonProperty("updated")
    private String updated;

    @JsonProperty("status")
    private String status;

    @JsonProperty("height")
    private Integer height;
}
