package com.fanduel.modelgenerator.generated.sportradar.mlb.dailysummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Bullpen {
    @JsonProperty("gofo")
    private Double gofo;

    @JsonProperty("bf")
    private Integer bf;

    @JsonProperty("steal")
    private Steal steal;

    @JsonProperty("bk")
    private Integer bk;

    @JsonProperty("whip")
    private Double whip;

    @JsonProperty("pitch_count")
    private Integer pitchCount;

    @JsonProperty("oab")
    private Integer oab;

    @JsonProperty("outs")
    private Outs outs;

    @JsonProperty("era")
    private Double era;

    @JsonProperty("onbase")
    private Onbase onbase;

    @JsonProperty("games")
    private Games games;

    @JsonProperty("wp")
    private Integer wp;

    @JsonProperty("pitches")
    private Pitches pitches;

    @JsonProperty("in_play")
    private InPlay inPlay;

    @JsonProperty("outcome")
    private Outcome outcome;

    @JsonProperty("bf_ip")
    private Double bfIp;

    @JsonProperty("gbfb")
    private Double gbfb;

    @JsonProperty("kbb")
    private Double kbb;

    @JsonProperty("ip_2")
    private Double ip2;

    @JsonProperty("ip_1")
    private Integer ip1;

    @JsonProperty("k9")
    private Double k9;

    @JsonProperty("oba")
    private Double oba;

    @JsonProperty("slg")
    private Double slg;

    @JsonProperty("babip")
    private Double babip;

    @JsonProperty("obp")
    private Double obp;

    @JsonProperty("runs")
    private Runs runs;

    @JsonProperty("lob")
    private Integer lob;
}
