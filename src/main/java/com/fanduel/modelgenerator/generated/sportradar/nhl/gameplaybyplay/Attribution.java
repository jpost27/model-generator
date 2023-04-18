package com.fanduel.modelgenerator.generated.sportradar.nhl.gameplaybyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Attribution {
    @JsonProperty("market")
    private String market;

    @JsonProperty("team_goal")
    private String teamGoal;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private String id;

    @JsonProperty("sr_id")
    private String srId;
}
