package com.fanduel.modelgenerator.generated.sportradar.nba.splitsgame;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Split {
    @JsonProperty("venue")
    private Venue venue;

    @JsonProperty("average")
    private Average average;

    @JsonProperty("total")
    private Total total;

    @JsonProperty("own_record")
    private OwnRecord ownRecord;

    @JsonProperty("opponents")
    private Opponents opponents;

    @JsonProperty("opponent")
    private Opponent opponent;

    @JsonProperty("position")
    private String position;

    @JsonProperty("category")
    private String category;
}
