package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonaltransactions;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Player {
    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("jersey_number")
    private String jerseyNumber;

    @JsonProperty("id")
    private String id;

    @JsonProperty("position")
    private String position;

    @JsonProperty("preferred_name")
    private String preferredName;

    @JsonProperty("transactions")
    private List<Transaction> transactions;

    @JsonProperty("status")
    private String status;

    @JsonProperty("primary_position")
    private String primaryPosition;
}