
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
    "direction",
    "yards",
    "start_location",
    "end_location",
    "players",
    "result"
})
@Generated("jsonschema2pojo")
public class Detail__1 {

    @JsonProperty("category")
    public String category;
    @JsonProperty("description")
    public String description;
    @JsonProperty("sequence")
    public Integer sequence;
    @JsonProperty("direction")
    public String direction;
    @JsonProperty("yards")
    public Integer yards;
    @JsonProperty("start_location")
    public StartLocation__1 startLocation;
    @JsonProperty("end_location")
    public EndLocation__1 endLocation;
    @JsonProperty("players")
    public List<Player__3> players = new ArrayList<Player__3>();
    @JsonProperty("result")
    public String result;

}
