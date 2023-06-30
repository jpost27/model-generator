package com.fanduel.modelgenerator.generated.sportradar.nfl.gameroster;

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
public class Official {
    @JsonProperty("number")
    private String number;

    @JsonProperty("assignment")
    private String assignment;

    @JsonProperty("full_name")
    private String fullName;

    public Optional<String> getNumber() {
        return Optional.ofNullable(number);
    }

    public Optional<String> getAssignment() {
        return Optional.ofNullable(assignment);
    }

    public Optional<String> getFullName() {
        return Optional.ofNullable(fullName);
    }
}
