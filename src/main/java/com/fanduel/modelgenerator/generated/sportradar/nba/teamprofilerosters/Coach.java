package com.fanduel.modelgenerator.generated.sportradar.nba.teamprofilerosters;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Coach {
    @JsonProperty("reference")
    private String reference;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("id")
    private String id;

    @JsonProperty("position")
    private String position;

    @JsonProperty("experience")
    private String experience;
}