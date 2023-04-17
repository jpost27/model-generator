package com.fanduel.modelgenerator.generated.sportradar.nfl.trades;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Trade {
    @JsonProperty("sequence")
    private Long sequence;

    @JsonProperty("id")
    private String id;

    @JsonProperty("complete")
    private Boolean complete;

    @JsonProperty("transactions")
    private List<Transaction> transactions;
}
