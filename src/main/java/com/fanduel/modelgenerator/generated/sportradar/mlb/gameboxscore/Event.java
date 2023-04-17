package com.fanduel.modelgenerator.generated.sportradar.mlb.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Event {
    @JsonProperty("hitter_id")
    private String hitterId;

    @JsonProperty("inning_half")
    private String inningHalf;

    @JsonProperty("inning")
    private Integer inning;

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type;

    @JsonProperty("runners")
    private List<Runner> runners;

    @JsonProperty("hitter_outcome")
    private String hitterOutcome;

    @JsonProperty("pitcher_id")
    private String pitcherId;
}
