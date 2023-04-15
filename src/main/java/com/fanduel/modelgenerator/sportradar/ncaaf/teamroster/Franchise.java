
package com.fanduel.modelgenerator.sportradar.ncaaf.teamroster;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name"
})
@Generated("jsonschema2pojo")
public class Franchise {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;

}
