
package com.fanduel.modelgenerator.sportradar.mlb.mlbapiv7simulations;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "market",
    "abbr",
    "id",
    "runs",
    "hits",
    "errors"
})
@Generated("jsonschema2pojo")
public class Home {

    @JsonProperty("name")
    public String name;
    @JsonProperty("market")
    public String market;
    @JsonProperty("abbr")
    public String abbr;
    @JsonProperty("id")
    public String id;
    @JsonProperty("runs")
    public Integer runs;
    @JsonProperty("hits")
    public Integer hits;
    @JsonProperty("errors")
    public Integer errors;

}
