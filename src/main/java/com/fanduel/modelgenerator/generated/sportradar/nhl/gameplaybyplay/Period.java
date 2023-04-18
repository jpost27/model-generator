package com.fanduel.modelgenerator.generated.sportradar.nhl.gameplaybyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Period {
    @JsonProperty("sequence")
    private Integer sequence;

    @JsonProperty("number")
    private Integer number;

    @JsonProperty("scoring")
    private Scoring scoring;

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type;

    @JsonProperty("events")
    private List<Event> events;
}
