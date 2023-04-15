
package com.fanduel.modelgenerator.sportradar.mlb.seasonalsplits;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "overall",
    "bullpen",
    "starters"
})
@Generated("jsonschema2pojo")
public class Pitching {

    @JsonProperty("overall")
    public List<Overall__1> overall = new ArrayList<Overall__1>();
    @JsonProperty("bullpen")
    public List<Bullpen> bullpen = new ArrayList<Bullpen>();
    @JsonProperty("starters")
    public List<Starter> starters = new ArrayList<Starter>();

}
