package com.fanduel.modelgenerator.generated.sportradar.mlb.dailychangelog;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Result {
    @JsonProperty("season_id")
    private String seasonId;

    @JsonProperty("id")
    private String id;

    @JsonProperty("last_modified")
    private String lastModified;

    @JsonProperty("title")
    private String title;
}
