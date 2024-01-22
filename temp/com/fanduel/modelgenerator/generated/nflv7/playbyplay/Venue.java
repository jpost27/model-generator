package com.fanduel.modelgenerator.generated.nflv7.playbyplay;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Setter
@Accessors(
        chain = true
)
@JsonIgnoreProperties(
        ignoreUnknown = true
)
@EqualsAndHashCode
@ToString
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

    @JsonProperty("roof_type")
    private String roofType;

    @JsonProperty("name")
    private String name;

    @JsonProperty("location")
    private Location location;

    @JsonProperty("id")
    private String id;

    @JsonProperty("state")
    private String state;

    @JsonProperty("capacity")
    private Integer capacity;

    @JsonProperty("sr_id")
    private String srId;

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

    public Optional<String> getRoofType() {
        return Optional.ofNullable(roofType);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<Location> getLocation() {
        return Optional.ofNullable(location);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getState() {
        return Optional.ofNullable(state);
    }

    public Optional<Integer> getCapacity() {
        return Optional.ofNullable(capacity);
    }

    public Optional<String> getSrId() {
        return Optional.ofNullable(srId);
    }
}
