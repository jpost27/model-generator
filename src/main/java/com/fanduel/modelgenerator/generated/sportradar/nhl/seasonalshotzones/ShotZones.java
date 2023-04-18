package com.fanduel.modelgenerator.generated.sportradar.nhl.seasonalshotzones;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class ShotZones {
    @JsonProperty("right_point")
    private RightPoint rightPoint;

    @JsonProperty("low_left")
    private LowLeft lowLeft;

    @JsonProperty("right_slot")
    private RightSlot rightSlot;

    @JsonProperty("neutral_zone")
    private NeutralZone neutralZone;

    @JsonProperty("left_slot")
    private LeftSlot leftSlot;

    @JsonProperty("low_right_point")
    private LowRightPoint lowRightPoint;

    @JsonProperty("slot")
    private Slot slot;

    @JsonProperty("down_low")
    private DownLow downLow;

    @JsonProperty("high_slot")
    private HighSlot highSlot;

    @JsonProperty("low_slot")
    private LowSlot lowSlot;

    @JsonProperty("defensive_zone")
    private DefensiveZone defensiveZone;

    @JsonProperty("center_point")
    private CenterPoint centerPoint;

    @JsonProperty("inside_left_circle")
    private InsideLeftCircle insideLeftCircle;

    @JsonProperty("low_right")
    private LowRight lowRight;

    @JsonProperty("low_center_point")
    private LowCenterPoint lowCenterPoint;

    @JsonProperty("outside_right_circle")
    private OutsideRightCircle outsideRightCircle;

    @JsonProperty("left_point")
    private LeftPoint leftPoint;

    @JsonProperty("outside_left_circle")
    private OutsideLeftCircle outsideLeftCircle;

    @JsonProperty("low_left_point")
    private LowLeftPoint lowLeftPoint;

    @JsonProperty("inside_right_circle")
    private InsideRightCircle insideRightCircle;
}
