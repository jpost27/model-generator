
package com.fanduel.modelgenerator.sportradar.mlb.gameextendedsummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "seasontd",
    "overall"
})
@Generated("jsonschema2pojo")
public class Hitting__3 {

    @JsonProperty("seasontd")
    public Seasontd__3 seasontd;
    @JsonProperty("overall")
    public Overall__9 overall;

}
