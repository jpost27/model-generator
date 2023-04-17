package com.fanduel.modelgenerator.generated.sportradar.mlb.injuries;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Injury {
    @JsonProperty("update_date")
    private String updateDate;

    @JsonProperty("comment")
    private String comment;

    @JsonProperty("id")
    private String id;

    @JsonProperty("start_date")
    private String startDate;

    @JsonProperty("desc")
    private String desc;

    @JsonProperty("status")
    private String status;
}
