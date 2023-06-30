package com.fanduel.modelgenerator.generated.sportradar.nba.splitsingame;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Split {
    @JsonProperty("average")
    private Average average;

    @JsonProperty("total")
    private Total total;

    @JsonProperty("own_record")
    private OwnRecord ownRecord;

    @JsonProperty("opponents")
    private Opponents opponents;

    @JsonProperty("category")
    private String category;

    public Optional<Average> getAverage() {
        return Optional.ofNullable(average);
    }

    public Optional<Total> getTotal() {
        return Optional.ofNullable(total);
    }

    public Optional<OwnRecord> getOwnRecord() {
        return Optional.ofNullable(ownRecord);
    }

    public Optional<Opponents> getOpponents() {
        return Optional.ofNullable(opponents);
    }

    public Optional<String> getCategory() {
        return Optional.ofNullable(category);
    }
}
