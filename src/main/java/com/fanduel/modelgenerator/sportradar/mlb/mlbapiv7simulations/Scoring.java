
package com.fanduel.modelgenerator.sportradar.mlb.mlbapiv7simulations;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "home",
    "away"
})
@Generated("jsonschema2pojo")
public class Scoring {

    @JsonProperty("home")
    public Home home;
    @JsonProperty("away")
    public Away away;

}
