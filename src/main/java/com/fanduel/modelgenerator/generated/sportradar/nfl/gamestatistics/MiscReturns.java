package com.fanduel.modelgenerator.generated.sportradar.nfl.gamestatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Object;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class MiscReturns {
    @JsonProperty("players")
    private List<Object> players;

    @JsonProperty("totals")
    private Totals totals;
}
