package com.fanduel.modelgenerator.generated.sportradar.mlb.statcastleaders;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class League {
    @JsonProperty("name")
    private String name;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("pitching")
    private Pitching pitching;

    @JsonProperty("id")
    private String id;

    @JsonProperty("hitting")
    private Hitting hitting;

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<String> getAlias() {
        return Optional.ofNullable(alias);
    }

    public Optional<Pitching> getPitching() {
        return Optional.ofNullable(pitching);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Hitting> getHitting() {
        return Optional.ofNullable(hitting);
    }
}
