package com.fanduel.modelgenerator.generated.sportradar.nhl.seasons;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Type {
    @JsonProperty("code")
    private String code;

    @JsonProperty("name")
    private String name;
}
