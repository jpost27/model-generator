
package com.fanduel.modelgenerator.sportradar.nfl.trades;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "sequence",
    "complete",
    "transactions"
})
@Generated("jsonschema2pojo")
public class Trade {

    @JsonProperty("id")
    public String id;
    @JsonProperty("sequence")
    public Long sequence;
    @JsonProperty("complete")
    public Boolean complete;
    @JsonProperty("transactions")
    public List<Transaction> transactions = new ArrayList<Transaction>();

}
