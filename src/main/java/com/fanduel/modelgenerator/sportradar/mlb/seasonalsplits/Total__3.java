
package com.fanduel.modelgenerator.sportradar.mlb.seasonalsplits;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "win",
    "loss",
    "save",
    "svo",
    "start",
    "play",
    "complete",
    "team_win",
    "team_loss",
    "ip_1",
    "ip_2",
    "h",
    "runs",
    "er",
    "hr",
    "bb",
    "ibb",
    "oba",
    "era",
    "ktotal",
    "s",
    "d",
    "t",
    "rbi",
    "hbp",
    "sb",
    "cs",
    "obp",
    "slg",
    "ops",
    "bf"
})
@Generated("jsonschema2pojo")
public class Total__3 {

    @JsonProperty("win")
    public Integer win;
    @JsonProperty("loss")
    public Integer loss;
    @JsonProperty("save")
    public Integer save;
    @JsonProperty("svo")
    public Integer svo;
    @JsonProperty("start")
    public Integer start;
    @JsonProperty("play")
    public Integer play;
    @JsonProperty("complete")
    public Integer complete;
    @JsonProperty("team_win")
    public Integer teamWin;
    @JsonProperty("team_loss")
    public Integer teamLoss;
    @JsonProperty("ip_1")
    public Integer ip1;
    @JsonProperty("ip_2")
    public Double ip2;
    @JsonProperty("h")
    public Integer h;
    @JsonProperty("runs")
    public Integer runs;
    @JsonProperty("er")
    public Integer er;
    @JsonProperty("hr")
    public Integer hr;
    @JsonProperty("bb")
    public Integer bb;
    @JsonProperty("ibb")
    public Integer ibb;
    @JsonProperty("oba")
    public Double oba;
    @JsonProperty("era")
    public Double era;
    @JsonProperty("ktotal")
    public Integer ktotal;
    @JsonProperty("s")
    public Integer s;
    @JsonProperty("d")
    public Integer d;
    @JsonProperty("t")
    public Integer t;
    @JsonProperty("rbi")
    public Integer rbi;
    @JsonProperty("hbp")
    public Integer hbp;
    @JsonProperty("sb")
    public Integer sb;
    @JsonProperty("cs")
    public Integer cs;
    @JsonProperty("obp")
    public Double obp;
    @JsonProperty("slg")
    public Double slg;
    @JsonProperty("ops")
    public Double ops;
    @JsonProperty("bf")
    public Integer bf;

}
