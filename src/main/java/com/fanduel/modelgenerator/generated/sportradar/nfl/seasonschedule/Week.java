package com.fanduel.modelgenerator.generated.sportradar.nfl.seasonschedule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Week {
    @JsonProperty("sequence")
    private Integer sequence;

    @JsonProperty("bye_week")
    private List<ByeWeek> byeWeek;

    @JsonProperty("games")
    private List<Game> games;

    @JsonProperty("id")
    private String id;

    @JsonProperty("title")
    private String title;

    public Optional<Integer> getSequence() {
        return Optional.ofNullable(sequence);
    }

    public List<ByeWeek> getByeWeek() {
        return Optional.ofNullable(byeWeek).orElse(Collections.emptyList());
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
