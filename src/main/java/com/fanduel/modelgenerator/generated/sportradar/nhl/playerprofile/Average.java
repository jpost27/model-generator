package com.fanduel.modelgenerator.generated.sportradar.nhl.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Average {
    @JsonProperty("penalty_minutes")
    private Double penaltyMinutes;

    @JsonProperty("penalties")
    private Double penalties;

    @JsonProperty("takeaways")
    private Double takeaways;

    @JsonProperty("blocked_shots")
    private Double blockedShots;

    @JsonProperty("blocked_att")
    private Double blockedAtt;

    @JsonProperty("points")
    private Double points;

    @JsonProperty("hits")
    private Double hits;

    @JsonProperty("total")
    private String total;

    @JsonProperty("shorthanded")
    private String shorthanded;

    @JsonProperty("powerplay")
    private String powerplay;

    @JsonProperty("assists")
    private Double assists;

    @JsonProperty("shifts")
    private Double shifts;

    @JsonProperty("overtime")
    private String overtime;

    @JsonProperty("evenstrength")
    private String evenstrength;

    @JsonProperty("shots")
    private Double shots;

    @JsonProperty("missed_shots")
    private Double missedShots;

    @JsonProperty("giveaways")
    private Double giveaways;

    @JsonProperty("goals")
    private Double goals;
}
