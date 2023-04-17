package com.fanduel.modelgenerator.generated.sportradar.nfl.trades;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class TradesResponse {
    @JsonProperty("draft")
    private Draft draft;

    @JsonProperty("trades")
    private List<Trade> trades;

    @JsonProperty("_comment")
    private String comment;
}
