
package com.fanduel.modelgenerator.sportradar.mlb.gameextendedsummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "s",
    "d",
    "t",
    "hr",
    "tb",
    "bb",
    "ibb",
    "hbp",
    "fc",
    "roe",
    "h",
    "h9",
    "hr9"
})
@Generated("jsonschema2pojo")
public class Onbase__2 {

    @JsonProperty("s")
    public Integer s;
    @JsonProperty("d")
    public Integer d;
    @JsonProperty("t")
    public Integer t;
    @JsonProperty("hr")
    public Integer hr;
    @JsonProperty("tb")
    public Integer tb;
    @JsonProperty("bb")
    public Integer bb;
    @JsonProperty("ibb")
    public Integer ibb;
    @JsonProperty("hbp")
    public Integer hbp;
    @JsonProperty("fc")
    public Integer fc;
    @JsonProperty("roe")
    public Integer roe;
    @JsonProperty("h")
    public Integer h;
    @JsonProperty("h9")
    public java.lang.Double h9;
    @JsonProperty("hr9")
    public java.lang.Double hr9;

}
