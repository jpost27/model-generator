package com.fanduel.modelgenerator.generated.sportradar.mlb.rankings;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class RankingsResponse {
    @JsonProperty("league")
    private League league;

    @JsonProperty("_comment")
    private String comment;
}
