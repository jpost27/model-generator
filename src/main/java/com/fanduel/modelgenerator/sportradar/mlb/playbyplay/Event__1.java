
package com.fanduel.modelgenerator.sportradar.mlb.playbyplay;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status",
    "id",
    "outcome_id",
    "created_at",
    "updated_at",
    "sequence_number",
    "official",
    "type",
    "wall_clock",
    "flags",
    "count",
    "pitcher",
    "hitter",
    "mlb_pitch_data",
    "hit_location",
    "hit_type",
    "mlb_hit_data",
    "fielders",
    "runners",
    "errors"
})
@Generated("jsonschema2pojo")
public class Event__1 {

    @JsonProperty("status")
    public String status;
    @JsonProperty("id")
    public String id;
    @JsonProperty("outcome_id")
    public String outcomeId;
    @JsonProperty("created_at")
    public String createdAt;
    @JsonProperty("updated_at")
    public String updatedAt;
    @JsonProperty("sequence_number")
    public Integer sequenceNumber;
    @JsonProperty("official")
    public Boolean official;
    @JsonProperty("type")
    public String type;
    @JsonProperty("wall_clock")
    public WallClock wallClock;
    @JsonProperty("flags")
    public Flags flags;
    @JsonProperty("count")
    public Count count;
    @JsonProperty("pitcher")
    public Pitcher__1 pitcher;
    @JsonProperty("hitter")
    public Hitter__1 hitter;
    @JsonProperty("mlb_pitch_data")
    public MlbPitchData mlbPitchData;
    @JsonProperty("hit_location")
    public String hitLocation;
    @JsonProperty("hit_type")
    public String hitType;
    @JsonProperty("mlb_hit_data")
    public MlbHitData mlbHitData;
    @JsonProperty("fielders")
    public List<Fielder> fielders = new ArrayList<Fielder>();
    @JsonProperty("runners")
    public List<Runner> runners = new ArrayList<Runner>();
    @JsonProperty("errors")
    public List<Error> errors = new ArrayList<Error>();

}
