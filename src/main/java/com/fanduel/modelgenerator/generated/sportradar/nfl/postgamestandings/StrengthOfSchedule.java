package com.fanduel.modelgenerator.generated.sportradar.nfl.postgamestandings;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class StrengthOfSchedule {
    @JsonProperty("wins")
    private Integer wins;

    @JsonProperty("total")
    private Integer total;

    @JsonProperty("sos")
    private Double sos;
}
