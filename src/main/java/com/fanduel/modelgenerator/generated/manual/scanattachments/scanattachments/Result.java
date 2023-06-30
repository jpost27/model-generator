package com.fanduel.modelgenerator.generated.manual.scanattachments.scanattachments;

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
public class Result {
    @JsonProperty("type")
    private String type;

    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }
}
