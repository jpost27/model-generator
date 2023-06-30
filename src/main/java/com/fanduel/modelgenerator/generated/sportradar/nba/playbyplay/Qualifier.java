package com.fanduel.modelgenerator.generated.sportradar.nba.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Qualifier {
    @JsonProperty("qualifier")
    private String qualifier;

    public Optional<String> getQualifier() {
        return Optional.ofNullable(qualifier);
    }
}
