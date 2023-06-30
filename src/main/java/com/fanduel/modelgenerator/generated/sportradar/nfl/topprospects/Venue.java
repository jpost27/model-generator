package com.fanduel.modelgenerator.generated.sportradar.nfl.topprospects;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("country")
    private String country;

    @JsonProperty("address")
    private String address;

    @JsonProperty("city")
    private String city;

    @JsonProperty("name")
    private String name;

    @JsonProperty("state")
    private String state;

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

    public Optional<String> getState() {
        return Optional.ofNullable(state);
    }
}
