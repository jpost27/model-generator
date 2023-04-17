package com.fanduel.modelgenerator.generated.sportradar.nfl.seasonalstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class SeasonalStatisticsResponse {
    @JsonProperty("market")
    private String market;

    @JsonProperty("players")
    private List<Player> players;

    @JsonProperty("record")
    private Record record;

    @JsonProperty("opponents")
    private Opponents opponents;

    @JsonProperty("name")
    private String name;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("season")
    private Season season;

    @JsonProperty("_comment")
    private String comment;

    @JsonProperty("id")
    private String id;

    @JsonProperty("sr_id")
    private String srId;
}
