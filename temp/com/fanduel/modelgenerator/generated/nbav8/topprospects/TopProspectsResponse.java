package com.fanduel.modelgenerator.generated.nbav8.topprospects;

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
public class TopProspectsResponse {
    @JsonProperty("prospects")
    private List<Prospect> prospects;

    @JsonProperty("draft")
    private Draft draft;

    @JsonProperty("_comment")
    private String comment;

    public List<Prospect> getProspects() {
        return Optional.ofNullable(prospects).orElse(Collections.emptyList());
    }

    public Optional<Draft> getDraft() {
        return Optional.ofNullable(draft);
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }
}
