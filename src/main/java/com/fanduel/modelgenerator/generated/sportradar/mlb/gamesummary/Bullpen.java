package com.fanduel.modelgenerator.generated.sportradar.mlb.gamesummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Bullpen {
    @JsonProperty("gofo")
    private Integer gofo;

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

    public Optional<Integer> getGofo() {
        return Optional.ofNullable(gofo);
    }

    public Optional<Integer> getBf() {
        return Optional.ofNullable(bf);
    }

    public Optional<Steal> getSteal() {
        return Optional.ofNullable(steal);
    }

    public Optional<Integer> getBk() {
        return Optional.ofNullable(bk);
    }

    public Optional<Double> getWhip() {
        return Optional.ofNullable(whip);
    }

    public Optional<Integer> getPitchCount() {
        return Optional.ofNullable(pitchCount);
    }

    public Optional<Integer> getOab() {
        return Optional.ofNullable(oab);
    }

    public Optional<Outs> getOuts() {
        return Optional.ofNullable(outs);
    }

    public Optional<Double> getEra() {
        return Optional.ofNullable(era);
    }

    public Optional<Onbase> getOnbase() {
        return Optional.ofNullable(onbase);
    }

    public Optional<Games> getGames() {
        return Optional.ofNullable(games);
    }

    public Optional<Integer> getWp() {
        return Optional.ofNullable(wp);
    }

    public Optional<Pitches> getPitches() {
        return Optional.ofNullable(pitches);
    }

    public Optional<InPlay> getInPlay() {
        return Optional.ofNullable(inPlay);
    }

    public Optional<Outcome> getOutcome() {
        return Optional.ofNullable(outcome);
    }

    public Optional<Double> getBfIp() {
        return Optional.ofNullable(bfIp);
    }

    public Optional<Double> getGbfb() {
        return Optional.ofNullable(gbfb);
    }

    public Optional<Double> getKbb() {
        return Optional.ofNullable(kbb);
    }

    public Optional<Double> getIp2() {
        return Optional.ofNullable(ip2);
    }

    public Optional<Integer> getIp1() {
        return Optional.ofNullable(ip1);
    }

    public Optional<Double> getK9() {
        return Optional.ofNullable(k9);
    }

    public Optional<Double> getOba() {
        return Optional.ofNullable(oba);
    }

    public Optional<Double> getSlg() {
        return Optional.ofNullable(slg);
    }

    public Optional<Double> getBabip() {
        return Optional.ofNullable(babip);
    }

    public Optional<Double> getObp() {
        return Optional.ofNullable(obp);
    }

    public Optional<Runs> getRuns() {
        return Optional.ofNullable(runs);
    }

    public Optional<Integer> getLob() {
        return Optional.ofNullable(lob);
    }
}
