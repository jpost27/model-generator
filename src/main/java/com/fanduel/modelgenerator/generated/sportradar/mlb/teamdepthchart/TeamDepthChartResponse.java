package com.fanduel.modelgenerator.generated.sportradar.mlb.teamdepthchart;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class TeamDepthChartResponse {
    @JsonProperty("_comment")
    private String comment;

    @JsonProperty("team")
    private Team team;
}
