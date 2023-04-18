package com.fanduel.modelgenerator.generated.sportradar.nfl.gameroster;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Away {
    @JsonProperty("used_challenges")
    private Integer usedChallenges;

    @JsonProperty("players")
    private List<Player> players;

    @JsonProperty("remaining_challenges")
    private Integer remainingChallenges;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("points")
    private Integer points;

    @JsonProperty("market")
    private String market;

    @JsonProperty("coaches")
    private List<Coach> coaches;

    @JsonProperty("record")
    private Record record;

    @JsonProperty("name")
    private String name;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("used_timeouts")
    private Integer usedTimeouts;

    @JsonProperty("id")
    private String id;

    @JsonProperty("remaining_timeouts")
    private Integer remainingTimeouts;
}