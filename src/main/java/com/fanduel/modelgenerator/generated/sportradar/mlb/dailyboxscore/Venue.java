package com.fanduel.modelgenerator.generated.sportradar.mlb.dailyboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Venue {
    @JsonProperty("zip")
    private String zip;

    @JsonProperty("country")
    private String country;

    @JsonProperty("address")
    private String address;

    @JsonProperty("surface")
    private String surface;

    @JsonProperty("city")
    private String city;

    @JsonProperty("time_zone")
    private String timeZone;

    @JsonProperty("capacity")
    private Integer capacity;

    @JsonProperty("market")
    private String market;

    @JsonProperty("field_orientation")
    private String fieldOrientation;

    @JsonProperty("stadium_type")
    private String stadiumType;

    @JsonProperty("name")
    private String name;

    @JsonProperty("location")
    private Location location;

    @JsonProperty("state")
    private String state;

    @JsonProperty("id")
    private String id;
}
