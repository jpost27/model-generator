package com.fanduel.modelgenerator.generated.sportradar.nhl.leagueleadersgoaltending;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Rank {
    @JsonProperty("score")
    private Double score;

    @JsonProperty("tied")
    private Boolean tied;

    @JsonProperty("teams")
    private List<Team> teams;

    @JsonProperty("rank")
    private Integer rank;

    @JsonProperty("goaltending")
    private Goaltending goaltending;

    @JsonProperty("player")
    private Player player;
}