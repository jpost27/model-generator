package com.fanduel.modelgenerator.generated.sportradar.nhl.dailychangelog;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Schedule {
    @JsonProperty("season_id")
    private String seasonId;

    @JsonProperty("id")
    private String id;

    @JsonProperty("last_modified")
    private String lastModified;
}