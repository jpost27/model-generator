
package com.fanduel.modelgenerator.sportradar.mlb.dailysummary;

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
public class Overall__3 {

    @JsonProperty("ab")
    public Integer ab;
    @JsonProperty("lob")
    public Integer lob;
    @JsonProperty("rbi")
    public Integer rbi;
    @JsonProperty("abhr")
    public Integer abhr;
    @JsonProperty("abk")
    public Integer abk;
    @JsonProperty("bip")
    public Integer bip;
    @JsonProperty("babip")
    public Integer babip;
    @JsonProperty("bbk")
    public Integer bbk;
    @JsonProperty("bbpa")
    public Integer bbpa;
    @JsonProperty("iso")
    public Double iso;
    @JsonProperty("obp")
    public Integer obp;
    @JsonProperty("ops")
    public Double ops;
    @JsonProperty("seca")
    public Integer seca;
    @JsonProperty("slg")
    public Integer slg;
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
    @JsonProperty("games")
    public Games__3 games;

}
