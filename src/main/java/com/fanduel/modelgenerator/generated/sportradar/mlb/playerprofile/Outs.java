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
public class Outs {
    @JsonProperty("fidp")
    private Integer fidp;

    @JsonProperty("kswing")
    private Integer kswing;

    @JsonProperty("lo")
    private Integer lo;

    @JsonProperty("ktotal")
    private Integer ktotal;

    @JsonProperty("go")
    private Integer go;

    @JsonProperty("fo")
    private Integer fo;

    @JsonProperty("lidp")
    private Integer lidp;

    @JsonProperty("klook")
    private Integer klook;

    @JsonProperty("sacfly")
    private Integer sacfly;

    @JsonProperty("sachit")
    private Integer sachit;

    @JsonProperty("gidp")
    private Integer gidp;

    @JsonProperty("po")
    private Integer po;

    public Optional<Integer> getFidp() {
        return Optional.ofNullable(fidp);
    }

    public Optional<Integer> getKswing() {
        return Optional.ofNullable(kswing);
    }

    public Optional<Integer> getLo() {
        return Optional.ofNullable(lo);
    }

    public Optional<Integer> getKtotal() {
        return Optional.ofNullable(ktotal);
    }

    public Optional<Integer> getGo() {
        return Optional.ofNullable(go);
    }

    public Optional<Integer> getFo() {
        return Optional.ofNullable(fo);
    }

    public Optional<Integer> getLidp() {
        return Optional.ofNullable(lidp);
    }

    public Optional<Integer> getKlook() {
        return Optional.ofNullable(klook);
    }

    public Optional<Integer> getSacfly() {
        return Optional.ofNullable(sacfly);
    }

    public Optional<Integer> getSachit() {
        return Optional.ofNullable(sachit);
    }

    public Optional<Integer> getGidp() {
        return Optional.ofNullable(gidp);
    }

    public Optional<Integer> getPo() {
        return Optional.ofNullable(po);
    }
}
