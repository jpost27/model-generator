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
public class GameStatus {
    @JsonProperty("id")
    private String id;

    @JsonProperty("label")
    private String label;

    @JsonProperty("desc")
    private String desc;

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getLabel() {
        return Optional.ofNullable(label);
    }

    public Optional<String> getDesc() {
        return Optional.ofNullable(desc);
    }
}
