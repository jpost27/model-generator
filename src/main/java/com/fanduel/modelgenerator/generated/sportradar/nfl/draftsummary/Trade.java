package com.fanduel.modelgenerator.generated.sportradar.nfl.draftsummary;

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
public class Trade {
    @JsonProperty("id")
    private String id;

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }
}
