package com.fanduel.modelgenerator.generated.sportradar.mlb.rankings;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Season {
    @JsonProperty("year")
    private Integer year;

    @JsonProperty("leagues")
    private List<League> leagues;

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type;
}
