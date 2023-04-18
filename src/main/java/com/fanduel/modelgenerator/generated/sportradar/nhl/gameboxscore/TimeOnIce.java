package com.fanduel.modelgenerator.generated.sportradar.nhl.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class TimeOnIce {
    @JsonProperty("total")
    private String total;

    @JsonProperty("shorthanded")
    private String shorthanded;

    @JsonProperty("avg")
    private String avg;

    @JsonProperty("powerplay")
    private String powerplay;

    @JsonProperty("shifts")
    private Integer shifts;

    @JsonProperty("evenstrength")
    private String evenstrength;
}
