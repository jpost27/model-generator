
package com.fanduel.modelgenerator.sportradar.mlb.gamepitchmetrics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
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
public class PitchType__1 {

    @JsonProperty("type")
    public String type;
    @JsonProperty("count")
    public Integer count;
    @JsonProperty("avg_speed")
    public Double avgSpeed;
    @JsonProperty("min_speed")
    public Double minSpeed;
    @JsonProperty("max_speed")
    public Double maxSpeed;
    @JsonProperty("gbfb")
    public Integer gbfb;
    @JsonProperty("onbase")
    public Onbase__3 onbase;
    @JsonProperty("outcome")
    public Outcome__3 outcome;
    @JsonProperty("outs")
    public Outs__3 outs;
    @JsonProperty("in_play")
    public InPlay__3 inPlay;
    @JsonProperty("swings")
    public Swings__3 swings;

}
