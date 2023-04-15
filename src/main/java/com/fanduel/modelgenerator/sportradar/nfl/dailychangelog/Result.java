
package com.fanduel.modelgenerator.sportradar.nfl.dailychangelog;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "season_id",
    "last_modified",
    "sr_id"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("id")
    public String id;
    @JsonProperty("season_id")
    public String seasonId;
    @JsonProperty("last_modified")
    public String lastModified;
    @JsonProperty("sr_id")
    public String srId;

}
