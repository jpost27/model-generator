package com.fanduel.modelgenerator.generated.sportradar.nhl.seriesstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class SeriesStatisticsResponse {
    @JsonProperty("market")
    private String market;

    @JsonProperty("players")
    private List<Player> players;

    @JsonProperty("own_record")
    private OwnRecord ownRecord;

    @JsonProperty("opponents")
    private Opponents opponents;

    @JsonProperty("name")
    private String name;

    @JsonProperty("season")
    private Season season;

    @JsonProperty("id")
    private String id;

    @JsonProperty("sr_id")
    private String srId;
}
