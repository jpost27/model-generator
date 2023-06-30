package com.fanduel.modelgenerator.generated.sportradar.mlb.gameextendedsummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Event {
    @JsonProperty("double_plays")
    private List<DoublePlay> doublePlays;

    @JsonProperty("homeruns")
    private List<Homerun> homeruns;

    @JsonProperty("doubles")
    private List<Double> doubles;

    @JsonProperty("errors")
    private List<Error> errors;

    public List<DoublePlay> getDoublePlays() {
        return Optional.ofNullable(doublePlays).orElse(Collections.emptyList());
    }

    public List<Homerun> getHomeruns() {
        return Optional.ofNullable(homeruns).orElse(Collections.emptyList());
    }

    public List<Double> getDoubles() {
        return Optional.ofNullable(doubles).orElse(Collections.emptyList());
    }

    public List<Error> getErrors() {
        return Optional.ofNullable(errors).orElse(Collections.emptyList());
    }
}
