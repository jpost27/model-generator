package com.fanduel.modelgenerator.generated.sportradar.nfl.postgamestandings;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Team {
    @JsonProperty("wins")
    private Integer wins;

    @JsonProperty("points_against")
    private Integer pointsAgainst;

    @JsonProperty("strength_of_victory")
    private StrengthOfVictory strengthOfVictory;

    @JsonProperty("records")
    private List<Record> records;

    @JsonProperty("points_for")
    private Integer pointsFor;

    @JsonProperty("streak")
    private Streak streak;

    @JsonProperty("losses")
    private Integer losses;

    @JsonProperty("strength_of_schedule")
    private StrengthOfSchedule strengthOfSchedule;

    @JsonProperty("win_pct")
    private Double winPct;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("market")
    private String market;

    @JsonProperty("ties")
    private Integer ties;

    @JsonProperty("name")
    private String name;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("rank")
    private Rank rank;

    @JsonProperty("id")
    private String id;
}
