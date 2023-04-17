package com.fanduel.modelgenerator.generated.sportradar.nba.rankings;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Team {
    @JsonProperty("market")
    private String market;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("name")
    private String name;

    @JsonProperty("rank")
    private Rank rank;

    @JsonProperty("id")
    private String id;

    @JsonProperty("sr_id")
    private String srId;
}
