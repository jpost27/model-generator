package com.fanduel.modelgenerator.generated.sportradar.nfl.seasonschedule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Scoring {
    @JsonProperty("away_points")
    private Integer awayPoints;

    @JsonProperty("periods")
    private List<Period> periods;

    @JsonProperty("home_points")
    private Integer homePoints;
}
