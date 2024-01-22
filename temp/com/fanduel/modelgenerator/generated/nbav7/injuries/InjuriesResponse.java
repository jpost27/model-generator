package com.fanduel.modelgenerator.generated.nbav7.injuries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class InjuriesResponse {
    @JsonProperty("teams")
    private List<Team> teams;

    @JsonProperty("league")
    private League league;

    public List<Team> getTeams() {
        return Optional.ofNullable(teams).orElse(Collections.emptyList());
    }

    public Optional<League> getLeague() {
        return Optional.ofNullable(league);
    }
}
