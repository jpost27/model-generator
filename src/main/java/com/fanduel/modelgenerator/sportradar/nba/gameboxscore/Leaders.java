
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
public class Leaders {

    @JsonProperty("points")
    public List<Point> points = new ArrayList<Point>();
    @JsonProperty("rebounds")
    public List<Rebound> rebounds = new ArrayList<Rebound>();
    @JsonProperty("assists")
    public List<Assist> assists = new ArrayList<Assist>();

}
