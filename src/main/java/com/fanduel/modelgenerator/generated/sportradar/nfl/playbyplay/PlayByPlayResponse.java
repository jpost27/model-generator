package com.fanduel.modelgenerator.generated.sportradar.nfl.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class PlayByPlayResponse {
    @JsonProperty("summary")
    private Summary summary;

    @JsonProperty("scheduled")
    private String scheduled;

    @JsonProperty("weather")
    private Weather weather;

    @JsonProperty("periods")
    private List<Period> periods;

    @JsonProperty("_comment")
    private String comment;

    @JsonProperty("id")
    private String id;

    @JsonProperty("clock")
    private String clock;

    @JsonProperty("attendance")
    private Integer attendance;

    @JsonProperty("status")
    private String status;

    @JsonProperty("entry_mode")
    private String entryMode;

    @JsonProperty("quarter")
    private Integer quarter;

    @JsonProperty("sr_id")
    private String srId;
}
