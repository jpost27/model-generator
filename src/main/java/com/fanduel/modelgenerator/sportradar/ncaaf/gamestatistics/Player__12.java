
package com.fanduel.modelgenerator.sportradar.ncaaf.gamestatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "jersey",
    "position",
    "attempts",
    "blocked",
    "made",
    "missed",
    "pct"
})
@Generated("jsonschema2pojo")
public class Player__12 {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("jersey")
    public String jersey;
    @JsonProperty("position")
    public String position;
    @JsonProperty("attempts")
    public Integer attempts;
    @JsonProperty("blocked")
    public Integer blocked;
    @JsonProperty("made")
    public Integer made;
    @JsonProperty("missed")
    public Integer missed;
    @JsonProperty("pct")
    public Double pct;

}
