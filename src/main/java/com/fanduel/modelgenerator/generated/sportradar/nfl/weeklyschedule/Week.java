package com.fanduel.modelgenerator.generated.sportradar.nfl.weeklyschedule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Week {
    @JsonProperty("sequence")
    private Integer sequence;

    @JsonProperty("games")
    private List<Game> games;

    @JsonProperty("id")
    private String id;

    @JsonProperty("title")
    private String title;
}
