
package com.fanduel.modelgenerator.sportradar.mlb.seasonalstatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "po",
    "fo",
    "fidp",
    "lo",
    "lidp",
    "go",
    "gidp",
    "klook",
    "kswing",
    "ktotal",
    "sacfly",
    "sachit"
})
@Generated("jsonschema2pojo")
public class Outs__3 {

    @JsonProperty("po")
    public Integer po;
    @JsonProperty("fo")
    public Integer fo;
    @JsonProperty("fidp")
    public Integer fidp;
    @JsonProperty("lo")
    public Integer lo;
    @JsonProperty("lidp")
    public Integer lidp;
    @JsonProperty("go")
    public Integer go;
    @JsonProperty("gidp")
    public Integer gidp;
    @JsonProperty("klook")
    public Integer klook;
    @JsonProperty("kswing")
    public Integer kswing;
    @JsonProperty("ktotal")
    public Integer ktotal;
    @JsonProperty("sacfly")
    public Integer sacfly;
    @JsonProperty("sachit")
    public Integer sachit;

}
