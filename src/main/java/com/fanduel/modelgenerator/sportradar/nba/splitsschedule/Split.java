
package com.fanduel.modelgenerator.sportradar.nba.splitsschedule;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "category",
    "days_of_rest",
    "own_record",
    "opponents",
    "day_of_week",
    "month",
    "week"
})
@Generated("jsonschema2pojo")
public class Split {

    @JsonProperty("category")
    public String category;
    @JsonProperty("days_of_rest")
    public String daysOfRest;
    @JsonProperty("own_record")
    public OwnRecord ownRecord;
    @JsonProperty("opponents")
    public Opponents opponents;
    @JsonProperty("day_of_week")
    public String dayOfWeek;
    @JsonProperty("month")
    public String month;
    @JsonProperty("week")
    public String week;

}
