package com.fanduel.modelgenerator.generated.sportradar.nba.gamesummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class MostUnanswered {
    @JsonProperty("own_score")
    private Integer ownScore;

    @JsonProperty("opp_score")
    private Integer oppScore;

    @JsonProperty("points")
    private Integer points;
}
