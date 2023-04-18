package com.fanduel.modelgenerator.generated.sportradar.nhl.depthcharts;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Player {
    @JsonProperty("reference")
    private String reference;

    @JsonProperty("depth")
    private Integer depth;

    @JsonProperty("handedness")
    private String handedness;

    @JsonProperty("jersey_number")
    private String jerseyNumber;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("id")
    private String id;

    @JsonProperty("position")
    private String position;

    @JsonProperty("experience")
    private String experience;

    @JsonProperty("primary_position")
    private String primaryPosition;

    @JsonProperty("status")
    private String status;

    @JsonProperty("sr_id")
    private String srId;
}
