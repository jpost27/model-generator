package com.fanduel.modelgenerator.generated.sportradar.mlb.venues;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Distances {
    @JsonProperty("mrf")
    private Integer mrf;

    @JsonProperty("mlcf")
    private Integer mlcf;

    @JsonProperty("cf")
    private Integer cf;

    @JsonProperty("rcf")
    private Integer rcf;

    @JsonProperty("rf")
    private Integer rf;

    @JsonProperty("mlf")
    private Integer mlf;

    @JsonProperty("lf")
    private Integer lf;

    @JsonProperty("mrcf")
    private Integer mrcf;

    @JsonProperty("lcf")
    private Integer lcf;
}
