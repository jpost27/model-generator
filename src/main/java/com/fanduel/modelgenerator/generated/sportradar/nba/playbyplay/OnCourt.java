package com.fanduel.modelgenerator.generated.sportradar.nba.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class OnCourt {
    @JsonProperty("away")
    private Away away;

    @JsonProperty("home")
    private Home home;
}
