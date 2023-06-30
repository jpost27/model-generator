package com.fanduel.modelgenerator.generated.sportradar.mlb.gameextendedsummary;

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
public class Pitches {
    @JsonProperty("btotal")
    private Integer btotal;

    @JsonProperty("ktotal")
    private Integer ktotal;

    @JsonProperty("count")
    private Integer count;

    @JsonProperty("per_bf")
    private Double perBf;

    @JsonProperty("per_start")
    private Double perStart;

    @JsonProperty("per_ip")
    private Double perIp;

    public Optional<Integer> getBtotal() {
        return Optional.ofNullable(btotal);
    }

    public Optional<Integer> getKtotal() {
        return Optional.ofNullable(ktotal);
    }

    public Optional<Integer> getCount() {
        return Optional.ofNullable(count);
    }

    public Optional<Double> getPerBf() {
        return Optional.ofNullable(perBf);
    }

    public Optional<Double> getPerStart() {
        return Optional.ofNullable(perStart);
    }

    public Optional<Double> getPerIp() {
        return Optional.ofNullable(perIp);
    }
}
