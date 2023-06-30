package com.fanduel.modelgenerator.generated.sportradar.mlb.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonProperty("s")
    private Integer s;

    @JsonProperty("d")
    private Integer d;

    @JsonProperty("t")
    private Integer t;

    @JsonProperty("hbp")
    private Integer hbp;

    @JsonProperty("ibb")
    private Integer ibb;

    @JsonProperty("h")
    private Integer h;

    @JsonProperty("roe")
    private Integer roe;

    @JsonProperty("hr")
    private Integer hr;

    @JsonProperty("fc")
    private Integer fc;

    @JsonProperty("cycle")
    private Integer cycle;

    @JsonProperty("tb")
    private Integer tb;

    public Optional<Integer> getBb() {
        return Optional.ofNullable(bb);
    }

    public Optional<Integer> getS() {
        return Optional.ofNullable(s);
    }

    public Optional<Integer> getD() {
        return Optional.ofNullable(d);
    }

    public Optional<Integer> getT() {
        return Optional.ofNullable(t);
    }

    public Optional<Integer> getHbp() {
        return Optional.ofNullable(hbp);
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

    public Optional<Integer> getFc() {
        return Optional.ofNullable(fc);
    }

    public Optional<Integer> getCycle() {
        return Optional.ofNullable(cycle);
    }

    public Optional<Integer> getTb() {
        return Optional.ofNullable(tb);
    }
}
