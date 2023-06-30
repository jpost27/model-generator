package com.fanduel.modelgenerator.generated.sportradar.mlb.gameboxscore;

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
public class Event {
    @JsonProperty("hitter_id")
    private String hitterId;

    @JsonProperty("inning_half")
    private String inningHalf;

    @JsonProperty("inning")
    private Integer inning;

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type;

    @JsonProperty("runners")
    private List<Runner> runners;

    @JsonProperty("hitter_outcome")
    private String hitterOutcome;

    @JsonProperty("pitcher_id")
    private String pitcherId;

    public Optional<String> getHitterId() {
        return Optional.ofNullable(hitterId);
    }

    public Optional<String> getInningHalf() {
        return Optional.ofNullable(inningHalf);
    }

    public Optional<Integer> getInning() {
        return Optional.ofNullable(inning);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }

    public List<Runner> getRunners() {
        return Optional.ofNullable(runners).orElse(Collections.emptyList());
    }

    public Optional<String> getHitterOutcome() {
        return Optional.ofNullable(hitterOutcome);
    }

    public Optional<String> getPitcherId() {
        return Optional.ofNullable(pitcherId);
    }
}
