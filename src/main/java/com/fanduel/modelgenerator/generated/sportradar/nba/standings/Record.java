package com.fanduel.modelgenerator.generated.sportradar.nba.standings;

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
public class Record {
    @JsonProperty("wins")
    private Integer wins;

    @JsonProperty("record_type")
    private String recordType;

    @JsonProperty("losses")
    private Integer losses;

    @JsonProperty("win_pct")
    private Double winPct;

    public Optional<Integer> getWins() {
        return Optional.ofNullable(wins);
    }

    public Optional<String> getRecordType() {
        return Optional.ofNullable(recordType);
    }

    public Optional<Integer> getLosses() {
        return Optional.ofNullable(losses);
    }

    public Optional<Double> getWinPct() {
        return Optional.ofNullable(winPct);
    }
}
