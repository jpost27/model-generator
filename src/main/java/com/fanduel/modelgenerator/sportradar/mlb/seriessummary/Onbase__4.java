
package com.fanduel.modelgenerator.sportradar.mlb.seriessummary;

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
    "cycle"
})
@Generated("jsonschema2pojo")
public class Onbase__4 {

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
    @JsonProperty("cycle")
    public Integer cycle;

}
