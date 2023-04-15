
package com.fanduel.modelgenerator.sportradar.nba.seriesschedule;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "title",
    "round",
    "outcome"
})
@Generated("jsonschema2pojo")
public class Source {

    @JsonProperty("id")
    public String id;
    @JsonProperty("title")
    public String title;
    @JsonProperty("round")
    public Integer round;
    @JsonProperty("outcome")
    public String outcome;

}
