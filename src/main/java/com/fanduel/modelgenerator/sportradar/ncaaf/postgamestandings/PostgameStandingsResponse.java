
package com.fanduel.modelgenerator.sportradar.ncaaf.postgamestandings;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "season",
    "divisions",
    "_comment"
})
@Generated("jsonschema2pojo")
public class PostgameStandingsResponse {

    @JsonProperty("season")
    public Season season;
    @JsonProperty("divisions")
    public List<Division> divisions = new ArrayList<Division>();
    @JsonProperty("_comment")
    public String comment;

}
