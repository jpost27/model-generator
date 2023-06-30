package com.fanduel.modelgenerator.generated.sportradar.ncaafb.seasons;

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
public class Type {
    @JsonProperty("code")
    private String code;

    public Optional<String> getCode() {
        return Optional.ofNullable(code);
    }
}
