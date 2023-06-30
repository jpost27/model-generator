package com.fanduel.modelgenerator.generated.sportradar.nfl.playbyplay;

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
public class DefensiveTeam {
    @JsonProperty("id")
    private String id;

    @JsonProperty("points")
    private Integer points;

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Integer> getPoints() {
        return Optional.ofNullable(points);
    }
}
