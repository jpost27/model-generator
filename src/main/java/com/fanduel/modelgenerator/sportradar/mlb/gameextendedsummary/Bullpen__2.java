
package com.fanduel.modelgenerator.sportradar.mlb.gameextendedsummary;

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
    "games"
})
@Generated("jsonschema2pojo")
public class Bullpen__2 {

    @JsonProperty("oba")
    public java.lang.Double oba;
    @JsonProperty("lob")
    public Integer lob;
    @JsonProperty("era")
    public java.lang.Double era;
    @JsonProperty("k9")
    public java.lang.Double k9;
    @JsonProperty("whip")
    public java.lang.Double whip;
    @JsonProperty("kbb")
    public java.lang.Double kbb;
    @JsonProperty("pitch_count")
    public Integer pitchCount;
    @JsonProperty("wp")
    public Integer wp;
    @JsonProperty("bk")
    public Integer bk;
    @JsonProperty("ip_1")
    public Integer ip1;
    @JsonProperty("ip_2")
    public java.lang.Double ip2;
    @JsonProperty("bf")
    public Integer bf;
    @JsonProperty("gofo")
    public java.lang.Double gofo;
    @JsonProperty("babip")
    public java.lang.Double babip;
    @JsonProperty("bf_ip")
    public java.lang.Double bfIp;
    @JsonProperty("gbfb")
    public java.lang.Double gbfb;
    @JsonProperty("oab")
    public Integer oab;
    @JsonProperty("slg")
    public java.lang.Double slg;
    @JsonProperty("obp")
    public java.lang.Double obp;
    @JsonProperty("onbase")
    public Onbase__13 onbase;
    @JsonProperty("runs")
    public Runs__13 runs;
    @JsonProperty("outcome")
    public Outcome__13 outcome;
    @JsonProperty("outs")
    public Outs__13 outs;
    @JsonProperty("steal")
    public Steal__17 steal;
    @JsonProperty("pitches")
    public Pitches__13 pitches;
    @JsonProperty("in_play")
    public InPlay__9 inPlay;
    @JsonProperty("games")
    public Games__14 games;

}
