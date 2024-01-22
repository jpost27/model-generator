package com.fanduel.modelgenerator.generated.nbav7.draftsummary;

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
public class DraftSummaryResponse {
    @JsonProperty("draft")
    private Draft draft;

    @JsonProperty("_comment")
    private String comment;

    @JsonProperty("rounds")
    private List<Round> rounds;

    public Optional<Draft> getDraft() {
        return Optional.ofNullable(draft);
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }

    public List<Round> getRounds() {
        return Optional.ofNullable(rounds).orElse(Collections.emptyList());
    }
}
