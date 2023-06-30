package com.fanduel.modelgenerator.generated.sportradar.nba.seasons;

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

    @JsonProperty("name")
    private String name;

    public Optional<String> getCode() {
        return Optional.ofNullable(code);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
}
