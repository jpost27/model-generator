
package com.fanduel.modelgenerator.sportradar.mlb.standings;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "market",
    "abbr",
    "id",
    "away_loss",
    "away_win",
    "elimination_number",
    "games_back",
    "home_loss",
    "home_win",
    "last_10_lost",
    "last_10_won",
    "loss",
    "streak",
    "wild_card_back",
    "win",
    "win_p",
    "al_loss",
    "al_win",
    "c_loss",
    "c_win",
    "w_loss",
    "w_win",
    "e_loss",
    "e_win",
    "division_elimination_number",
    "rank",
    "nl_loss",
    "nl_win"
})
@Generated("jsonschema2pojo")
public class Team {

    @JsonProperty("name")
    public String name;
    @JsonProperty("market")
    public String market;
    @JsonProperty("abbr")
    public String abbr;
    @JsonProperty("id")
    public String id;
    @JsonProperty("away_loss")
    public Integer awayLoss;
    @JsonProperty("away_win")
    public Integer awayWin;
    @JsonProperty("elimination_number")
    public Integer eliminationNumber;
    @JsonProperty("games_back")
    public Double gamesBack;
    @JsonProperty("home_loss")
    public Integer homeLoss;
    @JsonProperty("home_win")
    public Integer homeWin;
    @JsonProperty("last_10_lost")
    public Integer last10Lost;
    @JsonProperty("last_10_won")
    public Integer last10Won;
    @JsonProperty("loss")
    public Integer loss;
    @JsonProperty("streak")
    public String streak;
    @JsonProperty("wild_card_back")
    public String wildCardBack;
    @JsonProperty("win")
    public Integer win;
    @JsonProperty("win_p")
    public Double winP;
    @JsonProperty("al_loss")
    public Integer alLoss;
    @JsonProperty("al_win")
    public Integer alWin;
    @JsonProperty("c_loss")
    public Integer cLoss;
    @JsonProperty("c_win")
    public Integer cWin;
    @JsonProperty("w_loss")
    public Integer wLoss;
    @JsonProperty("w_win")
    public Integer wWin;
    @JsonProperty("e_loss")
    public Integer eLoss;
    @JsonProperty("e_win")
    public Integer eWin;
    @JsonProperty("division_elimination_number")
    public Integer divisionEliminationNumber;
    @JsonProperty("rank")
    public Rank rank;
    @JsonProperty("nl_loss")
    public Integer nlLoss;
    @JsonProperty("nl_win")
    public Integer nlWin;

}
