
package com.fanduel.modelgenerator.sportradar.nba.gameboxscore;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "points",
    "rebounds",
    "assists"
})
@Generated("jsonschema2pojo")
public class Leaders__1 {

    @JsonProperty("points")
    public List<Point__1> points = new ArrayList<Point__1>();
    @JsonProperty("rebounds")
    public List<Rebound__1> rebounds = new ArrayList<Rebound__1>();
    @JsonProperty("assists")
    public List<Assist__1> assists = new ArrayList<Assist__1>();

}
