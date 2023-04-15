
package com.fanduel.modelgenerator.sportradar.mlb.gamesummary;

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
    "pitches"
})
@Generated("jsonschema2pojo")
public class Overall__6 {

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
    public Onbase__8 onbase;
    @JsonProperty("runs")
    public Runs__8 runs;
    @JsonProperty("outcome")
    public Outcome__8 outcome;
    @JsonProperty("outs")
    public Outs__8 outs;
    @JsonProperty("steal")
    public Steal__11 steal;
    @JsonProperty("pitches")
    public Pitches__8 pitches;

}
