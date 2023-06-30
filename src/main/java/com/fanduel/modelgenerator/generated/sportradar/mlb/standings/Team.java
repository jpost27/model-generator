package com.fanduel.modelgenerator.generated.sportradar.mlb.standings;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
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

    public Optional<Double> getWinP() {
        return Optional.ofNullable(winP);
    }

    public Optional<Integer> getNlLoss() {
        return Optional.ofNullable(nlLoss);
    }

    public Optional<Integer> getWLoss() {
        return Optional.ofNullable(wLoss);
    }

    public Optional<Integer> getLoss() {
        return Optional.ofNullable(loss);
    }

    public Optional<Integer> getAwayWin() {
        return Optional.ofNullable(awayWin);
    }

    public Optional<Integer> getWWin() {
        return Optional.ofNullable(wWin);
    }

    public Optional<Integer> getCWin() {
        return Optional.ofNullable(cWin);
    }

    public Optional<Integer> getEWin() {
        return Optional.ofNullable(eWin);
    }

    public Optional<Rank> getRank() {
        return Optional.ofNullable(rank);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Integer> getAwayLoss() {
        return Optional.ofNullable(awayLoss);
    }

    public Optional<Integer> getELoss() {
        return Optional.ofNullable(eLoss);
    }

    public Optional<String> getAbbr() {
        return Optional.ofNullable(abbr);
    }

    public Optional<Integer> getHomeWin() {
        return Optional.ofNullable(homeWin);
    }

    public Optional<Integer> getWin() {
        return Optional.ofNullable(win);
    }

    public Optional<Integer> getHomeLoss() {
        return Optional.ofNullable(homeLoss);
    }

    public Optional<Double> getGamesBack() {
        return Optional.ofNullable(gamesBack);
    }

    public Optional<String> getStreak() {
        return Optional.ofNullable(streak);
    }

    public Optional<String> getWildCardBack() {
        return Optional.ofNullable(wildCardBack);
    }

    public Optional<String> getMarket() {
        return Optional.ofNullable(market);
    }

    public Optional<Integer> getLast10Lost() {
        return Optional.ofNullable(last10Lost);
    }

    public Optional<Integer> getCLoss() {
        return Optional.ofNullable(cLoss);
    }

    public Optional<Integer> getEliminationNumber() {
        return Optional.ofNullable(eliminationNumber);
    }

    public Optional<Integer> getAlLoss() {
        return Optional.ofNullable(alLoss);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<Integer> getLast10Won() {
        return Optional.ofNullable(last10Won);
    }

    public Optional<Integer> getAlWin() {
        return Optional.ofNullable(alWin);
    }

    public Optional<Integer> getDivisionEliminationNumber() {
        return Optional.ofNullable(divisionEliminationNumber);
    }

    public Optional<Integer> getNlWin() {
        return Optional.ofNullable(nlWin);
    }
}
