
package com.fanduel.modelgenerator.sportradar.mlb.venues;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lf",
    "lcf",
    "cf",
    "rcf",
    "rf",
    "mlf",
    "mlcf",
    "mrcf",
    "mrf"
})
@Generated("jsonschema2pojo")
public class Distances {

    @JsonProperty("lf")
    public Integer lf;
    @JsonProperty("lcf")
    public Integer lcf;
    @JsonProperty("cf")
    public Integer cf;
    @JsonProperty("rcf")
    public Integer rcf;
    @JsonProperty("rf")
    public Integer rf;
    @JsonProperty("mlf")
    public Integer mlf;
    @JsonProperty("mlcf")
    public Integer mlcf;
    @JsonProperty("mrcf")
    public Integer mrcf;
    @JsonProperty("mrf")
    public Integer mrf;

}
