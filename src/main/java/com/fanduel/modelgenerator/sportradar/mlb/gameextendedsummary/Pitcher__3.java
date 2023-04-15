
package com.fanduel.modelgenerator.sportradar.mlb.gameextendedsummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pitch_type",
    "pitch_speed",
    "pitch_zone",
    "pitcher_hand",
    "hitter_hand",
    "pitch_count",
    "id",
    "pitch_x",
    "pitch_y",
    "preferred_name",
    "first_name",
    "last_name",
    "jersey_number"
})
@Generated("jsonschema2pojo")
public class Pitcher__3 {

    @JsonProperty("pitch_type")
    public String pitchType;
    @JsonProperty("pitch_speed")
    public java.lang.Double pitchSpeed;
    @JsonProperty("pitch_zone")
    public Integer pitchZone;
    @JsonProperty("pitcher_hand")
    public String pitcherHand;
    @JsonProperty("hitter_hand")
    public String hitterHand;
    @JsonProperty("pitch_count")
    public Integer pitchCount;
    @JsonProperty("id")
    public String id;
    @JsonProperty("pitch_x")
    public Integer pitchX;
    @JsonProperty("pitch_y")
    public Integer pitchY;
    @JsonProperty("preferred_name")
    public String preferredName;
    @JsonProperty("first_name")
    public String firstName;
    @JsonProperty("last_name")
    public String lastName;
    @JsonProperty("jersey_number")
    public String jerseyNumber;

}
