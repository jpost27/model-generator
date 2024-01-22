package com.fanduel.modelgenerator.generated.nbav8.seasons;

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
