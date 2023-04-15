
package com.fanduel.modelgenerator.sportradar.mlb.dailysummary;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "win",
    "loss",
    "save",
    "hold",
    "blown_save"
})
@Generated("jsonschema2pojo")
public class Pitching__4 {

    @JsonProperty("win")
    public Win win;
    @JsonProperty("loss")
    public Loss loss;
    @JsonProperty("save")
    public Save save;
    @JsonProperty("hold")
    public List<Hold> hold = new ArrayList<Hold>();
    @JsonProperty("blown_save")
    public List<BlownSave> blownSave = new ArrayList<BlownSave>();

}
