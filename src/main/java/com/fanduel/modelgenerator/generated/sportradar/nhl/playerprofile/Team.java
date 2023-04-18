package com.fanduel.modelgenerator.generated.sportradar.nhl.playerprofile;

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

    @JsonProperty("time_on_ice")
    private TimeOnIce timeOnIce;

    @JsonProperty("name")
    private String name;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("id")
    private String id;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("statistics")
    private Statistics statistics;
}
