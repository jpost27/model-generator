
package com.fanduel.modelgenerator.sportradar.mlb.dailysummary;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "alias",
    "name",
    "id",
    "date",
    "games"
})
@Generated("jsonschema2pojo")
public class League {

    @JsonProperty("alias")
    public String alias;
    @JsonProperty("name")
    public String name;
    @JsonProperty("id")
    public String id;
    @JsonProperty("date")
    public String date;
    @JsonProperty("games")
    public List<Game> games = new ArrayList<Game>();

}
