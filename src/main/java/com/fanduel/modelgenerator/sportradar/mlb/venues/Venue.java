
package com.fanduel.modelgenerator.sportradar.mlb.venues;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "capacity",
    "surface",
    "address",
    "city",
    "state",
    "zip",
    "country",
    "id",
    "field_orientation",
    "stadium_type",
    "time_zone",
    "distances",
    "location",
    "market"
})
@Generated("jsonschema2pojo")
public class Venue {

    @JsonProperty("name")
    public String name;
    @JsonProperty("capacity")
    public Integer capacity;
    @JsonProperty("surface")
    public String surface;
    @JsonProperty("address")
    public String address;
    @JsonProperty("city")
    public String city;
    @JsonProperty("state")
    public String state;
    @JsonProperty("zip")
    public String zip;
    @JsonProperty("country")
    public String country;
    @JsonProperty("id")
    public String id;
    @JsonProperty("field_orientation")
    public String fieldOrientation;
    @JsonProperty("stadium_type")
    public String stadiumType;
    @JsonProperty("time_zone")
    public String timeZone;
    @JsonProperty("distances")
    public Distances distances;
    @JsonProperty("location")
    public Location location;
    @JsonProperty("market")
    public String market;

}
