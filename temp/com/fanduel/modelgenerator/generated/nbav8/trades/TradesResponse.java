package com.fanduel.modelgenerator.generated.nbav8.trades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Setter
@Accessors(
        chain = true
)
@JsonIgnoreProperties(
        ignoreUnknown = true
)
@EqualsAndHashCode
@ToString
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
