
package com.fanduel.modelgenerator.sportradar.mlb.seasonalsplits;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "value",
    "bf",
    "runs",
    "s",
    "d",
    "t",
    "hr",
    "rbi",
    "bb",
    "ibb",
    "hbp",
    "sb",
    "cs",
    "oba",
    "obp",
    "slg",
    "ops",
    "h",
    "ktotal"
})
@Generated("jsonschema2pojo")
public class HitterHand__3 {

    @JsonProperty("value")
    public String value;
    @JsonProperty("bf")
    public Integer bf;
    @JsonProperty("runs")
    public Integer runs;
    @JsonProperty("s")
    public Integer s;
    @JsonProperty("d")
    public Integer d;
    @JsonProperty("t")
    public Integer t;
    @JsonProperty("hr")
    public Integer hr;
    @JsonProperty("rbi")
    public Integer rbi;
    @JsonProperty("bb")
    public Integer bb;
    @JsonProperty("ibb")
    public Integer ibb;
    @JsonProperty("hbp")
    public Integer hbp;
    @JsonProperty("sb")
    public Integer sb;
    @JsonProperty("cs")
    public Integer cs;
    @JsonProperty("oba")
    public Double oba;
    @JsonProperty("obp")
    public Double obp;
    @JsonProperty("slg")
    public Double slg;
    @JsonProperty("ops")
    public Double ops;
    @JsonProperty("h")
    public Integer h;
    @JsonProperty("ktotal")
    public Integer ktotal;

}
