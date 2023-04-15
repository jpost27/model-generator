
package com.fanduel.modelgenerator.sportradar.nfl.topprospects;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "draft",
    "prospects",
    "_comment"
})
@Generated("jsonschema2pojo")
public class TopProspectsResponse {

    @JsonProperty("draft")
    public Draft draft;
    @JsonProperty("prospects")
    public List<Prospect> prospects = new ArrayList<Prospect>();
    @JsonProperty("_comment")
    public String comment;

}
