
package com.fanduel.modelgenerator.sportradar.nfl.weeklydepthcharts;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "position"
})
@Generated("jsonschema2pojo")
public class Defense {

    @JsonProperty("position")
    public Position__1 position;

}
