package com.fanduel.modelgenerator.generated.sportradar.golf.dailychangelog;

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
public class Player {
    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("id")
    private String id;

    public Optional<String> getFullName() {
        return Optional.ofNullable(fullName);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }
}
