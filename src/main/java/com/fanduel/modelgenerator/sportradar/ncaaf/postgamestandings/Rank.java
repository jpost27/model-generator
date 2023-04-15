
package com.fanduel.modelgenerator.sportradar.ncaaf.postgamestandings;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "conference",
    "division"
})
@Generated("jsonschema2pojo")
public class Rank {

    @JsonProperty("conference")
    public Integer conference;
    @JsonProperty("division")
    public Integer division;

}
