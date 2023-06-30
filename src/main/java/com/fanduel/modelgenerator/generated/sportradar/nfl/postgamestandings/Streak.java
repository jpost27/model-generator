package com.fanduel.modelgenerator.generated.sportradar.nfl.postgamestandings;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
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
