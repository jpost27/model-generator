
package com.fanduel.modelgenerator.sportradar.nba.dailytransfers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "league",
    "start_time",
    "end_time",
    "players"
})
@Generated("jsonschema2pojo")
public class DailyTransfersResponse {

    @JsonProperty("league")
    public League league;
    @JsonProperty("start_time")
    public String startTime;
    @JsonProperty("end_time")
    public String endTime;
    @JsonProperty("players")
    public List<Player> players = new ArrayList<Player>();

}
