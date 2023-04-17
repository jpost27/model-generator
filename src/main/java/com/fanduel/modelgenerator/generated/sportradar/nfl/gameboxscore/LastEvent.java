package com.fanduel.modelgenerator.generated.sportradar.nfl.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class LastEvent {
    @JsonProperty("sequence")
    private Double sequence;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("wall_clock")
    private String wallClock;

    @JsonProperty("description")
    private String description;

    @JsonProperty("id")
    private String id;

    @JsonProperty("clock")
    private String clock;

    @JsonProperty("event_type")
    private String eventType;

    @JsonProperty("type")
    private String type;

    @JsonProperty("updated_at")
    private String updatedAt;
}
