package com.fanduel.modelgenerator.generated.sportradar.nhl.seasonalfaceoffs;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Faceoffs {
    @JsonProperty("total")
    private Integer total;

    @JsonProperty("shorthanded")
    private Shorthanded shorthanded;

    @JsonProperty("powerplay")
    private Powerplay powerplay;

    @JsonProperty("lost")
    private Integer lost;

    @JsonProperty("won")
    private Integer won;

    @JsonProperty("zones")
    private List<Zone> zones;

    @JsonProperty("evenstrength")
    private Evenstrength evenstrength;

    @JsonProperty("win_pct")
    private Double winPct;
}
