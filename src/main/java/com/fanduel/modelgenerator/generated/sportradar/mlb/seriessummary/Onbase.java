package com.fanduel.modelgenerator.generated.sportradar.mlb.seriessummary;

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
public class Onbase {
    @JsonProperty("bb")
    private Integer bb;

    @JsonProperty("d")
    private Integer d;

    @JsonProperty("ibb")
    private Integer ibb;

    @JsonProperty("h")
    private Integer h;

    @JsonProperty("roe")
    private Integer roe;

    @JsonProperty("hr")
    private Integer hr;

    @JsonProperty("cycle")
    private Integer cycle;

    @JsonProperty("tb")
    private Integer tb;

    @JsonProperty("hr9")
    private Double hr9;

    @JsonProperty("h9")
    private Double h9;

    @JsonProperty("s")
    private Integer s;

    @JsonProperty("t")
    private Integer t;

    @JsonProperty("hbp")
    private Integer hbp;

    @JsonProperty("fc")
    private Integer fc;

    public Optional<Integer> getBb() {
        return Optional.ofNullable(bb);
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

    public Optional<Integer> getRoe() {
        return Optional.ofNullable(roe);
    }

    public Optional<Integer> getHr() {
        return Optional.ofNullable(hr);
    }

    public Optional<Integer> getCycle() {
        return Optional.ofNullable(cycle);
    }

    public Optional<Integer> getTb() {
        return Optional.ofNullable(tb);
    }

    public Optional<Double> getHr9() {
        return Optional.ofNullable(hr9);
    }

    public Optional<Double> getH9() {
        return Optional.ofNullable(h9);
    }

    public Optional<Integer> getS() {
        return Optional.ofNullable(s);
    }

    public Optional<Integer> getT() {
        return Optional.ofNullable(t);
    }

    public Optional<Integer> getHbp() {
        return Optional.ofNullable(hbp);
    }

    public Optional<Integer> getFc() {
        return Optional.ofNullable(fc);
    }
}
