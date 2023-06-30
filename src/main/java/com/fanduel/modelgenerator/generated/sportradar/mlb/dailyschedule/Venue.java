package com.fanduel.modelgenerator.generated.sportradar.mlb.dailyschedule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
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

    public Optional<String> getZip() {
        return Optional.ofNullable(zip);
    }

    public Optional<String> getCountry() {
        return Optional.ofNullable(country);
    }

    public Optional<String> getAddress() {
        return Optional.ofNullable(address);
    }

    public Optional<String> getSurface() {
        return Optional.ofNullable(surface);
    }

    public Optional<String> getCity() {
        return Optional.ofNullable(city);
    }

    public Optional<Integer> getCapacity() {
        return Optional.ofNullable(capacity);
    }

    public Optional<String> getMarket() {
        return Optional.ofNullable(market);
    }

    public Optional<String> getFieldOrientation() {
        return Optional.ofNullable(fieldOrientation);
    }

    public Optional<String> getStadiumType() {
        return Optional.ofNullable(stadiumType);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<Location> getLocation() {
        return Optional.ofNullable(location);
    }

    public Optional<String> getState() {
        return Optional.ofNullable(state);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }
}
