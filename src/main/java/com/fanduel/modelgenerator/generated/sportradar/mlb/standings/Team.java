package com.fanduel.modelgenerator.generated.sportradar.mlb.standings;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Team {
    @JsonProperty("win_p")
    private Double winP;

    @JsonProperty("nl_loss")
    private Integer nlLoss;

    @JsonProperty("w_loss")
    private Integer wLoss;

    @JsonProperty("loss")
    private Integer loss;

    @JsonProperty("away_win")
    private Integer awayWin;

    @JsonProperty("w_win")
    private Integer wWin;

    @JsonProperty("c_win")
    private Integer cWin;

    @JsonProperty("e_win")
    private Integer eWin;

    @JsonProperty("rank")
    private Rank rank;

    @JsonProperty("id")
    private String id;

    @JsonProperty("away_loss")
    private Integer awayLoss;

    @JsonProperty("e_loss")
    private Integer eLoss;

    @JsonProperty("abbr")
    private String abbr;

    @JsonProperty("home_win")
    private Integer homeWin;

    @JsonProperty("win")
    private Integer win;

    @JsonProperty("home_loss")
    private Integer homeLoss;

    @JsonProperty("games_back")
    private Double gamesBack;

    @JsonProperty("streak")
    private String streak;

    @JsonProperty("wild_card_back")
    private String wildCardBack;

    @JsonProperty("market")
    private String market;

    @JsonProperty("last_10_lost")
    private Integer last10Lost;

    @JsonProperty("c_loss")
    private Integer cLoss;

    @JsonProperty("elimination_number")
    private Integer eliminationNumber;

    @JsonProperty("al_loss")
    private Integer alLoss;

    @JsonProperty("name")
    private String name;

    @JsonProperty("last_10_won")
    private Integer last10Won;

    @JsonProperty("al_win")
    private Integer alWin;

    @JsonProperty("division_elimination_number")
    private Integer divisionEliminationNumber;

    @JsonProperty("nl_win")
    private Integer nlWin;
}
