
package com.fanduel.modelgenerator.sportradar.mlb.dailyschedule;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "league",
    "date",
    "games",
    "_comment"
})
@Generated("jsonschema2pojo")
public class DailyScheduleResponse {

    @JsonProperty("league")
    public League league;
    @JsonProperty("date")
    public String date;
    @JsonProperty("games")
    public List<Game> games = new ArrayList<Game>();
    @JsonProperty("_comment")
    public String comment;

}
