
package com.fanduel.modelgenerator.sportradar.mlb.gameextendedsummary;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "inning",
    "inning_half",
    "sequence_number",
    "hit_location",
    "hit_type",
    "status",
    "id",
    "outcome_id",
    "created_at",
    "updated_at",
    "type",
    "flags",
    "count",
    "pitcher",
    "hitter",
    "runners"
})
@Generated("jsonschema2pojo")
public class Double {

    @JsonProperty("inning")
    public Integer inning;
    @JsonProperty("inning_half")
    public String inningHalf;
    @JsonProperty("sequence_number")
    public Integer sequenceNumber;
    @JsonProperty("hit_location")
    public String hitLocation;
    @JsonProperty("hit_type")
    public String hitType;
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
    @JsonProperty("type")
    public String type;
    @JsonProperty("flags")
    public Flags__3 flags;
    @JsonProperty("count")
    public Count__3 count;
    @JsonProperty("pitcher")
    public Pitcher__3 pitcher;
    @JsonProperty("hitter")
    public Hitter__3 hitter;
    @JsonProperty("runners")
    public List<Runner__3> runners = new ArrayList<Runner__3>();

}
