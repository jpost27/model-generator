
package com.fanduel.modelgenerator.sportradar.mlb.playerprofile;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ab",
    "lob",
    "rbi",
    "abhr",
    "abk",
    "bip",
    "babip",
    "bbk",
    "bbpa",
    "iso",
    "obp",
    "ops",
    "seca",
    "slg",
    "xbh",
    "pitch_count",
    "lob_risp_2out",
    "team_lob",
    "ab_risp",
    "hit_risp",
    "rbi_2out",
    "linedrive",
    "groundball",
    "popup",
    "flyball",
    "ap",
    "avg",
    "gofo",
    "onbase",
    "runs",
    "outcome",
    "outs",
    "steal",
    "pitches",
    "games",
    "woba",
    "wraa",
    "war",
    "bwar",
    "fwar",
    "brwar",
    "wgdp"
})
@Generated("jsonschema2pojo")
public class Overall__4 {

    @JsonProperty("ab")
    public Integer ab;
    @JsonProperty("lob")
    public Integer lob;
    @JsonProperty("rbi")
    public Integer rbi;
    @JsonProperty("abhr")
    public Double abhr;
    @JsonProperty("abk")
    public Double abk;
    @JsonProperty("bip")
    public Integer bip;
    @JsonProperty("babip")
    public Double babip;
    @JsonProperty("bbk")
    public Double bbk;
    @JsonProperty("bbpa")
    public Double bbpa;
    @JsonProperty("iso")
    public Double iso;
    @JsonProperty("obp")
    public Double obp;
    @JsonProperty("ops")
    public Double ops;
    @JsonProperty("seca")
    public Double seca;
    @JsonProperty("slg")
    public Double slg;
    @JsonProperty("xbh")
    public Integer xbh;
    @JsonProperty("pitch_count")
    public Integer pitchCount;
    @JsonProperty("lob_risp_2out")
    public Integer lobRisp2out;
    @JsonProperty("team_lob")
    public Integer teamLob;
    @JsonProperty("ab_risp")
    public Integer abRisp;
    @JsonProperty("hit_risp")
    public Integer hitRisp;
    @JsonProperty("rbi_2out")
    public Integer rbi2out;
    @JsonProperty("linedrive")
    public Integer linedrive;
    @JsonProperty("groundball")
    public Integer groundball;
    @JsonProperty("popup")
    public Integer popup;
    @JsonProperty("flyball")
    public Integer flyball;
    @JsonProperty("ap")
    public Integer ap;
    @JsonProperty("avg")
    public String avg;
    @JsonProperty("gofo")
    public Double gofo;
    @JsonProperty("onbase")
    public Onbase__1 onbase;
    @JsonProperty("runs")
    public Runs__1 runs;
    @JsonProperty("outcome")
    public Outcome__1 outcome;
    @JsonProperty("outs")
    public Outs__1 outs;
    @JsonProperty("steal")
    public Steal__3 steal;
    @JsonProperty("pitches")
    public Pitches__1 pitches;
    @JsonProperty("games")
    public Games__3 games;
    @JsonProperty("woba")
    public Double woba;
    @JsonProperty("wraa")
    public Double wraa;
    @JsonProperty("war")
    public Double war;
    @JsonProperty("bwar")
    public Double bwar;
    @JsonProperty("fwar")
    public Double fwar;
    @JsonProperty("brwar")
    public Double brwar;
    @JsonProperty("wgdp")
    public Double wgdp;

}
