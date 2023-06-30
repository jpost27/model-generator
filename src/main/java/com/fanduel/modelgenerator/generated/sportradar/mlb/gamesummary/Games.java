package com.fanduel.modelgenerator.generated.sportradar.mlb.gamesummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Games {
    @JsonProperty("play")
    private Integer play;

    @JsonProperty("start")
    private Integer start;

    @JsonProperty("save")
    private Integer save;

    @JsonProperty("team_loss")
    private Integer teamLoss;

    @JsonProperty("team_win")
    private Integer teamWin;

    @JsonProperty("svo")
    private Integer svo;

    @JsonProperty("qstart")
    private Integer qstart;

    @JsonProperty("hold")
    private Integer hold;

    @JsonProperty("shutout")
    private Integer shutout;

    @JsonProperty("loss")
    private Integer loss;

    @JsonProperty("blown_save")
    private Integer blownSave;

    @JsonProperty("finish")
    private Integer finish;

    @JsonProperty("complete")
    private Integer complete;

    @JsonProperty("win")
    private Integer win;

    public Optional<Integer> getPlay() {
        return Optional.ofNullable(play);
    }

    public Optional<Integer> getStart() {
        return Optional.ofNullable(start);
    }

    public Optional<Integer> getSave() {
        return Optional.ofNullable(save);
    }

    public Optional<Integer> getTeamLoss() {
        return Optional.ofNullable(teamLoss);
    }

    public Optional<Integer> getTeamWin() {
        return Optional.ofNullable(teamWin);
    }

    public Optional<Integer> getSvo() {
        return Optional.ofNullable(svo);
    }

    public Optional<Integer> getQstart() {
        return Optional.ofNullable(qstart);
    }

    public Optional<Integer> getHold() {
        return Optional.ofNullable(hold);
    }

    public Optional<Integer> getShutout() {
        return Optional.ofNullable(shutout);
    }

    public Optional<Integer> getLoss() {
        return Optional.ofNullable(loss);
    }

    public Optional<Integer> getBlownSave() {
        return Optional.ofNullable(blownSave);
    }

    public Optional<Integer> getFinish() {
        return Optional.ofNullable(finish);
    }

    public Optional<Integer> getComplete() {
        return Optional.ofNullable(complete);
    }

    public Optional<Integer> getWin() {
        return Optional.ofNullable(win);
    }
}
