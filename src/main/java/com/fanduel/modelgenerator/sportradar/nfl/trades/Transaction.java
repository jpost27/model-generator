
package com.fanduel.modelgenerator.sportradar.nfl.trades;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "to_team",
    "from_team",
    "items"
})
@Generated("jsonschema2pojo")
public class Transaction {

    @JsonProperty("id")
    public String id;
    @JsonProperty("to_team")
    public ToTeam toTeam;
    @JsonProperty("from_team")
    public FromTeam fromTeam;
    @JsonProperty("items")
    public List<Item> items = new ArrayList<Item>();

}
