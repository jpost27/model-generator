package com.fanduel.modelgenerator.generated.sportradar.nhl.gamesummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Player {
    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("starter")
    private Boolean starter;

    @JsonProperty("injuries")
    private List<Object> injuries;

    @JsonProperty("handedness")
    private String handedness;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("captain")
    private String captain;

    @JsonProperty("played")
    private Boolean played;

    @JsonProperty("primary_position")
    private String primaryPosition;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("time_on_ice")
    private TimeOnIce timeOnIce;

    @JsonProperty("scratched")
    private Boolean scratched;

    @JsonProperty("jersey_number")
    private String jerseyNumber;

    @JsonProperty("goaltending")
    private Goaltending goaltending;

    @JsonProperty("id")
    private String id;

    @JsonProperty("position")
    private String position;

    @JsonProperty("statistics")
    private Statistics statistics;
}
