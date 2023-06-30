package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalsplits;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
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
public class Month {
    @JsonProperty("play")
    private Integer play;

    @JsonProperty("bb")
    private Integer bb;

    @JsonProperty("save")
    private Integer save;

    @JsonProperty("team_win")
    private Integer teamWin;

    @JsonProperty("hr")
    private Integer hr;

    @JsonProperty("sb")
    private Integer sb;

    @JsonProperty("loss")
    private Integer loss;

    @JsonProperty("avg")
    private String avg;

    @JsonProperty("ktotal")
    private Integer ktotal;

    @JsonProperty("era")
    private Double era;

    @JsonProperty("value")
    private String value;

    @JsonProperty("win")
    private Integer win;

    @JsonProperty("ab")
    private Integer ab;

    @JsonProperty("d")
    private Integer d;

    @JsonProperty("start")
    private Integer start;

    @JsonProperty("h")
    private Integer h;

    @JsonProperty("ibb")
    private Integer ibb;

    @JsonProperty("team_loss")
    private Integer teamLoss;

    @JsonProperty("ip_2")
    private Double ip2;

    @JsonProperty("ip_1")
    private Integer ip1;

    @JsonProperty("svo")
    private Integer svo;

    @JsonProperty("er")
    private Integer er;

    @JsonProperty("oba")
    private Double oba;

    @JsonProperty("slg")
    private Double slg;

    @JsonProperty("cs")
    private Integer cs;

    @JsonProperty("s")
    private Integer s;

    @JsonProperty("ops")
    private Double ops;

    @JsonProperty("t")
    private Integer t;

    @JsonProperty("hbp")
    private Integer hbp;

    @JsonProperty("rbi")
    private Integer rbi;

    @JsonProperty("complete")
    private Integer complete;

    @JsonProperty("obp")
    private Double obp;

    @JsonProperty("runs")
    private Integer runs;

    public Optional<Integer> getPlay() {
        return Optional.ofNullable(play);
    }

    public Optional<Integer> getBb() {
        return Optional.ofNullable(bb);
    }

    public Optional<Integer> getSave() {
        return Optional.ofNullable(save);
    }

    public Optional<Integer> getTeamWin() {
        return Optional.ofNullable(teamWin);
    }

    public Optional<Integer> getHr() {
        return Optional.ofNullable(hr);
    }

    public Optional<Integer> getSb() {
        return Optional.ofNullable(sb);
    }

    public Optional<Integer> getLoss() {
        return Optional.ofNullable(loss);
    }

    public Optional<String> getAvg() {
        return Optional.ofNullable(avg);
    }

    public Optional<Integer> getKtotal() {
        return Optional.ofNullable(ktotal);
    }

    public Optional<Double> getEra() {
        return Optional.ofNullable(era);
    }

    public Optional<String> getValue() {
        return Optional.ofNullable(value);
    }

    public Optional<Integer> getWin() {
        return Optional.ofNullable(win);
    }

    public Optional<Integer> getAb() {
        return Optional.ofNullable(ab);
    }

    public Optional<Integer> getD() {
        return Optional.ofNullable(d);
    }

    public Optional<Integer> getStart() {
        return Optional.ofNullable(start);
    }

    public Optional<Integer> getH() {
        return Optional.ofNullable(h);
    }

    public Optional<Integer> getIbb() {
        return Optional.ofNullable(ibb);
    }

    public Optional<Integer> getTeamLoss() {
        return Optional.ofNullable(teamLoss);
    }

    public Optional<Double> getIp2() {
        return Optional.ofNullable(ip2);
    }

    public Optional<Integer> getIp1() {
        return Optional.ofNullable(ip1);
    }

    public Optional<Integer> getSvo() {
        return Optional.ofNullable(svo);
    }

    public Optional<Integer> getEr() {
        return Optional.ofNullable(er);
    }

    public Optional<Double> getOba() {
        return Optional.ofNullable(oba);
    }

    public Optional<Double> getSlg() {
        return Optional.ofNullable(slg);
    }

    public Optional<Integer> getCs() {
        return Optional.ofNullable(cs);
    }

    public Optional<Integer> getS() {
        return Optional.ofNullable(s);
    }

    public Optional<Double> getOps() {
        return Optional.ofNullable(ops);
    }

    public Optional<Integer> getT() {
        return Optional.ofNullable(t);
    }

    public Optional<Integer> getHbp() {
        return Optional.ofNullable(hbp);
    }

    public Optional<Integer> getRbi() {
        return Optional.ofNullable(rbi);
    }

    public Optional<Integer> getComplete() {
        return Optional.ofNullable(complete);
    }

    public Optional<Double> getObp() {
        return Optional.ofNullable(obp);
    }

    public Optional<Integer> getRuns() {
        return Optional.ofNullable(runs);
    }
}
