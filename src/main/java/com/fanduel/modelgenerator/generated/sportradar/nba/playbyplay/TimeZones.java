package com.fanduel.modelgenerator.generated.sportradar.nba.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class TimeZones {
    @JsonProperty("venue")
    private String venue;

    @JsonProperty("away")
    private String away;

    @JsonProperty("home")
    private String home;
}
