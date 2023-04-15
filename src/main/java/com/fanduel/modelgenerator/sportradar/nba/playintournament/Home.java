
package com.fanduel.modelgenerator.sportradar.nba.playintournament;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "alias",
    "id",
    "sr_id",
    "reference"
})
@Generated("jsonschema2pojo")
public class Home {

    @JsonProperty("name")
    public String name;
    @JsonProperty("alias")
    public String alias;
    @JsonProperty("id")
    public String id;
    @JsonProperty("sr_id")
    public String srId;
    @JsonProperty("reference")
    public String reference;

}
