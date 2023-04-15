
package com.fanduel.modelgenerator.sportradar.mlb.gameextendedsummary;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "errors",
    "homeruns",
    "double_plays",
    "doubles"
})
@Generated("jsonschema2pojo")
public class Event {

    @JsonProperty("errors")
    public List<Error> errors = new ArrayList<Error>();
    @JsonProperty("homeruns")
    public List<Homerun> homeruns = new ArrayList<Homerun>();
    @JsonProperty("double_plays")
    public List<DoublePlay> doublePlays = new ArrayList<DoublePlay>();
    @JsonProperty("doubles")
    public List<Double> doubles = new ArrayList<Double>();

}
