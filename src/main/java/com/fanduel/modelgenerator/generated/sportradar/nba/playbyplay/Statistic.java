package com.fanduel.modelgenerator.generated.sportradar.nba.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Statistic {
    @JsonProperty("three_point_shot")
    private Boolean threePointShot;

    @JsonProperty("shot_distance")
    private Double shotDistance;

    @JsonProperty("made")
    private Boolean made;

    @JsonProperty("shot_type_desc")
    private String shotTypeDesc;

    @JsonProperty("shot_type")
    private String shotType;

    @JsonProperty("rebound_type")
    private String reboundType;

    @JsonProperty("team")
    private Team team;

    @JsonProperty("type")
    private String type;

    @JsonProperty("free_throw_type")
    private String freeThrowType;

    @JsonProperty("player")
    private Player player;

    @JsonProperty("points")
    private Integer points;
}
