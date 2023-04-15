
package com.fanduel.modelgenerator.sportradar.nfl.gameboxscore;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "category",
    "description",
    "sequence",
    "yards",
    "result",
    "start_location",
    "end_location",
    "players",
    "direction",
    "penalty",
    "recovery"
})
@Generated("jsonschema2pojo")
public class Detail {

    @JsonProperty("category")
    public String category;
    @JsonProperty("description")
    public String description;
    @JsonProperty("sequence")
    public Integer sequence;
    @JsonProperty("yards")
    public Integer yards;
    @JsonProperty("result")
    public String result;
    @JsonProperty("start_location")
    public StartLocation startLocation;
    @JsonProperty("end_location")
    public EndLocation endLocation;
    @JsonProperty("players")
    public List<Player__1> players = new ArrayList<Player__1>();
    @JsonProperty("direction")
    public String direction;
    @JsonProperty("penalty")
    public Penalty penalty;
    @JsonProperty("recovery")
    public Recovery recovery;

}
