
package com.fanduel.modelgenerator.sportradar.mlb.gameextendedsummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "overall",
    "starters",
    "bullpen"
})
@Generated("jsonschema2pojo")
public class Pitching__2 {

    @JsonProperty("overall")
    public Overall__7 overall;
    @JsonProperty("starters")
    public Starters__2 starters;
    @JsonProperty("bullpen")
    public Bullpen__2 bullpen;

}
