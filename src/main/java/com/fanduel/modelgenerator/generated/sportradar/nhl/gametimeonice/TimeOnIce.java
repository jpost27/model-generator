package com.fanduel.modelgenerator.generated.sportradar.nhl.gametimeonice;

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

    @JsonProperty("avg")
    private String avg;

    @JsonProperty("shorthanded")
    private Shorthanded shorthanded;

    @JsonProperty("powerplay")
    private Powerplay powerplay;

    @JsonProperty("shift_count")
    private Integer shiftCount;

    @JsonProperty("evenstrength")
    private Evenstrength evenstrength;
}
