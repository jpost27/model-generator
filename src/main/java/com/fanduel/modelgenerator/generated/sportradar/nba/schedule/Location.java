package com.fanduel.modelgenerator.generated.sportradar.nba.schedule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Location {
    @JsonProperty("lng")
    private String lng;

    @JsonProperty("lat")
    private String lat;
}
