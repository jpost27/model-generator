
package com.fanduel.modelgenerator.sportradar.nba.seriesschedule;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "title",
    "round",
    "start_date",
    "status",
    "participants",
    "games"
})
@Generated("jsonschema2pojo")
public class Series {

    @JsonProperty("id")
    public String id;
    @JsonProperty("title")
    public String title;
    @JsonProperty("round")
    public Integer round;
    @JsonProperty("start_date")
    public String startDate;
    @JsonProperty("status")
    public String status;
    @JsonProperty("participants")
    public List<Participant> participants = new ArrayList<Participant>();
    @JsonProperty("games")
    public List<Game> games = new ArrayList<Game>();

}
