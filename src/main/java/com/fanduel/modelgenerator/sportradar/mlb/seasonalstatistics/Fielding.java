
package com.fanduel.modelgenerator.sportradar.mlb.seasonalstatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "overall"
})
@Generated("jsonschema2pojo")
public class Fielding {

    @JsonProperty("overall")
    public Overall__2 overall;

}
