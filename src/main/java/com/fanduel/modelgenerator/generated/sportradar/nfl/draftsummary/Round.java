package com.fanduel.modelgenerator.generated.sportradar.nfl.draftsummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Round {
    @JsonProperty("number")
    private Integer number;

    @JsonProperty("end_date")
    private String endDate;

    @JsonProperty("picks")
    private List<Pick> picks;

    @JsonProperty("id")
    private String id;

    @JsonProperty("start_date")
    private String startDate;

    @JsonProperty("status")
    private String status;
}
