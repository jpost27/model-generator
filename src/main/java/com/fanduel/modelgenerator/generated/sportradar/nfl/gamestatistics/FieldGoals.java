package com.fanduel.modelgenerator.generated.sportradar.nfl.gamestatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class FieldGoals {
    @JsonProperty("players")
    private List<Player> players;

    @JsonProperty("totals")
    private Totals totals;
}
