package com.fanduel.modelgenerator.generated.sportradar.nfl.gamestatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Efficiency {
    @JsonProperty("fourthdown")
    private Fourthdown fourthdown;

    @JsonProperty("redzone")
    private Redzone redzone;

    @JsonProperty("thirddown")
    private Thirddown thirddown;

    @JsonProperty("goaltogo")
    private Goaltogo goaltogo;
}
