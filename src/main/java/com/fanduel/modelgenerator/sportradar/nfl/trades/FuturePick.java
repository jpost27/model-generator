
package com.fanduel.modelgenerator.sportradar.nfl.trades;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "year",
    "round"
})
@Generated("jsonschema2pojo")
public class FuturePick {

    @JsonProperty("year")
    public String year;
    @JsonProperty("round")
    public String round;

}
