
package com.fanduel.modelgenerator.sportradar.nfl.seasonalstatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pass",
    "rush",
    "total_return",
    "total",
    "fumble_return",
    "int_return",
    "kick_return",
    "punt_return",
    "other"
})
@Generated("jsonschema2pojo")
public class Touchdowns {

    @JsonProperty("pass")
    public Integer pass;
    @JsonProperty("rush")
    public Integer rush;
    @JsonProperty("total_return")
    public Integer totalReturn;
    @JsonProperty("total")
    public Integer total;
    @JsonProperty("fumble_return")
    public Integer fumbleReturn;
    @JsonProperty("int_return")
    public Integer intReturn;
    @JsonProperty("kick_return")
    public Integer kickReturn;
    @JsonProperty("punt_return")
    public Integer puntReturn;
    @JsonProperty("other")
    public Integer other;

}
