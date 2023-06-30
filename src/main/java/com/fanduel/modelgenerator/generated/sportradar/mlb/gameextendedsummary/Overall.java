package com.fanduel.modelgenerator.generated.sportradar.mlb.gameextendedsummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Overall {
    @JsonProperty("gofo")
    private Double gofo;

    @JsonProperty("iso")
    private Double iso;

    @JsonProperty("ab_risp")
    private Integer abRisp;

    @JsonProperty("seca")
    private Double seca;

    @JsonProperty("bf_start")
    private Double bfStart;

    @JsonProperty("bip")
    private Integer bip;

    @JsonProperty("fpct")
    private Double fpct;

    @JsonProperty("dp")
    private Integer dp;

    @JsonProperty("whip")
    private Double whip;

    @JsonProperty("pitch_count")
    private Integer pitchCount;

    @JsonProperty("onbase")
    private Onbase onbase;

    @JsonProperty("team_lob")
    private Integer teamLob;

    @JsonProperty("games")
    private Games games;

    @JsonProperty("pitches")
    private Pitches pitches;

    @JsonProperty("in_play")
    private InPlay inPlay;

    @JsonProperty("lob_risp_2out")
    private Integer lobRisp2out;

    @JsonProperty("c_wp")
    private Integer cWp;

    @JsonProperty("bbpa")
    private Double bbpa;

    @JsonProperty("ab")
    private Integer ab;

    @JsonProperty("linedrive")
    private Integer linedrive;

    @JsonProperty("bf_ip")
    private Double bfIp;

    @JsonProperty("bbk")
    private Double bbk;

    @JsonProperty("flyball")
    private Integer flyball;

    @JsonProperty("k9")
    private Double k9;

    @JsonProperty("slg")
    private Double slg;

    @JsonProperty("ap")
    private Integer ap;

    @JsonProperty("ops")
    private Double ops;

    @JsonProperty("rbi_2out")
    private Integer rbi2out;

    @JsonProperty("rf")
    private Double rf;

    @JsonProperty("rbi")
    private Integer rbi;

    @JsonProperty("hit_risp")
    private Integer hitRisp;

    @JsonProperty("lob")
    private Integer lob;

    @JsonProperty("errors")
    private Errors errors;

    @JsonProperty("xbh")
    private Integer xbh;

    @JsonProperty("groundball")
    private Integer groundball;

    @JsonProperty("bf")
    private Integer bf;

    @JsonProperty("steal")
    private Steal steal;

    @JsonProperty("abhr")
    private Integer abhr;

    @JsonProperty("bk")
    private Integer bk;

    @JsonProperty("error")
    private Integer error;

    @JsonProperty("oab")
    private Integer oab;

    @JsonProperty("outs")
    private Outs outs;

    @JsonProperty("avg")
    private String avg;

    @JsonProperty("era")
    private Double era;

    @JsonProperty("assists")
    private Assists assists;

    @JsonProperty("inn_2")
    private Double inn2;

    @JsonProperty("wp")
    private Integer wp;

    @JsonProperty("inn_1")
    private Integer inn1;

    @JsonProperty("outcome")
    private Outcome outcome;

    @JsonProperty("a")
    private Integer a;

    @JsonProperty("gbfb")
    private Double gbfb;

    @JsonProperty("kbb")
    private Double kbb;

    @JsonProperty("ip_2")
    private Double ip2;

    @JsonProperty("ip_1")
    private Integer ip1;

    @JsonProperty("abk")
    private Double abk;

    @JsonProperty("oba")
    private Double oba;

    @JsonProperty("tc")
    private Integer tc;

    @JsonProperty("popup")
    private Integer popup;

    @JsonProperty("pb")
    private Integer pb;

    @JsonProperty("babip")
    private Double babip;

    @JsonProperty("obp")
    private Double obp;

    @JsonProperty("tp")
    private Integer tp;

    @JsonProperty("runs")
    private Runs runs;

    @JsonProperty("po")
    private Integer po;

    public Optional<Double> getGofo() {
        return Optional.ofNullable(gofo);
    }

    public Optional<Double> getIso() {
        return Optional.ofNullable(iso);
    }

    public Optional<Integer> getAbRisp() {
        return Optional.ofNullable(abRisp);
    }

    public Optional<Double> getSeca() {
        return Optional.ofNullable(seca);
    }

    public Optional<Double> getBfStart() {
        return Optional.ofNullable(bfStart);
    }

    public Optional<Integer> getBip() {
        return Optional.ofNullable(bip);
    }

    public Optional<Double> getFpct() {
        return Optional.ofNullable(fpct);
    }

    public Optional<Integer> getDp() {
        return Optional.ofNullable(dp);
    }

    public Optional<Double> getWhip() {
        return Optional.ofNullable(whip);
    }

    public Optional<Integer> getPitchCount() {
        return Optional.ofNullable(pitchCount);
    }

    public Optional<Onbase> getOnbase() {
        return Optional.ofNullable(onbase);
    }

    public Optional<Integer> getTeamLob() {
        return Optional.ofNullable(teamLob);
    }

    public Optional<Games> getGames() {
        return Optional.ofNullable(games);
    }

    public Optional<Pitches> getPitches() {
        return Optional.ofNullable(pitches);
    }

    public Optional<InPlay> getInPlay() {
        return Optional.ofNullable(inPlay);
    }

    public Optional<Integer> getLobRisp2out() {
        return Optional.ofNullable(lobRisp2out);
    }

    public Optional<Integer> getCWp() {
        return Optional.ofNullable(cWp);
    }

    public Optional<Double> getBbpa() {
        return Optional.ofNullable(bbpa);
    }

    public Optional<Integer> getAb() {
        return Optional.ofNullable(ab);
    }

    public Optional<Integer> getLinedrive() {
        return Optional.ofNullable(linedrive);
    }

    public Optional<Double> getBfIp() {
        return Optional.ofNullable(bfIp);
    }

    public Optional<Double> getBbk() {
        return Optional.ofNullable(bbk);
    }

    public Optional<Integer> getFlyball() {
        return Optional.ofNullable(flyball);
    }

    public Optional<Double> getK9() {
        return Optional.ofNullable(k9);
    }

    public Optional<Double> getSlg() {
        return Optional.ofNullable(slg);
    }

    public Optional<Integer> getAp() {
        return Optional.ofNullable(ap);
    }

    public Optional<Double> getOps() {
        return Optional.ofNullable(ops);
    }

    public Optional<Integer> getRbi2out() {
        return Optional.ofNullable(rbi2out);
    }

    public Optional<Double> getRf() {
        return Optional.ofNullable(rf);
    }

    public Optional<Integer> getRbi() {
        return Optional.ofNullable(rbi);
    }

    public Optional<Integer> getHitRisp() {
        return Optional.ofNullable(hitRisp);
    }

    public Optional<Integer> getLob() {
        return Optional.ofNullable(lob);
    }

    public Optional<Errors> getErrors() {
        return Optional.ofNullable(errors);
    }

    public Optional<Integer> getXbh() {
        return Optional.ofNullable(xbh);
    }

    public Optional<Integer> getGroundball() {
        return Optional.ofNullable(groundball);
    }

    public Optional<Integer> getBf() {
        return Optional.ofNullable(bf);
    }

    public Optional<Steal> getSteal() {
        return Optional.ofNullable(steal);
    }

    public Optional<Integer> getAbhr() {
        return Optional.ofNullable(abhr);
    }

    public Optional<Integer> getBk() {
        return Optional.ofNullable(bk);
    }

    public Optional<Integer> getError() {
        return Optional.ofNullable(error);
    }

    public Optional<Integer> getOab() {
        return Optional.ofNullable(oab);
    }

    public Optional<Outs> getOuts() {
        return Optional.ofNullable(outs);
    }

    public Optional<String> getAvg() {
        return Optional.ofNullable(avg);
    }

    public Optional<Double> getEra() {
        return Optional.ofNullable(era);
    }

    public Optional<Assists> getAssists() {
        return Optional.ofNullable(assists);
    }

    public Optional<Double> getInn2() {
        return Optional.ofNullable(inn2);
    }

    public Optional<Integer> getWp() {
        return Optional.ofNullable(wp);
    }

    public Optional<Integer> getInn1() {
        return Optional.ofNullable(inn1);
    }

    public Optional<Outcome> getOutcome() {
        return Optional.ofNullable(outcome);
    }

    public Optional<Integer> getA() {
        return Optional.ofNullable(a);
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

    public Optional<Double> getAbk() {
        return Optional.ofNullable(abk);
    }

    public Optional<Double> getOba() {
        return Optional.ofNullable(oba);
    }

    public Optional<Integer> getTc() {
        return Optional.ofNullable(tc);
    }

    public Optional<Integer> getPopup() {
        return Optional.ofNullable(popup);
    }

    public Optional<Integer> getPb() {
        return Optional.ofNullable(pb);
    }

    public Optional<Double> getBabip() {
        return Optional.ofNullable(babip);
    }

    public Optional<Double> getObp() {
        return Optional.ofNullable(obp);
    }

    public Optional<Integer> getTp() {
        return Optional.ofNullable(tp);
    }

    public Optional<Runs> getRuns() {
        return Optional.ofNullable(runs);
    }

    public Optional<Integer> getPo() {
        return Optional.ofNullable(po);
    }
}
