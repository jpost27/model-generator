
package com.fanduel.modelgenerator.sportradar.nfl.playbyplay;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "team"
})
@Generated("jsonschema2pojo")
public class Recovery {

    @JsonProperty("type")
    public String type;
    @JsonProperty("team")
    public Team__2 team;

}
