package com.fanduel.modelgenerator.generated.golfv3.dailychangelog;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Setter
@Accessors(
        chain = true
)
@JsonIgnoreProperties(
        ignoreUnknown = true
)
@EqualsAndHashCode
@ToString
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
