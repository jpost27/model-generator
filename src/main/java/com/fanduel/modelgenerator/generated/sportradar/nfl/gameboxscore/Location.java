package com.fanduel.modelgenerator.generated.sportradar.nfl.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Location {
    @JsonProperty("market")
    private String market;

    @JsonProperty("lng")
    private String lng;

    @JsonProperty("name")
    private String name;

    @JsonProperty("yardline")
    private Integer yardline;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("id")
    private String id;

    @JsonProperty("lat")
    private String lat;

    @JsonProperty("sr_id")
    private String srId;
}
