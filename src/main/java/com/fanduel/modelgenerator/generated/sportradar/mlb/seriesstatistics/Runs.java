package com.fanduel.modelgenerator.generated.sportradar.mlb.seriesstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Runs {
    @JsonProperty("bqra")
    private Integer bqra;

    @JsonProperty("total")
    private Integer total;

    @JsonProperty("earned")
    private Integer earned;

    @JsonProperty("bqr")
    private Integer bqr;

    @JsonProperty("ir")
    private Integer ir;

    @JsonProperty("ira")
    private Integer ira;

    @JsonProperty("unearned")
    private Integer unearned;
}
