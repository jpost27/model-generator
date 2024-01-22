package com.fanduel.modelgenerator.generated.nbav7.standings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
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
public class Streak {
    @JsonProperty("kind")
    private String kind;

    @JsonProperty("length")
    private Integer length;

    public Optional<String> getKind() {
        return Optional.ofNullable(kind);
    }

    public Optional<Integer> getLength() {
        return Optional.ofNullable(length);
    }
}
