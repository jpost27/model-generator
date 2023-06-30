package com.fanduel.modelgenerator.generated.sportradar.nba.standings;

import com.fasterxml.jackson.annotation.JsonProperty;
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
