
package com.fanduel.modelgenerator.sportradar.nfl.leaguehierarchy;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lat",
    "lng"
})
@Generated("jsonschema2pojo")
public class Location {

    @JsonProperty("lat")
    public String lat;
    @JsonProperty("lng")
    public String lng;

}
