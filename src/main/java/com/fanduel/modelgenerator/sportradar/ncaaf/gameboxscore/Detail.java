
package com.fanduel.modelgenerator.sportradar.ncaaf.gameboxscore;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "category",
    "sequence",
    "start_location",
    "end_location",
    "players",
    "penalty"
})
@Generated("jsonschema2pojo")
public class Detail {

    @JsonProperty("category")
    public String category;
    @JsonProperty("sequence")
    public Integer sequence;
    @JsonProperty("start_location")
    public StartLocation startLocation;
    @JsonProperty("end_location")
    public EndLocation endLocation;
    @JsonProperty("players")
    public List<Player__1> players = new ArrayList<Player__1>();
    @JsonProperty("penalty")
    public Penalty penalty;

}
