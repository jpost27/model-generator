
package com.fanduel.modelgenerator.sportradar.nba.standings;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "record_type",
    "wins",
    "losses",
    "win_pct"
})
@Generated("jsonschema2pojo")
public class Record {

    @JsonProperty("record_type")
    public String recordType;
    @JsonProperty("wins")
    public Integer wins;
    @JsonProperty("losses")
    public Integer losses;
    @JsonProperty("win_pct")
    public Double winPct;

}
