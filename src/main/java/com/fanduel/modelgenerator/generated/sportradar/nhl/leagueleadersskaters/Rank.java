package com.fanduel.modelgenerator.generated.sportradar.nhl.leagueleadersskaters;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Rank {
    @JsonProperty("score")
    private Integer score;

    @JsonProperty("tied")
    private Boolean tied;

    @JsonProperty("teams")
    private List<Team> teams;

    @JsonProperty("time_on_ice")
    private TimeOnIce timeOnIce;

    @JsonProperty("rank")
    private Integer rank;

    @JsonProperty("player")
    private Player player;

    @JsonProperty("statistics")
    private Statistics statistics;
}
