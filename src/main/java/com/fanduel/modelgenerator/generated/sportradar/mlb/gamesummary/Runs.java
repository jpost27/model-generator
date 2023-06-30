package com.fanduel.modelgenerator.generated.sportradar.mlb.gamesummary;

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
public class Runs {
    @JsonProperty("bqra")
    private Integer bqra;

    @JsonProperty("total")
    private Integer total;

    @JsonProperty("earned")
    private Integer earned;

    @JsonProperty("bqr")
    private Integer bqr;

    @JsonProperty("ir")
    private Integer ir;

    @JsonProperty("ira")
    private Integer ira;

    @JsonProperty("unearned")
    private Integer unearned;

    public Optional<Integer> getBqra() {
        return Optional.ofNullable(bqra);
    }

    public Optional<Integer> getTotal() {
        return Optional.ofNullable(total);
    }

    public Optional<Integer> getEarned() {
        return Optional.ofNullable(earned);
    }

    public Optional<Integer> getBqr() {
        return Optional.ofNullable(bqr);
    }

    public Optional<Integer> getIr() {
        return Optional.ofNullable(ir);
    }

    public Optional<Integer> getIra() {
        return Optional.ofNullable(ira);
    }

    public Optional<Integer> getUnearned() {
        return Optional.ofNullable(unearned);
    }
}
