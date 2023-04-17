package com.fanduel.modelgenerator.generated.sportradar.nfl.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class CoinTos {
    @JsonProperty("away")
    private Away away;

    @JsonProperty("home")
    private Home home;

    @JsonProperty("quarter")
    private Integer quarter;
}
