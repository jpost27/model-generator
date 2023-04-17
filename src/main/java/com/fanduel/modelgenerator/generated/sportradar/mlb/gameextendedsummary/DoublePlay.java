package com.fanduel.modelgenerator.generated.sportradar.mlb.gameextendedsummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class DoublePlay {
    @JsonProperty("sequence_number")
    private Integer sequenceNumber;

    @JsonProperty("flags")
    private Flags flags;

    @JsonProperty("count")
    private Count count;

    @JsonProperty("outcome_id")
    private String outcomeId;

    @JsonProperty("type")
    private String type;

    @JsonProperty("runners")
    private List<Runner> runners;

    @JsonProperty("fielders")
    private List<Fielder> fielders;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("hit_type")
    private String hitType;

    @JsonProperty("inning_half")
    private String inningHalf;

    @JsonProperty("inning")
    private Integer inning;

    @JsonProperty("hitter")
    private Hitter hitter;

    @JsonProperty("pitcher")
    private Pitcher pitcher;

    @JsonProperty("id")
    private String id;

    @JsonProperty("hit_location")
    private String hitLocation;

    @JsonProperty("status")
    private String status;

    @JsonProperty("updated_at")
    private String updatedAt;
}
