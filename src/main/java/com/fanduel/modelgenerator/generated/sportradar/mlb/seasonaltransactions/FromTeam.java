package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonaltransactions;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class FromTeam {
    @JsonProperty("market")
    private String market;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private String id;

    @JsonProperty("abbr")
    private String abbr;
}