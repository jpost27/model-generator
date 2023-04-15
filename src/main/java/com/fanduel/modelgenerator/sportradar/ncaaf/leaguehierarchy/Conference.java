
package com.fanduel.modelgenerator.sportradar.ncaaf.leaguehierarchy;

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
    "alias",
    "teams"
})
@Generated("jsonschema2pojo")
public class Conference {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("alias")
    public String alias;
    @JsonProperty("teams")
    public List<Team> teams = new ArrayList<Team>();

}
