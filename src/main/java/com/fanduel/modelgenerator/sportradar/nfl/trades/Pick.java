
package com.fanduel.modelgenerator.sportradar.nfl.trades;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "number",
    "overall",
    "supplemental",
    "round"
})
@Generated("jsonschema2pojo")
public class Pick {

    @JsonProperty("id")
    public String id;
    @JsonProperty("number")
    public Integer number;
    @JsonProperty("overall")
    public Integer overall;
    @JsonProperty("supplemental")
    public Boolean supplemental;
    @JsonProperty("round")
    public Round round;

}
