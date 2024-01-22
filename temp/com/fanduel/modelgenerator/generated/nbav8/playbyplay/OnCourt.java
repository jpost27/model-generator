package com.fanduel.modelgenerator.generated.nbav8.playbyplay;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class OnCourt {
    @JsonProperty("away")
    private Away away;

    @JsonProperty("home")
    private Home home;

    public Optional<Away> getAway() {
        return Optional.ofNullable(away);
    }

    public Optional<Home> getHome() {
        return Optional.ofNullable(home);
    }
}
