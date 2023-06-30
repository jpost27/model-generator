package com.fanduel.modelgenerator.generated.sportradar.nfl.prospects;

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
public class ProspectsResponse {
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
