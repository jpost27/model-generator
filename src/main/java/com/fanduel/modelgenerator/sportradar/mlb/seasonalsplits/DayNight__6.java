
package com.fanduel.modelgenerator.sportradar.mlb.seasonalsplits;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "value",
    "win",
    "loss",
    "save",
    "svo",
    "start",
    "play",
    "complete",
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
    "team_win",
    "team_loss"
})
@Generated("jsonschema2pojo")
public class DayNight__6 {

    @JsonProperty("value")
    public String value;
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
    @JsonProperty("team_win")
    public Integer teamWin;
    @JsonProperty("team_loss")
    public Integer teamLoss;

}
