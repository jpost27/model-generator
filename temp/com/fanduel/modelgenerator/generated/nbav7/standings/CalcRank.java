package com.fanduel.modelgenerator.generated.nbav7.standings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
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
public class CalcRank {
    @JsonProperty("conf_rank")
    private Integer confRank;

    @JsonProperty("div_tiebreak")
    private String divTiebreak;

    @JsonProperty("conf_tiebreak")
    private String confTiebreak;

    @JsonProperty("div_rank")
    private Integer divRank;

    public Optional<Integer> getConfRank() {
        return Optional.ofNullable(confRank);
    }

    public Optional<String> getDivTiebreak() {
        return Optional.ofNullable(divTiebreak);
    }

    public Optional<String> getConfTiebreak() {
        return Optional.ofNullable(confTiebreak);
    }

    public Optional<Integer> getDivRank() {
        return Optional.ofNullable(divRank);
    }
}
