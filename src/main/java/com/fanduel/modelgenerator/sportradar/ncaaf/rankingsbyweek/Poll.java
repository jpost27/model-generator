
package com.fanduel.modelgenerator.sportradar.ncaaf.rankingsbyweek;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "alias",
    "name"
})
@Generated("jsonschema2pojo")
public class Poll {

    @JsonProperty("id")
    public String id;
    @JsonProperty("alias")
    public String alias;
    @JsonProperty("name")
    public String name;

}
