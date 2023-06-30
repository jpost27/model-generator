package com.fanduel.modelgenerator.generated.sportradar.nfl.playbyplay;

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
public class Review {
    @JsonProperty("result")
    private String result;

    @JsonProperty("type")
    private String type;

    public Optional<String> getResult() {
        return Optional.ofNullable(result);
    }

    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }
}
