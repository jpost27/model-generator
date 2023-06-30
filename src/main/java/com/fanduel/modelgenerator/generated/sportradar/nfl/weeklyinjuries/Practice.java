package com.fanduel.modelgenerator.generated.sportradar.nfl.weeklyinjuries;

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
public class Practice {
    @JsonProperty("status")
    private String status;

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }
}
