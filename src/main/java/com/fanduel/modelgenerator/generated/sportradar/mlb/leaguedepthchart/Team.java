package com.fanduel.modelgenerator.generated.sportradar.mlb.leaguedepthchart;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Team {
    @JsonProperty("market")
    private String market;

    @JsonProperty("name")
    private String name;

    @JsonProperty("positions")
    private List<Position> positions;

    @JsonProperty("id")
    private String id;

    @JsonProperty("abbr")
    private String abbr;
}
