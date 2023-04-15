
package com.fanduel.modelgenerator.sportradar.mlb.seriesstatistics;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "overall",
    "positions"
})
@Generated("jsonschema2pojo")
public class Fielding__1 {

    @JsonProperty("overall")
    public Overall__4 overall;
    @JsonProperty("positions")
    public List<Position> positions = new ArrayList<Position>();

}
