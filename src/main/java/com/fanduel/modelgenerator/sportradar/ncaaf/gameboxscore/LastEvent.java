
package com.fanduel.modelgenerator.sportradar.ncaaf.gameboxscore;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "sequence",
    "clock",
    "event_type",
    "description",
    "alt_description",
    "created_at",
    "updated_at",
    "wall_clock"
})
@Generated("jsonschema2pojo")
public class LastEvent {

    @JsonProperty("type")
    public String type;
    @JsonProperty("id")
    public String id;
    @JsonProperty("sequence")
    public Double sequence;
    @JsonProperty("clock")
    public String clock;
    @JsonProperty("event_type")
    public String eventType;
    @JsonProperty("description")
    public String description;
    @JsonProperty("alt_description")
    public String altDescription;
    @JsonProperty("created_at")
    public String createdAt;
    @JsonProperty("updated_at")
    public String updatedAt;
    @JsonProperty("wall_clock")
    public String wallClock;

}
