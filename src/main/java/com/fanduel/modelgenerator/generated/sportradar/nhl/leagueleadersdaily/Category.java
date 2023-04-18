package com.fanduel.modelgenerator.generated.sportradar.nhl.leagueleadersdaily;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Category {
    @JsonProperty("leaders")
    private List<Leader> leaders;

    @JsonProperty("category")
    private String category;
}
