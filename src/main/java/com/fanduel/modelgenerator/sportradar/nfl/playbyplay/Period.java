
package com.fanduel.modelgenerator.sportradar.nfl.playbyplay;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "period_type",
    "id",
    "number",
    "sequence",
    "scoring",
    "coin_toss",
    "pbp"
})
@Generated("jsonschema2pojo")
public class Period {

    @JsonProperty("period_type")
    public String periodType;
    @JsonProperty("id")
    public String id;
    @JsonProperty("number")
    public Integer number;
    @JsonProperty("sequence")
    public Integer sequence;
    @JsonProperty("scoring")
    public Scoring scoring;
    @JsonProperty("coin_toss")
    public CoinToss coinToss;
    @JsonProperty("pbp")
    public List<Pbp> pbp = new ArrayList<Pbp>();

}
