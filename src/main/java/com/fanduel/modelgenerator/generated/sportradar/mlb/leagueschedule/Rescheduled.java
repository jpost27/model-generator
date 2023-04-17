package com.fanduel.modelgenerator.generated.sportradar.mlb.leagueschedule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Rescheduled {
    @JsonProperty("reason")
    private String reason;

    @JsonProperty("from")
    private String from;
}
