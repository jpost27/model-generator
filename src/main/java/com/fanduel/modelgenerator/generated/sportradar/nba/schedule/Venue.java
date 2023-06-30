package com.fanduel.modelgenerator.generated.sportradar.nba.schedule;

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

    @JsonProperty("city")
    private String city;

    @JsonProperty("name")
    private String name;

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

    public Optional<String> getCity() {
        return Optional.ofNullable(city);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
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
