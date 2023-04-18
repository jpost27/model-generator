package com.fanduel.modelgenerator.generated.sportradar.nhl.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Statistics {
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

    @JsonProperty("periods")
    private List<Period> periods;

    @JsonProperty("evenstrength")
    private Evenstrength evenstrength;
}
