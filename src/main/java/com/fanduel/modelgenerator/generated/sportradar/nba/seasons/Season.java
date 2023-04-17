package com.fanduel.modelgenerator.generated.sportradar.nba.seasons;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Season {
    @JsonProperty("year")
    private Integer year;

    @JsonProperty("end_date")
    private String endDate;

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private Type type;

    @JsonProperty("start_date")
    private String startDate;

    @JsonProperty("status")
    private String status;
}
