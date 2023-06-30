package com.fanduel.modelgenerator.generated.sportradar.mlb.venues;

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
public class Distances {
    @JsonProperty("mrf")
    private Integer mrf;

    @JsonProperty("mlcf")
    private Integer mlcf;

    @JsonProperty("cf")
    private Integer cf;

    @JsonProperty("rcf")
    private Integer rcf;

    @JsonProperty("rf")
    private Integer rf;

    @JsonProperty("mlf")
    private Integer mlf;

    @JsonProperty("lf")
    private Integer lf;

    @JsonProperty("mrcf")
    private Integer mrcf;

    @JsonProperty("lcf")
    private Integer lcf;

    public Optional<Integer> getMrf() {
        return Optional.ofNullable(mrf);
    }

    public Optional<Integer> getMlcf() {
        return Optional.ofNullable(mlcf);
    }

    public Optional<Integer> getCf() {
        return Optional.ofNullable(cf);
    }

    public Optional<Integer> getRcf() {
        return Optional.ofNullable(rcf);
    }

    public Optional<Integer> getRf() {
        return Optional.ofNullable(rf);
    }

    public Optional<Integer> getMlf() {
        return Optional.ofNullable(mlf);
    }

    public Optional<Integer> getLf() {
        return Optional.ofNullable(lf);
    }

    public Optional<Integer> getMrcf() {
        return Optional.ofNullable(mrcf);
    }

    public Optional<Integer> getLcf() {
        return Optional.ofNullable(lcf);
    }
}
