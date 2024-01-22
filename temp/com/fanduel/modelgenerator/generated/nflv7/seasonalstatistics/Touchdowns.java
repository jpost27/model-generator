package com.fanduel.modelgenerator.generated.nflv7.seasonalstatistics;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Setter
@Accessors(
        chain = true
)
@JsonIgnoreProperties(
        ignoreUnknown = true
)
@EqualsAndHashCode
@ToString
@Generated("fanduel-model-generator")
public class Touchdowns {
    @JsonProperty("kick_return")
    private Integer kickReturn;

    @JsonProperty("fumble_return")
    private Integer fumbleReturn;

    @JsonProperty("total")
    private Integer total;

    @JsonProperty("other")
    private Integer other;

    @JsonProperty("punt_return")
    private Integer puntReturn;

    @JsonProperty("pass")
    private Integer pass;

    @JsonProperty("total_return")
    private Integer totalReturn;

    @JsonProperty("int_return")
    private Integer intReturn;

    @JsonProperty("rush")
    private Integer rush;

    public Optional<Integer> getKickReturn() {
        return Optional.ofNullable(kickReturn);
    }

    public Optional<Integer> getFumbleReturn() {
        return Optional.ofNullable(fumbleReturn);
    }

    public Optional<Integer> getTotal() {
        return Optional.ofNullable(total);
    }

    public Optional<Integer> getOther() {
        return Optional.ofNullable(other);
    }

    public Optional<Integer> getPuntReturn() {
        return Optional.ofNullable(puntReturn);
    }

    public Optional<Integer> getPass() {
        return Optional.ofNullable(pass);
    }

    public Optional<Integer> getTotalReturn() {
        return Optional.ofNullable(totalReturn);
    }

    public Optional<Integer> getIntReturn() {
        return Optional.ofNullable(intReturn);
    }

    public Optional<Integer> getRush() {
        return Optional.ofNullable(rush);
    }
}
