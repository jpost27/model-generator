
package com.fanduel.modelgenerator.sportradar.nfl.postgamestandings;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "length",
    "desc"
})
@Generated("jsonschema2pojo")
public class Streak {

    @JsonProperty("type")
    public String type;
    @JsonProperty("length")
    public Integer length;
    @JsonProperty("desc")
    public String desc;

}
