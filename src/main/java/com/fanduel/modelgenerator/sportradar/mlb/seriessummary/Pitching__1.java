
package com.fanduel.modelgenerator.sportradar.mlb.seriessummary;

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
public class Pitching__1 {

    @JsonProperty("overall")
    public Overall__5 overall;
    @JsonProperty("starters")
    public Starters__1 starters;
    @JsonProperty("bullpen")
    public Bullpen__1 bullpen;

}
