
package com.fanduel.modelgenerator.sportradar.nba.dailyschedule;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "date",
    "league",
    "games"
})
@Generated("jsonschema2pojo")
public class DailyScheduleResponse {

    @JsonProperty("date")
    public String date;
    @JsonProperty("league")
    public League league;
    @JsonProperty("games")
    public List<Game> games = new ArrayList<Game>();

}
