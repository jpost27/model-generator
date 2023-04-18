package com.fanduel.modelgenerator.generated.sportradar.nhl.gamefaceoffs;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Home {
    @JsonProperty("market")
    private String market;

    @JsonProperty("strength")
    private String strength;

    @JsonProperty("faceoffs")
    private Faceoffs faceoffs;

    @JsonProperty("players")
    private List<Player> players;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private String id;

    @JsonProperty("points")
    private Integer points;

    @JsonProperty("sr_id")
    private String srId;
}
