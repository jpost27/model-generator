
package com.fanduel.modelgenerator.sportradar.mlb.leaguedepthchart;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "desc",
    "players"
})
@Generated("jsonschema2pojo")
public class Position {

    @JsonProperty("name")
    public String name;
    @JsonProperty("desc")
    public String desc;
    @JsonProperty("players")
    public List<Player> players = new ArrayList<Player>();

}
