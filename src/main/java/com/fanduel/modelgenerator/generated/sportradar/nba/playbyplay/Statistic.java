package com.fanduel.modelgenerator.generated.sportradar.nba.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
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

    public Optional<Boolean> getThreePointShot() {
        return Optional.ofNullable(threePointShot);
    }

    public Optional<Double> getShotDistance() {
        return Optional.ofNullable(shotDistance);
    }

    public Optional<Boolean> getMade() {
        return Optional.ofNullable(made);
    }

    public Optional<String> getShotTypeDesc() {
        return Optional.ofNullable(shotTypeDesc);
    }

    public Optional<String> getShotType() {
        return Optional.ofNullable(shotType);
    }

    public Optional<String> getReboundType() {
        return Optional.ofNullable(reboundType);
    }

    public Optional<Team> getTeam() {
        return Optional.ofNullable(team);
    }

    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }

    public Optional<String> getFreeThrowType() {
        return Optional.ofNullable(freeThrowType);
    }

    public Optional<Player> getPlayer() {
        return Optional.ofNullable(player);
    }

    public Optional<Integer> getPoints() {
        return Optional.ofNullable(points);
    }
}
