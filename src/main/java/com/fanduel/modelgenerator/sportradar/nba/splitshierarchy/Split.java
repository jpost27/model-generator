
package com.fanduel.modelgenerator.sportradar.nba.splitshierarchy;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "category",
    "conference",
    "own_record",
    "opponents",
    "division"
})
@Generated("jsonschema2pojo")
public class Split {

    @JsonProperty("category")
    public String category;
    @JsonProperty("conference")
    public Conference conference;
    @JsonProperty("own_record")
    public OwnRecord ownRecord;
    @JsonProperty("opponents")
    public Opponents opponents;
    @JsonProperty("division")
    public Division division;

}
