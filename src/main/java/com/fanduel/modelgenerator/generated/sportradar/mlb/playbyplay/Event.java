package com.fanduel.modelgenerator.generated.sportradar.mlb.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Event {
    @JsonProperty("sequence_number")
    private Integer sequenceNumber;

    @JsonProperty("flags")
    private Flags flags;

    @JsonProperty("count")
    private Count count;

    @JsonProperty("official")
    private Boolean official;

    @JsonProperty("lineup")
    private Lineup lineup;

    @JsonProperty("outcome_id")
    private String outcomeId;

    @JsonProperty("type")
    private String type;

    @JsonProperty("fielders")
    private List<Fielder> fielders;

    @JsonProperty("runners")
    private List<Runner> runners;

    @JsonProperty("at_bat")
    private AtBat atBat;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("mlb_pitch_data")
    private MlbPitchData mlbPitchData;

    @JsonProperty("hit_type")
    private String hitType;

    @JsonProperty("wall_clock")
    private WallClock wallClock;

    @JsonProperty("hitter")
    private Hitter hitter;

    @JsonProperty("pitcher")
    private Pitcher pitcher;

    @JsonProperty("id")
    private String id;

    @JsonProperty("hit_location")
    private String hitLocation;

    @JsonProperty("mlb_hit_data")
    private MlbHitData mlbHitData;

    @JsonProperty("errors")
    private List<Error> errors;

    @JsonProperty("status")
    private String status;

    @JsonProperty("updated_at")
    private String updatedAt;
}
