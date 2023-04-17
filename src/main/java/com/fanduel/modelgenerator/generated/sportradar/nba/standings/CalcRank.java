package com.fanduel.modelgenerator.generated.sportradar.nba.standings;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class CalcRank {
    @JsonProperty("conf_rank")
    private Integer confRank;

    @JsonProperty("div_tiebreak")
    private String divTiebreak;

    @JsonProperty("conf_tiebreak")
    private String confTiebreak;

    @JsonProperty("div_rank")
    private Integer divRank;
}
