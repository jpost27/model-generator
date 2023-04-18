package com.fanduel.modelgenerator.generated.sportradar.nhl.seriesfaceoffs;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class OwnRecord {
    @JsonProperty("faceoffs")
    private Faceoffs faceoffs;
}
