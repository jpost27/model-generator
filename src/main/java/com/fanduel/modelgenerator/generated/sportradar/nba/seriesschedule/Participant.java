package com.fanduel.modelgenerator.generated.sportradar.nba.seriesschedule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Participant {
    @JsonProperty("seed")
    private Integer seed;

    @JsonProperty("record")
    private Integer record;

    @JsonProperty("name")
    private String name;

    @JsonProperty("team")
    private Team team;

    @JsonProperty("source")
    private Source source;
}
