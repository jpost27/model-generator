
package com.fanduel.modelgenerator.sportradar.mlb.playbyplay;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lineup",
    "at_bat"
})
@Generated("jsonschema2pojo")
public class Event {

    @JsonProperty("lineup")
    public Lineup lineup;
    @JsonProperty("at_bat")
    public AtBat atBat;

}
