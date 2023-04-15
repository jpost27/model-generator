
package com.fanduel.modelgenerator.sportradar.mlb.gameextendedsummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "seasontd",
    "overall",
    "bullpen",
    "starters"
})
@Generated("jsonschema2pojo")
public class Pitching__3 {

    @JsonProperty("seasontd")
    public Seasontd__4 seasontd;
    @JsonProperty("overall")
    public Overall__10 overall;
    @JsonProperty("bullpen")
    public Bullpen__3 bullpen;
    @JsonProperty("starters")
    public Starters__3 starters;

}
