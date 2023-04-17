package com.fanduel.modelgenerator.generated.sportradar.mlb.leagueleaders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Strikeouts {
    @JsonProperty("teams")
    private List<Team> teams;

    @JsonProperty("players")
    private List<Player> players;
}
