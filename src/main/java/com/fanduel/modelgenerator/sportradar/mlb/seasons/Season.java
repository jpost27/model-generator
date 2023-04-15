
package com.fanduel.modelgenerator.sportradar.mlb.seasons;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "year",
    "status",
    "start_date",
    "end_date",
    "type"
})
@Generated("jsonschema2pojo")
public class Season {

    @JsonProperty("id")
    public String id;
    @JsonProperty("year")
    public Integer year;
    @JsonProperty("status")
    public String status;
    @JsonProperty("start_date")
    public String startDate;
    @JsonProperty("end_date")
    public String endDate;
    @JsonProperty("type")
    public Type type;

}
