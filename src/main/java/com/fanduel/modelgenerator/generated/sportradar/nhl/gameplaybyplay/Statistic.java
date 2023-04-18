package com.fanduel.modelgenerator.generated.sportradar.nhl.gameplaybyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Statistic {
    @JsonProperty("severity")
    private String severity;

    @JsonProperty("goal")
    private Boolean goal;

    @JsonProperty("strength")
    private String strength;

    @JsonProperty("zone")
    private String zone;

    @JsonProperty("saved")
    private Boolean saved;

    @JsonProperty("minutes")
    private Integer minutes;

    @JsonProperty("team")
    private Team team;

    @JsonProperty("type")
    private String type;

    @JsonProperty("win")
    private Boolean win;

    @JsonProperty("player")
    private Player player;
}
