
package com.fanduel.modelgenerator.sportradar.mlb.gamesummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "oba",
    "lob",
    "era",
    "k9",
    "whip",
    "kbb",
    "pitch_count",
    "wp",
    "bk",
    "ip_1",
    "ip_2",
    "bf",
    "gofo",
    "babip",
    "bf_ip",
    "gbfb",
    "oab",
    "slg",
    "obp",
    "onbase",
    "runs",
    "outcome",
    "outs",
    "steal",
    "pitches",
    "in_play",
    "games",
    "bf_start"
})
@Generated("jsonschema2pojo")
public class Overall__3 {

    @JsonProperty("oba")
    public Double oba;
    @JsonProperty("lob")
    public Integer lob;
    @JsonProperty("era")
    public Double era;
    @JsonProperty("k9")
    public Double k9;
    @JsonProperty("whip")
    public Double whip;
    @JsonProperty("kbb")
    public Double kbb;
    @JsonProperty("pitch_count")
    public Integer pitchCount;
    @JsonProperty("wp")
    public Integer wp;
    @JsonProperty("bk")
    public Integer bk;
    @JsonProperty("ip_1")
    public Integer ip1;
    @JsonProperty("ip_2")
    public Double ip2;
    @JsonProperty("bf")
    public Integer bf;
    @JsonProperty("gofo")
    public Integer gofo;
    @JsonProperty("babip")
    public Double babip;
    @JsonProperty("bf_ip")
    public Double bfIp;
    @JsonProperty("gbfb")
    public Double gbfb;
    @JsonProperty("oab")
    public Integer oab;
    @JsonProperty("slg")
    public Double slg;
    @JsonProperty("obp")
    public Double obp;
    @JsonProperty("onbase")
    public Onbase__4 onbase;
    @JsonProperty("runs")
    public Runs__4 runs;
    @JsonProperty("outcome")
    public Outcome__4 outcome;
    @JsonProperty("outs")
    public Outs__4 outs;
    @JsonProperty("steal")
    public Steal__5 steal;
    @JsonProperty("pitches")
    public Pitches__4 pitches;
    @JsonProperty("in_play")
    public InPlay__3 inPlay;
    @JsonProperty("games")
    public Games__3 games;
    @JsonProperty("bf_start")
    public Double bfStart;

}
