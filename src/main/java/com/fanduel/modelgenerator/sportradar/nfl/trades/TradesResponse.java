
package com.fanduel.modelgenerator.sportradar.nfl.trades;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "draft",
    "trades",
    "_comment"
})
@Generated("jsonschema2pojo")
public class TradesResponse {

    @JsonProperty("draft")
    public Draft draft;
    @JsonProperty("trades")
    public List<Trade> trades = new ArrayList<Trade>();
    @JsonProperty("_comment")
    public String comment;

}
