package com.fanduel.modelgenerator.generated.nflv7.postgamestandings;

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
    @JsonProperty("length")
    private Integer length;

    @JsonProperty("type")
    private String type;

    @JsonProperty("desc")
    private String desc;

    public Optional<Integer> getLength() {
        return Optional.ofNullable(length);
    }

    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }

    public Optional<String> getDesc() {
        return Optional.ofNullable(desc);
    }
}
