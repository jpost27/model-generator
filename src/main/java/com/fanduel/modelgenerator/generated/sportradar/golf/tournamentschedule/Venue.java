package com.fanduel.modelgenerator.generated.sportradar.golf.tournamentschedule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Collections;
import java.util.List;
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
    @JsonProperty("zipcode")
    private String zipcode;

    @JsonProperty("country")
    private String country;

    @JsonProperty("courses")
    private List<Course> courses;

    @JsonProperty("city")
    private String city;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private String id;

    @JsonProperty("state")
    private String state;

    public Optional<String> getZipcode() {
        return Optional.ofNullable(zipcode);
    }

    public Optional<String> getCountry() {
        return Optional.ofNullable(country);
    }

    public List<Course> getCourses() {
        return Optional.ofNullable(courses).orElse(Collections.emptyList());
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
}
