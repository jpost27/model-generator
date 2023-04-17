package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
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

    @JsonProperty("team_shutout")
    private Integer teamShutout;

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
}
