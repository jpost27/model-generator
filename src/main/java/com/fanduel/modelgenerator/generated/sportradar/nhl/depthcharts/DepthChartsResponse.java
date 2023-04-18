package com.fanduel.modelgenerator.generated.sportradar.nhl.depthcharts;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class DepthChartsResponse {
    @JsonProperty("market")
    private String market;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("division")
    private Division division;

    @JsonProperty("coaches")
    private List<Coach> coaches;

    @JsonProperty("venue")
    private Venue venue;

    @JsonProperty("conference")
    private Conference conference;

    @JsonProperty("league")
    private League league;

    @JsonProperty("name")
    private String name;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("positions")
    private Positions positions;

    @JsonProperty("id")
    private String id;

    @JsonProperty("sr_id")
    private String srId;
}
