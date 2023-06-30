package com.fanduel.modelgenerator.generated.sportradar.nba.seriesschedule;

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
public class Home {
    @JsonProperty("reference")
    private String reference;

    @JsonProperty("seed")
    private Integer seed;

    @JsonProperty("name")
    private String name;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("id")
    private String id;

    @JsonProperty("sr_id")
    private String srId;

    public Optional<String> getReference() {
        return Optional.ofNullable(reference);
    }

    public Optional<Integer> getSeed() {
        return Optional.ofNullable(seed);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<String> getAlias() {
        return Optional.ofNullable(alias);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getSrId() {
        return Optional.ofNullable(srId);
    }
}
