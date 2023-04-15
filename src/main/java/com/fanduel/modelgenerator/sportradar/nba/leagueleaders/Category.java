
package com.fanduel.modelgenerator.sportradar.nba.leagueleaders;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "type",
    "ranks"
})
@Generated("jsonschema2pojo")
public class Category {

    @JsonProperty("name")
    public String name;
    @JsonProperty("type")
    public String type;
    @JsonProperty("ranks")
    public List<Rank> ranks = new ArrayList<Rank>();

}
