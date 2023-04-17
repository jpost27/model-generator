package com.fanduel.modelgenerator.generated.sportradar.nfl.postgamestandings;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Streak {
    @JsonProperty("length")
    private Integer length;

    @JsonProperty("type")
    private String type;

    @JsonProperty("desc")
    private String desc;
}
