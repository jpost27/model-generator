package com.fanduel.modelgenerator.generated.sportradar.nba.splitsgame;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class OwnRecord {
    @JsonProperty("average")
    private Average average;

    @JsonProperty("total")
    private Total total;
}
