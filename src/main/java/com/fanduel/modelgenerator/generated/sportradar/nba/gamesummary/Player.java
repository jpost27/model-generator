package com.fanduel.modelgenerator.generated.sportradar.nba.gamesummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Player {
    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("on_court")
    private Boolean onCourt;

    @JsonProperty("starter")
    private Boolean starter;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("active")
    private Boolean active;

    @JsonProperty("name_suffix")
    private String nameSuffix;

    @JsonProperty("played")
    private Boolean played;

    @JsonProperty("primary_position")
    private String primaryPosition;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("not_playing_reason")
    private String notPlayingReason;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("not_playing_description")
    private String notPlayingDescription;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("jersey_number")
    private String jerseyNumber;

    @JsonProperty("id")
    private String id;

    @JsonProperty("position")
    private String position;

    @JsonProperty("statistics")
    private Statistics statistics;
}
