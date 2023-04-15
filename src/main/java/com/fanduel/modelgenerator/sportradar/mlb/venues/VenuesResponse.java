
package com.fanduel.modelgenerator.sportradar.mlb.venues;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "venues",
    "_comment"
})
@Generated("jsonschema2pojo")
public class VenuesResponse {

    @JsonProperty("venues")
    public List<Venue> venues = new ArrayList<Venue>();
    @JsonProperty("_comment")
    public String comment;

}
