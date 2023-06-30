package com.fanduel.modelgenerator.generated.sportradar.mlb.playbyplay;

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
public class Half {
    @JsonProperty("half")
    private String half;

    @JsonProperty("events")
    private List<Event> events;

    public Optional<String> getHalf() {
        return Optional.ofNullable(half);
    }

    public List<Event> getEvents() {
        return Optional.ofNullable(events).orElse(Collections.emptyList());
    }
}
