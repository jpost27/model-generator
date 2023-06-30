package com.fanduel.modelgenerator.generated.sportradar.mlb.playerprofile;

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
public class PitcherHand {
    @JsonProperty("bb")
    private Integer bb;

    @JsonProperty("ab")
    private Integer ab;

    @JsonProperty("d")
    private Integer d;

    @JsonProperty("ibb")
    private Integer ibb;

    @JsonProperty("h")
    private Integer h;

    @JsonProperty("hr")
    private Integer hr;

    @JsonProperty("sb")
    private Integer sb;

    @JsonProperty("slg")
    private Double slg;

    @JsonProperty("cs")
    private Integer cs;

    @JsonProperty("s")
    private Integer s;

    @JsonProperty("ops")
    private Double ops;

    @JsonProperty("avg")
    private String avg;

    @JsonProperty("t")
    private Integer t;

    @JsonProperty("ktotal")
    private Integer ktotal;

    @JsonProperty("hbp")
    private Integer hbp;

    @JsonProperty("rbi")
    private Integer rbi;

    @JsonProperty("obp")
    private Double obp;

    @JsonProperty("value")
    private String value;

    @JsonProperty("runs")
    private Integer runs;

    public Optional<Integer> getBb() {
        return Optional.ofNullable(bb);
    }

    public Optional<Integer> getAb() {
        return Optional.ofNullable(ab);
    }

    public Optional<Integer> getD() {
        return Optional.ofNullable(d);
    }

    public Optional<Integer> getIbb() {
        return Optional.ofNullable(ibb);
    }

    public Optional<Integer> getH() {
        return Optional.ofNullable(h);
    }

    public Optional<Integer> getHr() {
        return Optional.ofNullable(hr);
    }

    public Optional<Integer> getSb() {
        return Optional.ofNullable(sb);
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

    public Optional<String> getAvg() {
        return Optional.ofNullable(avg);
    }

    public Optional<Integer> getT() {
        return Optional.ofNullable(t);
    }

    public Optional<Integer> getKtotal() {
        return Optional.ofNullable(ktotal);
    }

    public Optional<Integer> getHbp() {
        return Optional.ofNullable(hbp);
    }

    public Optional<Integer> getRbi() {
        return Optional.ofNullable(rbi);
    }

    public Optional<Double> getObp() {
        return Optional.ofNullable(obp);
    }

    public Optional<String> getValue() {
        return Optional.ofNullable(value);
    }

    public Optional<Integer> getRuns() {
        return Optional.ofNullable(runs);
    }
}
