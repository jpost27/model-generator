
package com.fanduel.modelgenerator.sportradar.mlb.gamesummary;

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
public class Fielding__3 {

    @JsonProperty("overall")
    public Overall__10 overall;
    @JsonProperty("positions")
    public List<Position__1> positions = new ArrayList<Position__1>();

}
