package com.fanduel.modelgenerator.generated.sportradar.nfl.draftsummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Draft {
    @JsonProperty("broadcast")
    private Broadcast broadcast;

    @JsonProperty("venue")
    private Venue venue;

    @JsonProperty("year")
    private Integer year;

    @JsonProperty("end_date")
    private String endDate;

    @JsonProperty("league")
    private League league;

    @JsonProperty("id")
    private String id;

    @JsonProperty("start_date")
    private String startDate;

    @JsonProperty("status")
    private String status;
}
