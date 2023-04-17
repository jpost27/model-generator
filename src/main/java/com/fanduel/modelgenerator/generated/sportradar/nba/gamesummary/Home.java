package com.fanduel.modelgenerator.generated.sportradar.nba.gamesummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Home {
    @JsonProperty("scoring")
    private List<Scoring> scoring;

    @JsonProperty("bonus")
    private Boolean bonus;

    @JsonProperty("players")
    private List<Player> players;

    @JsonProperty("points")
    private Integer points;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("market")
    private String market;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("coaches")
    private List<Coach> coaches;

    @JsonProperty("record")
    private Record record;

    @JsonProperty("name")
    private String name;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("id")
    private String id;

    @JsonProperty("remaining_timeouts")
    private Integer remainingTimeouts;

    @JsonProperty("statistics")
    private Statistics statistics;
}
