package com.fanduel.modelgenerator.generated.sportradar.nhl.gamesummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Goaltending {
    @JsonProperty("total")
    private Total total;

    @JsonProperty("shorthanded")
    private Shorthanded shorthanded;

    @JsonProperty("powerplay")
    private Powerplay powerplay;

    @JsonProperty("shootout")
    private Shootout shootout;

    @JsonProperty("time_on_ice")
    private TimeOnIce timeOnIce;

    @JsonProperty("penalty")
    private Penalty penalty;

    @JsonProperty("emptynet")
    private Emptynet emptynet;

    @JsonProperty("periods")
    private List<Period> periods;

    @JsonProperty("evenstrength")
    private Evenstrength evenstrength;
}
