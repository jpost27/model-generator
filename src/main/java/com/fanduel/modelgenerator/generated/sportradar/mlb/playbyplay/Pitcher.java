package com.fanduel.modelgenerator.generated.sportradar.mlb.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Pitcher {
    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("pitch_x")
    private Integer pitchX;

    @JsonProperty("pitch_speed")
    private Double pitchSpeed;

    @JsonProperty("pitch_y")
    private Integer pitchY;

    @JsonProperty("pitch_type")
    private String pitchType;

    @JsonProperty("pitch_count")
    private Integer pitchCount;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("pitcher_hand")
    private String pitcherHand;

    @JsonProperty("jersey_number")
    private String jerseyNumber;

    @JsonProperty("hitter_hand")
    private String hitterHand;

    @JsonProperty("preferred_name")
    private String preferredName;

    @JsonProperty("id")
    private String id;

    @JsonProperty("pitch_zone")
    private Integer pitchZone;
}
