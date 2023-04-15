
package com.fanduel.modelgenerator.sportradar.nba.standings;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "div_rank",
    "conf_rank",
    "div_tiebreak",
    "conf_tiebreak"
})
@Generated("jsonschema2pojo")
public class CalcRank {

    @JsonProperty("div_rank")
    public Integer divRank;
    @JsonProperty("conf_rank")
    public Integer confRank;
    @JsonProperty("div_tiebreak")
    public String divTiebreak;
    @JsonProperty("conf_tiebreak")
    public String confTiebreak;

}
