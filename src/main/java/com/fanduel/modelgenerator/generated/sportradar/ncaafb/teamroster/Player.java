package com.fanduel.modelgenerator.generated.sportradar.ncaafb.teamroster;

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

    @JsonProperty("abbr_name")
    private String abbrName;

    @JsonProperty("weight")
    private Double weight;

    @JsonProperty("eligibility")
    private String eligibility;

    @JsonProperty("name_suffix")
    private String nameSuffix;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("birth_place")
    private String birthPlace;

    @JsonProperty("jersey")
    private String jersey;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private String id;

    @JsonProperty("position")
    private String position;

    @JsonProperty("preferred_name")
    private String preferredName;

    @JsonProperty("height")
    private Integer height;

    @JsonProperty("status")
    private String status;

    public Optional<String> getLastName() {
        return Optional.ofNullable(lastName);
    }

    public Optional<String> getAbbrName() {
        return Optional.ofNullable(abbrName);
    }

    public Optional<Double> getWeight() {
        return Optional.ofNullable(weight);
    }

    public Optional<String> getEligibility() {
        return Optional.ofNullable(eligibility);
    }

    public Optional<String> getNameSuffix() {
        return Optional.ofNullable(nameSuffix);
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

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getPosition() {
        return Optional.ofNullable(position);
    }

    public Optional<String> getPreferredName() {
        return Optional.ofNullable(preferredName);
    }

    public Optional<Integer> getHeight() {
        return Optional.ofNullable(height);
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }
}
