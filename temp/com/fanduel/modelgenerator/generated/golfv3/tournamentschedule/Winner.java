package com.fanduel.modelgenerator.generated.golfv3.tournamentschedule;

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
public class Winner {
    @JsonProperty("birthday")
    private String birthday;

    @JsonProperty("college")
    private String college;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("country")
    private String country;

    @JsonProperty("handedness")
    private String handedness;

    @JsonProperty("abbr_name")
    private String abbrName;

    @JsonProperty("weight")
    private Integer weight;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("birth_place")
    private String birthPlace;

    @JsonProperty("turned_pro")
    private Integer turnedPro;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private String id;

    @JsonProperty("residence")
    private String residence;

    @JsonProperty("height")
    private Integer height;

    public Optional<String> getBirthday() {
        return Optional.ofNullable(birthday);
    }

    public Optional<String> getCollege() {
        return Optional.ofNullable(college);
    }

    public Optional<String> getLastName() {
        return Optional.ofNullable(lastName);
    }

    public Optional<String> getCountry() {
        return Optional.ofNullable(country);
    }

    public Optional<String> getHandedness() {
        return Optional.ofNullable(handedness);
    }

    public Optional<String> getAbbrName() {
        return Optional.ofNullable(abbrName);
    }

    public Optional<Integer> getWeight() {
        return Optional.ofNullable(weight);
    }

    public Optional<String> getFirstName() {
        return Optional.ofNullable(firstName);
    }

    public Optional<String> getBirthPlace() {
        return Optional.ofNullable(birthPlace);
    }

    public Optional<Integer> getTurnedPro() {
        return Optional.ofNullable(turnedPro);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getResidence() {
        return Optional.ofNullable(residence);
    }

    public Optional<Integer> getHeight() {
        return Optional.ofNullable(height);
    }
}
