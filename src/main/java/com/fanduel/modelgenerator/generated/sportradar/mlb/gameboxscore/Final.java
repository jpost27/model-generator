package com.fanduel.modelgenerator.generated.sportradar.mlb.gameboxscore;

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
public class Final {
    @JsonProperty("inning_half")
    private String inningHalf;

    @JsonProperty("inning")
    private Integer inning;

    public Optional<String> getInningHalf() {
        return Optional.ofNullable(inningHalf);
    }

    public Optional<Integer> getInning() {
        return Optional.ofNullable(inning);
    }
}
