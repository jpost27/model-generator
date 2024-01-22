package com.fanduel.modelgenerator.generated.nbav8.leaguehierarchy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
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
public class Team {
    @JsonProperty("market")
    private String market;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("venue")
    private Venue venue;

    @JsonProperty("name")
    private String name;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("id")
    private String id;

    @JsonProperty("team_colors")
    private List<TeamColor> teamColors;

    @JsonProperty("sr_id")
    private String srId;

    public Optional<String> getMarket() {
        return Optional.ofNullable(market);
    }

    public Optional<String> getReference() {
        return Optional.ofNullable(reference);
    }

    public Optional<Venue> getVenue() {
        return Optional.ofNullable(venue);
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

    public List<TeamColor> getTeamColors() {
        return Optional.ofNullable(teamColors).orElse(Collections.emptyList());
    }

    public Optional<String> getSrId() {
        return Optional.ofNullable(srId);
    }
}
