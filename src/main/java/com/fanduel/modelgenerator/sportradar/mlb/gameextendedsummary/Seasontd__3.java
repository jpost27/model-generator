
package com.fanduel.modelgenerator.sportradar.mlb.gameextendedsummary;

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
    "games"
})
@Generated("jsonschema2pojo")
public class Seasontd__3 {

    @JsonProperty("ab")
    public Integer ab;
    @JsonProperty("lob")
    public Integer lob;
    @JsonProperty("rbi")
    public Integer rbi;
    @JsonProperty("abhr")
    public java.lang.Double abhr;
    @JsonProperty("abk")
    public java.lang.Double abk;
    @JsonProperty("bip")
    public Integer bip;
    @JsonProperty("babip")
    public java.lang.Double babip;
    @JsonProperty("bbk")
    public java.lang.Double bbk;
    @JsonProperty("bbpa")
    public java.lang.Double bbpa;
    @JsonProperty("iso")
    public java.lang.Double iso;
    @JsonProperty("obp")
    public java.lang.Double obp;
    @JsonProperty("ops")
    public java.lang.Double ops;
    @JsonProperty("seca")
    public java.lang.Double seca;
    @JsonProperty("slg")
    public java.lang.Double slg;
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
    public java.lang.Double gofo;
    @JsonProperty("onbase")
    public Onbase__14 onbase;
    @JsonProperty("runs")
    public Runs__14 runs;
    @JsonProperty("outcome")
    public Outcome__14 outcome;
    @JsonProperty("outs")
    public Outs__14 outs;
    @JsonProperty("steal")
    public Steal__19 steal;
    @JsonProperty("pitches")
    public Pitches__14 pitches;
    @JsonProperty("games")
    public Games__15 games;

}
