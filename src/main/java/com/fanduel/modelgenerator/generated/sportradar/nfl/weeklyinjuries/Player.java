package com.fanduel.modelgenerator.generated.sportradar.nfl.weeklyinjuries;

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
public class Player {
    @JsonProperty("injuries")
    private List<Injury> injuries;

    @JsonProperty("jersey")
    private String jersey;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private String id;

    @JsonProperty("position")
    private String position;

    @JsonProperty("sr_id")
    private String srId;

    public List<Injury> getInjuries() {
        return Optional.ofNullable(injuries).orElse(Collections.emptyList());
    }

    public Optional<String> getJersey() {
        return Optional.ofNullable(jersey);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getPosition() {
        return Optional.ofNullable(position);
    }

    public Optional<String> getSrId() {
        return Optional.ofNullable(srId);
    }
}
