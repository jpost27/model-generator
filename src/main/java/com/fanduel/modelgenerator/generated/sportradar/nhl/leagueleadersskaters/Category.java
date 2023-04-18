package com.fanduel.modelgenerator.generated.sportradar.nhl.leagueleadersskaters;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Category {
    @JsonProperty("ranks")
    private List<Rank> ranks;

    @JsonProperty("name")
    private String name;

    @JsonProperty("type")
    private String type;
}
