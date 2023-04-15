
package com.fanduel.modelgenerator.sportradar.nfl.prospects;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "year",
    "start_date",
    "end_date",
    "status",
    "league",
    "broadcast",
    "venue"
})
@Generated("jsonschema2pojo")
public class Draft {

    @JsonProperty("id")
    public String id;
    @JsonProperty("year")
    public Integer year;
    @JsonProperty("start_date")
    public String startDate;
    @JsonProperty("end_date")
    public String endDate;
    @JsonProperty("status")
    public String status;
    @JsonProperty("league")
    public League league;
    @JsonProperty("broadcast")
    public Broadcast broadcast;
    @JsonProperty("venue")
    public Venue venue;

}
