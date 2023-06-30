package com.fanduel.modelgenerator.generated.sportradar.nfl.weeklydepthcharts;

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
public class Team {
    @JsonProperty("market")
    private String market;

    @JsonProperty("special_teams")
    private List<SpecialTeam> specialTeams;

    @JsonProperty("offense")
    private List<Offense> offense;

    @JsonProperty("defense")
    private List<Defense> defense;

    @JsonProperty("name")
    private String name;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("id")
    private String id;

    @JsonProperty("sr_id")
    private String srId;

    public Optional<String> getMarket() {
        return Optional.ofNullable(market);
    }

    public List<SpecialTeam> getSpecialTeams() {
        return Optional.ofNullable(specialTeams).orElse(Collections.emptyList());
    }

    public List<Offense> getOffense() {
        return Optional.ofNullable(offense).orElse(Collections.emptyList());
    }

    public List<Defense> getDefense() {
        return Optional.ofNullable(defense).orElse(Collections.emptyList());
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
