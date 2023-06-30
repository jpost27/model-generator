package com.fanduel.modelgenerator.generated.sportradar.mlb.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Games {
    @JsonProperty("play")
    private Integer play;

    @JsonProperty("start")
    private Integer start;

    @JsonProperty("finish")
    private Integer finish;

    @JsonProperty("complete")
    private Integer complete;

    public Optional<Integer> getPlay() {
        return Optional.ofNullable(play);
    }

    public Optional<Integer> getStart() {
        return Optional.ofNullable(start);
    }

    public Optional<Integer> getFinish() {
        return Optional.ofNullable(finish);
    }

    public Optional<Integer> getComplete() {
        return Optional.ofNullable(complete);
    }
}
