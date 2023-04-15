
package com.fanduel.modelgenerator.sportradar.mlb.playbyplay;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hitter_id",
    "id",
    "hitter_hand",
    "pitcher_id",
    "pitcher_hand",
    "sequence_number",
    "description",
    "hitter",
    "pitcher",
    "events"
})
@Generated("jsonschema2pojo")
public class AtBat {

    @JsonProperty("hitter_id")
    public String hitterId;
    @JsonProperty("id")
    public String id;
    @JsonProperty("hitter_hand")
    public String hitterHand;
    @JsonProperty("pitcher_id")
    public String pitcherId;
    @JsonProperty("pitcher_hand")
    public String pitcherHand;
    @JsonProperty("sequence_number")
    public Integer sequenceNumber;
    @JsonProperty("description")
    public String description;
    @JsonProperty("hitter")
    public Hitter hitter;
    @JsonProperty("pitcher")
    public Pitcher pitcher;
    @JsonProperty("events")
    public List<Event__1> events = new ArrayList<Event__1>();

}
