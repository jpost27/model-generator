package com.fanduel.modelgenerator.generated.sportradar.nfl.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Summary {
    @JsonProperty("venue")
    private Venue venue;

    @JsonProperty("week")
    private Week week;

    @JsonProperty("away")
    private Away away;

    @JsonProperty("season")
    private Season season;

    @JsonProperty("home")
    private Home home;
}
