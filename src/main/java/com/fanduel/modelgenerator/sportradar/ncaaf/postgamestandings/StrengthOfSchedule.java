
package com.fanduel.modelgenerator.sportradar.ncaaf.postgamestandings;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sos",
    "wins",
    "total"
})
@Generated("jsonschema2pojo")
public class StrengthOfSchedule {

    @JsonProperty("sos")
    public Double sos;
    @JsonProperty("wins")
    public Integer wins;
    @JsonProperty("total")
    public Integer total;

}
