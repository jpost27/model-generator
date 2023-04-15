
package com.fanduel.modelgenerator.sportradar.mlb.seasons;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "name"
})
@Generated("jsonschema2pojo")
public class Type {

    @JsonProperty("code")
    public String code;
    @JsonProperty("name")
    public String name;

}
