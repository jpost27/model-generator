
package com.fanduel.modelgenerator.sportradar.mlb.leaguehierarchy;

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
    "divisions"
})
@Generated("jsonschema2pojo")
public class League__1 {

    @JsonProperty("alias")
    public String alias;
    @JsonProperty("name")
    public String name;
    @JsonProperty("id")
    public String id;
    @JsonProperty("divisions")
    public List<Division> divisions = new ArrayList<Division>();

}
