
package com.fanduel.modelgenerator.sportradar.nba.nbaapiv8simulations;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "alias",
    "id",
    "reference"
})
@Generated("jsonschema2pojo")
public class Away {

    @JsonProperty("name")
    public String name;
    @JsonProperty("alias")
    public String alias;
    @JsonProperty("id")
    public String id;
    @JsonProperty("reference")
    public String reference;

}
