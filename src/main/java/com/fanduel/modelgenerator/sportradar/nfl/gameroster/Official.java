
package com.fanduel.modelgenerator.sportradar.nfl.gameroster;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "full_name",
    "number",
    "assignment"
})
@Generated("jsonschema2pojo")
public class Official {

    @JsonProperty("full_name")
    public String fullName;
    @JsonProperty("number")
    public String number;
    @JsonProperty("assignment")
    public String assignment;

}
