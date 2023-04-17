package com.fanduel.modelgenerator.generated.sportradar.mlb.dailyboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class BlownSave {
    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("save")
    private Integer save;

    @JsonProperty("primary_position")
    private String primaryPosition;

    @JsonProperty("hold")
    private Integer hold;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("loss")
    private Integer loss;

    @JsonProperty("blown_save")
    private Integer blownSave;

    @JsonProperty("jersey_number")
    private String jerseyNumber;

    @JsonProperty("preferred_name")
    private String preferredName;

    @JsonProperty("position")
    private String position;

    @JsonProperty("id")
    private String id;

    @JsonProperty("win")
    private Integer win;

    @JsonProperty("status")
    private String status;
}
