package com.fanduel.modelgenerator.generated.sportradar.nhl.seriesfaceoffs;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class SeriesFaceoffsResponse {
    @JsonProperty("players")
    private List<Player> players;

    @JsonProperty("own_record")
    private OwnRecord ownRecord;

    @JsonProperty("opponents")
    private Opponents opponents;

    @JsonProperty("season")
    private Season season;

    @JsonProperty("id")
    private String id;

    @JsonProperty("team")
    private Team team;

    @JsonProperty("title")
    private String title;

    @JsonProperty("status")
    private String status;
}
