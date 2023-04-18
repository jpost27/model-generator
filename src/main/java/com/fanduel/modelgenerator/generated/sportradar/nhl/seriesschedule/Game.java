package com.fanduel.modelgenerator.generated.sportradar.nhl.seriesschedule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Game {
    @JsonProperty("coverage")
    private String coverage;

    @JsonProperty("venue")
    private Venue venue;

    @JsonProperty("away")
    private Away away;

    @JsonProperty("scheduled")
    private String scheduled;

    @JsonProperty("id")
    private String id;

    @JsonProperty("title")
    private String title;

    @JsonProperty("status")
    private String status;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("home")
    private Home home;
}
