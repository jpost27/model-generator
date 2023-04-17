package com.fanduel.modelgenerator.generated.sportradar.mlb.gameextendedsummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Event {
    @JsonProperty("double_plays")
    private List<DoublePlay> doublePlays;

    @JsonProperty("homeruns")
    private List<Homerun> homeruns;

    @JsonProperty("doubles")
    private List<Double> doubles;

    @JsonProperty("errors")
    private List<Error> errors;
}
