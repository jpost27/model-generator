package com.fanduel.modelgenerator.generated.sportradar.nfl.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Away {
    @JsonProperty("used_challenges")
    private Integer usedChallenges;

    @JsonProperty("decision")
    private String decision;

    @JsonProperty("remaining_challenges")
    private Integer remainingChallenges;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("points")
    private Integer points;

    @JsonProperty("market")
    private String market;

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

    @JsonProperty("outcome")
    private String outcome;

    @JsonProperty("direction")
    private String direction;
}
