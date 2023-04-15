
package com.fanduel.modelgenerator.sportradar.ncaaf.gameroster;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "market",
    "alias",
    "coaches",
    "players"
})
@Generated("jsonschema2pojo")
public class Away__1 {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("market")
    public String market;
    @JsonProperty("alias")
    public String alias;
    @JsonProperty("coaches")
    public List<Coach__1> coaches = new ArrayList<Coach__1>();
    @JsonProperty("players")
    public List<Player__1> players = new ArrayList<Player__1>();

}
