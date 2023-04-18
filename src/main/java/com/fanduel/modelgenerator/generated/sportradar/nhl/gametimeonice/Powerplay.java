package com.fanduel.modelgenerator.generated.sportradar.nhl.gametimeonice;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Powerplay {
    @JsonProperty("total")
    private String total;

    @JsonProperty("strength")
    private List<Strength> strength;
}
