
package com.fanduel.modelgenerator.sportradar.mlb.dailyboxscore;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hitter_id",
    "pitcher_id",
    "inning",
    "inning_half",
    "type",
    "hitter_outcome",
    "id",
    "runners"
})
@Generated("jsonschema2pojo")
public class Event {

    @JsonProperty("hitter_id")
    public String hitterId;
    @JsonProperty("pitcher_id")
    public String pitcherId;
    @JsonProperty("inning")
    public Integer inning;
    @JsonProperty("inning_half")
    public String inningHalf;
    @JsonProperty("type")
    public String type;
    @JsonProperty("hitter_outcome")
    public String hitterOutcome;
    @JsonProperty("id")
    public String id;
    @JsonProperty("runners")
    public List<Runner> runners = new ArrayList<Runner>();

}
