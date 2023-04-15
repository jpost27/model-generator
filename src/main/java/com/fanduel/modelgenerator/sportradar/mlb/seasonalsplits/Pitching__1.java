
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
public class Pitching__1 {

    @JsonProperty("overall")
    public List<Overall__3> overall = new ArrayList<Overall__3>();
    @JsonProperty("bullpen")
    public List<Bullpen__1> bullpen = new ArrayList<Bullpen__1>();
    @JsonProperty("starters")
    public List<Starter__1> starters = new ArrayList<Starter__1>();

}
