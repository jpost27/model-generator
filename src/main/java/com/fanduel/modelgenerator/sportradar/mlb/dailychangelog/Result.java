
package com.fanduel.modelgenerator.sportradar.mlb.dailychangelog;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "title",
    "season_id",
    "last_modified"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("id")
    public String id;
    @JsonProperty("title")
    public String title;
    @JsonProperty("season_id")
    public String seasonId;
    @JsonProperty("last_modified")
    public String lastModified;

}
