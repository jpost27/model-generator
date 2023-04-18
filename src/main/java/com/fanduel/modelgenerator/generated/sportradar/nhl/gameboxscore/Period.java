package com.fanduel.modelgenerator.generated.sportradar.nhl.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Period {
    @JsonProperty("sequence")
    private Integer sequence;

    @JsonProperty("number")
    private Integer number;

    @JsonProperty("total")
    private Total total;

    @JsonProperty("shorthanded")
    private Shorthanded shorthanded;

    @JsonProperty("powerplay")
    private Powerplay powerplay;

    @JsonProperty("penalty")
    private Penalty penalty;

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type;

    @JsonProperty("evenstrength")
    private Evenstrength evenstrength;
}
