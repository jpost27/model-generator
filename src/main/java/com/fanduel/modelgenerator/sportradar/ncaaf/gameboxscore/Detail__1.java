
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
    "players"
})
@Generated("jsonschema2pojo")
public class Detail__1 {

    @JsonProperty("category")
    public String category;
    @JsonProperty("sequence")
    public Integer sequence;
    @JsonProperty("start_location")
    public StartLocation__1 startLocation;
    @JsonProperty("end_location")
    public EndLocation__1 endLocation;
    @JsonProperty("players")
    public List<Player__3> players = new ArrayList<Player__3>();

}
