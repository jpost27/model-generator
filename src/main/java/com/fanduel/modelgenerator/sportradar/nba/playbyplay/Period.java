
package com.fanduel.modelgenerator.sportradar.nba.playbyplay;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "number",
    "sequence",
    "scoring",
    "events"
})
@Generated("jsonschema2pojo")
public class Period {

    @JsonProperty("type")
    public String type;
    @JsonProperty("id")
    public String id;
    @JsonProperty("number")
    public Integer number;
    @JsonProperty("sequence")
    public Integer sequence;
    @JsonProperty("scoring")
    public Scoring scoring;
    @JsonProperty("events")
    public List<Event> events = new ArrayList<Event>();

}
