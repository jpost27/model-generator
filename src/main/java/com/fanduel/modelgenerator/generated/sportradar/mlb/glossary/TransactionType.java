package com.fanduel.modelgenerator.generated.sportradar.mlb.glossary;

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
public class TransactionType {
    @JsonProperty("code")
    private String code;

    @JsonProperty("type")
    private String type;

    public Optional<String> getCode() {
        return Optional.ofNullable(code);
    }

    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }
}
