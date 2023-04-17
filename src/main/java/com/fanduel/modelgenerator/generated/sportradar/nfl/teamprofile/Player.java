package com.fanduel.modelgenerator.generated.sportradar.nfl.teamprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Player {
    @JsonProperty("college")
    private String college;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("abbr_name")
    private String abbrName;

    @JsonProperty("weight")
    private Double weight;

    @JsonProperty("name_suffix")
    private String nameSuffix;

    @JsonProperty("birth_date")
    private String birthDate;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("birth_place")
    private String birthPlace;

    @JsonProperty("rookie_year")
    private Integer rookieYear;

    @JsonProperty("college_conf")
    private String collegeConf;

    @JsonProperty("jersey")
    private String jersey;

    @JsonProperty("draft")
    private Draft draft;

    @JsonProperty("name")
    private String name;

    @JsonProperty("high_school")
    private String highSchool;

    @JsonProperty("id")
    private String id;

    @JsonProperty("position")
    private String position;

    @JsonProperty("preferred_name")
    private String preferredName;

    @JsonProperty("height")
    private Integer height;

    @JsonProperty("status")
    private String status;
}
