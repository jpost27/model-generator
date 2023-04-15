
package com.fanduel.modelgenerator.sportradar.nfl.draftsummary;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "number",
    "start_date",
    "end_date",
    "status",
    "picks"
})
@Generated("jsonschema2pojo")
public class Round {

    @JsonProperty("id")
    public String id;
    @JsonProperty("number")
    public Integer number;
    @JsonProperty("start_date")
    public String startDate;
    @JsonProperty("end_date")
    public String endDate;
    @JsonProperty("status")
    public String status;
    @JsonProperty("picks")
    public List<Pick> picks = new ArrayList<Pick>();

}
