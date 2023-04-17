package com.fanduel.modelgenerator.generated.sportradar.mlb.seasons;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class SeasonsResponse {
    @JsonProperty("seasons")
    private List<Season> seasons;

    @JsonProperty("league")
    private League league;

    @JsonProperty("_comment")
    private String comment;
}
