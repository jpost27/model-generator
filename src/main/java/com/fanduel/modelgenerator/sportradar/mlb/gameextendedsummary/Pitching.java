
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
public class Pitching {

    @JsonProperty("overall")
    public Overall__1 overall;
    @JsonProperty("starters")
    public Starters starters;
    @JsonProperty("bullpen")
    public Bullpen bullpen;

}
