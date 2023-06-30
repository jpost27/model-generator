package com.fanduel.modelgenerator.generated.sportradar.nba.trades;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class TradesResponse {
    @JsonProperty("draft")
    private Draft draft;

    @JsonProperty("trades")
    private List<Trade> trades;

    @JsonProperty("_comment")
    private String comment;

    public Optional<Draft> getDraft() {
        return Optional.ofNullable(draft);
    }

    public List<Trade> getTrades() {
        return Optional.ofNullable(trades).orElse(Collections.emptyList());
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }
}
