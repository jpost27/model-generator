package com.fanduel.modelgenerator.generated.sportradar.mlb.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Runner {
    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("starting_base")
    private Integer startingBase;

    @JsonProperty("jersey_number")
    private String jerseyNumber;

    @JsonProperty("description")
    private String description;

    @JsonProperty("outcome_id")
    private String outcomeId;

    @JsonProperty("preferred_name")
    private String preferredName;

    @JsonProperty("id")
    private String id;

    @JsonProperty("fielders")
    private List<Fielder> fielders;

    @JsonProperty("ending_base")
    private Integer endingBase;

    @JsonProperty("out")
    private Boolean out;
}
