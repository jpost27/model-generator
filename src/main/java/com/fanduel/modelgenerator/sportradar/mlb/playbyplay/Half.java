
package com.fanduel.modelgenerator.sportradar.mlb.playbyplay;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "half",
    "events"
})
@Generated("jsonschema2pojo")
public class Half {

    @JsonProperty("half")
    public String half;
    @JsonProperty("events")
    public List<Event> events = new ArrayList<Event>();

}
