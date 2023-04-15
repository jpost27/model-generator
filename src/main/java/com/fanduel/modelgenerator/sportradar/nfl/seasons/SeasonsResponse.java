
package com.fanduel.modelgenerator.sportradar.nfl.seasons;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "league",
    "seasons"
})
@Generated("jsonschema2pojo")
public class SeasonsResponse {

    @JsonProperty("league")
    public League league;
    @JsonProperty("seasons")
    public List<Season> seasons = new ArrayList<Season>();

}
