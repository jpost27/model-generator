package com.fanduel.modelgenerator.generated.sportradar.nhl.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Statistics {
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

    @JsonProperty("evenstrength")
    private Evenstrength evenstrength;
}
