
package com.fanduel.modelgenerator.sportradar.mlb.seriessummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "overall"
})
@Generated("jsonschema2pojo")
public class Hitting__1 {

    @JsonProperty("overall")
    public Overall__3 overall;

}
