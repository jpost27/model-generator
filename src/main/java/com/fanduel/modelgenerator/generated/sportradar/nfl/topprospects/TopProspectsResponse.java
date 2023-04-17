package com.fanduel.modelgenerator.generated.sportradar.nfl.topprospects;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class TopProspectsResponse {
    @JsonProperty("prospects")
    private List<Prospect> prospects;

    @JsonProperty("draft")
    private Draft draft;

    @JsonProperty("_comment")
    private String comment;
}
