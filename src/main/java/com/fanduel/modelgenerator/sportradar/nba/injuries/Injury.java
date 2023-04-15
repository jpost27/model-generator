
package com.fanduel.modelgenerator.sportradar.nba.injuries;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "comment",
    "desc",
    "status",
    "start_date",
    "update_date"
})
@Generated("jsonschema2pojo")
public class Injury {

    @JsonProperty("id")
    public String id;
    @JsonProperty("comment")
    public String comment;
    @JsonProperty("desc")
    public String desc;
    @JsonProperty("status")
    public String status;
    @JsonProperty("start_date")
    public String startDate;
    @JsonProperty("update_date")
    public String updateDate;

}
