
package com.fanduel.modelgenerator.sportradar.nba.splitsschedule;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "category",
    "days_of_rest",
    "total",
    "average",
    "day_of_week",
    "month",
    "week"
})
@Generated("jsonschema2pojo")
public class Split__1 {

    @JsonProperty("category")
    public String category;
    @JsonProperty("days_of_rest")
    public String daysOfRest;
    @JsonProperty("total")
    public Total__2 total;
    @JsonProperty("average")
    public Average__2 average;
    @JsonProperty("day_of_week")
    public String dayOfWeek;
    @JsonProperty("month")
    public String month;
    @JsonProperty("week")
    public String week;

}
