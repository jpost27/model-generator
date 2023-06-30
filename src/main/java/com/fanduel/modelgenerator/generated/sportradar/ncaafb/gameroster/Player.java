package com.fanduel.modelgenerator.generated.sportradar.ncaafb.gameroster;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
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
public class Player {
    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("birth_place")
    private String birthPlace;

    @JsonProperty("jersey")
    private String jersey;

    @JsonProperty("abbr_name")
    private String abbrName;

    @JsonProperty("name")
    private String name;

    @JsonProperty("weight")
    private Double weight;

    @JsonProperty("eligibility")
    private String eligibility;

    @JsonProperty("id")
    private String id;

    @JsonProperty("position")
    private String position;

    @JsonProperty("height")
    private Integer height;

    @JsonProperty("status")
    private String status;

    public Optional<String> getLastName() {
        return Optional.ofNullable(lastName);
    }

    public Optional<String> getFirstName() {
        return Optional.ofNullable(firstName);
    }

    public Optional<String> getBirthPlace() {
        return Optional.ofNullable(birthPlace);
    }

    public Optional<String> getJersey() {
        return Optional.ofNullable(jersey);
    }

    public Optional<String> getAbbrName() {
        return Optional.ofNullable(abbrName);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<Double> getWeight() {
        return Optional.ofNullable(weight);
    }

    public Optional<String> getEligibility() {
        return Optional.ofNullable(eligibility);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getPosition() {
        return Optional.ofNullable(position);
    }

    public Optional<Integer> getHeight() {
        return Optional.ofNullable(height);
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }
}
