package com.fanduel.modelgenerator.generated.nbav8.playbyplay;

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
public class Player {
    @JsonProperty("reference")
    private String reference;

    @JsonProperty("jersey_number")
    private String jerseyNumber;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("id")
    private String id;

    @JsonProperty("sr_id")
    private String srId;

    public Optional<String> getReference() {
        return Optional.ofNullable(reference);
    }

    public Optional<String> getJerseyNumber() {
        return Optional.ofNullable(jerseyNumber);
    }

    public Optional<String> getFullName() {
        return Optional.ofNullable(fullName);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getSrId() {
        return Optional.ofNullable(srId);
    }
}