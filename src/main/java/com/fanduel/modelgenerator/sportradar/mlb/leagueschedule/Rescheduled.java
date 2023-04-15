
package com.fanduel.modelgenerator.sportradar.mlb.leagueschedule;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "from",
    "reason"
})
@Generated("jsonschema2pojo")
public class Rescheduled {

    @JsonProperty("from")
    public String from;
    @JsonProperty("reason")
    public String reason;

}
