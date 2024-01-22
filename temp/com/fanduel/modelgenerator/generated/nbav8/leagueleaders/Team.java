package com.fanduel.modelgenerator.generated.nbav8.leagueleaders;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Team {
    @JsonProperty("market")
    private String market;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private String id;

    @JsonProperty("sr_id")
    private String srId;

    public Optional<String> getMarket() {
        return Optional.ofNullable(market);
    }

    public Optional<String> getReference() {
        return Optional.ofNullable(reference);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getSrId() {
        return Optional.ofNullable(srId);
    }
}
