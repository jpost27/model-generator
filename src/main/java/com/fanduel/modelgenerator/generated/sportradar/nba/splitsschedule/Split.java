package com.fanduel.modelgenerator.generated.sportradar.nba.splitsschedule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Split {
    @JsonProperty("average")
    private Average average;

    @JsonProperty("total")
    private Total total;

    @JsonProperty("day_of_week")
    private String dayOfWeek;

    @JsonProperty("week")
    private String week;

    @JsonProperty("month")
    private String month;

    @JsonProperty("own_record")
    private OwnRecord ownRecord;

    @JsonProperty("opponents")
    private Opponents opponents;

    @JsonProperty("category")
    private String category;

    @JsonProperty("days_of_rest")
    private String daysOfRest;
}
