package com.fanduel.modelgenerator.generated.sportradar.nhl.gametimeonice;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Strength {
    @JsonProperty("total")
    private String total;

    @JsonProperty("type")
    private String type;
}
