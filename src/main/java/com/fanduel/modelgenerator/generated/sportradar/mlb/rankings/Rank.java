package com.fanduel.modelgenerator.generated.sportradar.mlb.rankings;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Rank {
    @JsonProperty("division")
    private Integer division;

    @JsonProperty("league")
    private Integer league;

    @JsonProperty("clinched")
    private String clinched;
}
