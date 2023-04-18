package com.fanduel.modelgenerator.generated.sportradar.nhl.seasonalstatisticsseasontodate;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Goaltending {
    @JsonProperty("average")
    private Average average;

    @JsonProperty("total")
    private Total total;

    @JsonProperty("shorthanded")
    private Shorthanded shorthanded;

    @JsonProperty("powerplay")
    private Powerplay powerplay;

    @JsonProperty("shootout")
    private Shootout shootout;

    @JsonProperty("penalty")
    private Penalty penalty;

    @JsonProperty("emptynet")
    private Emptynet emptynet;

    @JsonProperty("evenstrength")
    private Evenstrength evenstrength;
}
