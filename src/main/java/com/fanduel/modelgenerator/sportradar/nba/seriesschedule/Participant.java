
package com.fanduel.modelgenerator.sportradar.nba.seriesschedule;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "seed",
    "record",
    "team",
    "source"
})
@Generated("jsonschema2pojo")
public class Participant {

    @JsonProperty("name")
    public String name;
    @JsonProperty("seed")
    public Integer seed;
    @JsonProperty("record")
    public Integer record;
    @JsonProperty("team")
    public Team team;
    @JsonProperty("source")
    public Source source;

}
