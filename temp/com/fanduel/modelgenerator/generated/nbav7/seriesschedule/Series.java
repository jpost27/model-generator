package com.fanduel.modelgenerator.generated.nbav7.seriesschedule;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Series {
    @JsonProperty("round")
    private Integer round;

    @JsonProperty("games")
    private List<Game> games;

    @JsonProperty("id")
    private String id;

    @JsonProperty("title")
    private String title;

    @JsonProperty("start_date")
    private String startDate;

    @JsonProperty("status")
    private String status;

    @JsonProperty("participants")
    private List<Participant> participants;

    public Optional<Integer> getRound() {
        return Optional.ofNullable(round);
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

    public Optional<String> getStartDate() {
        return Optional.ofNullable(startDate);
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }

    public List<Participant> getParticipants() {
        return Optional.ofNullable(participants).orElse(Collections.emptyList());
    }
}
