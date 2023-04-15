
package com.fanduel.modelgenerator.sportradar.nba.dailychangelog;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "market",
    "last_modified",
    "sr_id"
})
@Generated("jsonschema2pojo")
public class Standing {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("market")
    public String market;
    @JsonProperty("last_modified")
    public String lastModified;
    @JsonProperty("sr_id")
    public String srId;

}
