package com.fanduel.modelgenerator.generated.sportradar.nhl.seasonalfaceoffs;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Player {
    @JsonProperty("reference")
    private String reference;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("faceoffs")
    private Faceoffs faceoffs;

    @JsonProperty("jersey_number")
    private String jerseyNumber;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("id")
    private String id;

    @JsonProperty("position")
    private String position;

    @JsonProperty("primary_position")
    private String primaryPosition;

    @JsonProperty("sr_id")
    private String srId;
}