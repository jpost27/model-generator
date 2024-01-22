package com.fanduel.modelgenerator.generated.nflv7.playbyplay;

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
public class OffensiveTeam {
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
