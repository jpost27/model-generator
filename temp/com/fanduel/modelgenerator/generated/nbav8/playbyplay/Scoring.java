package com.fanduel.modelgenerator.generated.nbav8.playbyplay;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
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
public class Scoring {
    @JsonProperty("times_tied")
    private Integer timesTied;

    @JsonProperty("away")
    private Away away;

    @JsonProperty("lead_changes")
    private Integer leadChanges;

    @JsonProperty("home")
    private Home home;

    public Optional<Integer> getTimesTied() {
        return Optional.ofNullable(timesTied);
    }

    public Optional<Away> getAway() {
        return Optional.ofNullable(away);
    }

    public Optional<Integer> getLeadChanges() {
        return Optional.ofNullable(leadChanges);
    }

    public Optional<Home> getHome() {
        return Optional.ofNullable(home);
    }
}
