package com.fanduel.modelgenerator.generated.sportradar.golf.dailychangelog;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class DailyChangeLogResponse {
    @JsonProperty("tournaments")
    private List<Tournament> tournaments;

    @JsonProperty("name")
    private String name;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("start_time")
    private String startTime;

    @JsonProperty("id")
    private String id;

    @JsonProperty("end_time")
    private String endTime;

    @JsonProperty("participants")
    private List<Participant> participants;

    public List<Tournament> getTournaments() {
        return Optional.ofNullable(tournaments).orElse(Collections.emptyList());
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<String> getAlias() {
        return Optional.ofNullable(alias);
    }

    public Optional<String> getStartTime() {
        return Optional.ofNullable(startTime);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getEndTime() {
        return Optional.ofNullable(endTime);
    }

    public List<Participant> getParticipants() {
        return Optional.ofNullable(participants).orElse(Collections.emptyList());
    }
}
