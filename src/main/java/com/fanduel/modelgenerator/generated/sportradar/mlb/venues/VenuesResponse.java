package com.fanduel.modelgenerator.generated.sportradar.mlb.venues;

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
public class VenuesResponse {
    @JsonProperty("venues")
    private List<Venue> venues;

    @JsonProperty("_comment")
    private String comment;

    public List<Venue> getVenues() {
        return Optional.ofNullable(venues).orElse(Collections.emptyList());
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }
}
