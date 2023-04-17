package com.fanduel.modelgenerator.generated.sportradar.nba.standings;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Record {
    @JsonProperty("wins")
    private Integer wins;

    @JsonProperty("record_type")
    private String recordType;

    @JsonProperty("losses")
    private Integer losses;

    @JsonProperty("win_pct")
    private Double winPct;
}
