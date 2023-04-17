package com.fanduel.modelgenerator.generated.sportradar.nfl.trades;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Round {
    @JsonProperty("number")
    private Integer number;

    @JsonProperty("end_date")
    private String endDate;

    @JsonProperty("id")
    private String id;

    @JsonProperty("start_date")
    private String startDate;
}
