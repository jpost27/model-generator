package com.fanduel.modelgenerator.generated.sportradar.nfl.trades;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Trade {
    @JsonProperty("sequence")
    private Long sequence;

    @JsonProperty("id")
    private String id;

    @JsonProperty("complete")
    private Boolean complete;

    @JsonProperty("transactions")
    private List<Transaction> transactions;

    public Optional<Long> getSequence() {
        return Optional.ofNullable(sequence);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Boolean> getComplete() {
        return Optional.ofNullable(complete);
    }

    public List<Transaction> getTransactions() {
        return Optional.ofNullable(transactions).orElse(Collections.emptyList());
    }
}
