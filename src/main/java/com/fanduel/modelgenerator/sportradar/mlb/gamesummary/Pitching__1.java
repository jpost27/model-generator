
package com.fanduel.modelgenerator.sportradar.mlb.gamesummary;

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
    public Overall__3 overall;
    @JsonProperty("bullpen")
    public Bullpen__1 bullpen;
    @JsonProperty("starters")
    public Starters__1 starters;

}
