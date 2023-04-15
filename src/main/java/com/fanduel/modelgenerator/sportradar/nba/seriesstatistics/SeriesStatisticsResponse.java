
package com.fanduel.modelgenerator.sportradar.nba.seriesstatistics;

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
    "status",
    "season",
    "team",
    "own_record",
    "opponents",
    "players"
})
@Generated("jsonschema2pojo")
public class SeriesStatisticsResponse {

    @JsonProperty("id")
    public String id;
    @JsonProperty("title")
    public String title;
    @JsonProperty("status")
    public String status;
    @JsonProperty("season")
    public Season season;
    @JsonProperty("team")
    public Team team;
    @JsonProperty("own_record")
    public OwnRecord ownRecord;
    @JsonProperty("opponents")
    public Opponents opponents;
    @JsonProperty("players")
    public List<Player> players = new ArrayList<Player>();

}
