
package com.fanduel.modelgenerator.sportradar.mlb.seasonalpitchmetrics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "count",
    "avg_speed",
    "min_speed",
    "max_speed",
    "gbfb",
    "onbase",
    "outcome",
    "outs",
    "in_play",
    "swings"
})
@Generated("jsonschema2pojo")
public class Overall {

    @JsonProperty("count")
    public Integer count;
    @JsonProperty("avg_speed")
    public Double avgSpeed;
    @JsonProperty("min_speed")
    public Double minSpeed;
    @JsonProperty("max_speed")
    public Double maxSpeed;
    @JsonProperty("gbfb")
    public Double gbfb;
    @JsonProperty("onbase")
    public Onbase onbase;
    @JsonProperty("outcome")
    public Outcome outcome;
    @JsonProperty("outs")
    public Outs outs;
    @JsonProperty("in_play")
    public InPlay inPlay;
    @JsonProperty("swings")
    public Swings swings;

}
