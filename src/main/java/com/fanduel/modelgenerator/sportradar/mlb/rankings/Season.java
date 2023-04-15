
package com.fanduel.modelgenerator.sportradar.mlb.rankings;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "year",
    "type",
    "leagues"
})
@Generated("jsonschema2pojo")
public class Season {

    @JsonProperty("id")
    public String id;
    @JsonProperty("year")
    public Integer year;
    @JsonProperty("type")
    public String type;
    @JsonProperty("leagues")
    public List<League__1> leagues = new ArrayList<League__1>();

}
