package com.fanduel.modelgenerator.generated.sportradar.nfl.weeklyinjuries;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Injury {
    @JsonProperty("status_date")
    private String statusDate;

    @JsonProperty("secondary")
    private String secondary;

    @JsonProperty("practice")
    private Practice practice;

    @JsonProperty("status")
    private String status;

    @JsonProperty("primary")
    private String primary;
}
