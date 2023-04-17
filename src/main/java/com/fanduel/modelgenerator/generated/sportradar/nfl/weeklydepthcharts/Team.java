package com.fanduel.modelgenerator.generated.sportradar.nfl.weeklydepthcharts;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
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
}
