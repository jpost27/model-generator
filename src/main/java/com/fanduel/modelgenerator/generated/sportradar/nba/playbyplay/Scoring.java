package com.fanduel.modelgenerator.generated.sportradar.nba.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Scoring {
    @JsonProperty("times_tied")
    private Integer timesTied;

    @JsonProperty("away")
    private Away away;

    @JsonProperty("lead_changes")
    private Integer leadChanges;

    @JsonProperty("home")
    private Home home;
}
