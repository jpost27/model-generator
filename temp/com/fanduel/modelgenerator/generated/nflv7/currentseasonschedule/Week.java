package com.fanduel.modelgenerator.generated.nflv7.currentseasonschedule;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.List;
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
public class Week {
    @JsonProperty("sequence")
    private Integer sequence;

    @JsonProperty("current")
    private Boolean current;

    @JsonProperty("games")
    private List<Game> games;

    @JsonProperty("id")
    private String id;

    @JsonProperty("title")
    private String title;

    public Optional<Integer> getSequence() {
        return Optional.ofNullable(sequence);
    }

    public Optional<Boolean> getCurrent() {
        return Optional.ofNullable(current);
    }

    public List<Game> getGames() {
        return Optional.ofNullable(games).orElse(Collections.emptyList());
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getTitle() {
        return Optional.ofNullable(title);
    }
}
