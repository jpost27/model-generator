package com.fanduel.modelgenerator.generated.sportradar.mlb.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class AtBat {
    @JsonProperty("sequence_number")
    private Integer sequenceNumber;

    @JsonProperty("pitcher_hand")
    private String pitcherHand;

    @JsonProperty("hitter_id")
    private String hitterId;

    @JsonProperty("hitter")
    private Hitter hitter;

    @JsonProperty("hitter_hand")
    private String hitterHand;

    @JsonProperty("description")
    private String description;

    @JsonProperty("pitcher")
    private Pitcher pitcher;

    @JsonProperty("id")
    private String id;

    @JsonProperty("events")
    private List<Event> events;

    @JsonProperty("pitcher_id")
    private String pitcherId;
}
