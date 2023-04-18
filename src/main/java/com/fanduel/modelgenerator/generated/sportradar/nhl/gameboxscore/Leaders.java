package com.fanduel.modelgenerator.generated.sportradar.nhl.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Leaders {
    @JsonProperty("assists")
    private List<Assist> assists;

    @JsonProperty("points")
    private List<Point> points;

    @JsonProperty("goals")
    private List<Goal> goals;
}
