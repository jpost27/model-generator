package com.fanduel.modelgenerator.generated.nflv7.teamroster;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
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
public class Player {
    @JsonProperty("college")
    private String college;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("abbr_name")
    private String abbrName;

    @JsonProperty("weight")
    private Double weight;

    @JsonProperty("name_suffix")
    private String nameSuffix;

    @JsonProperty("experience")
    private Integer experience;

    @JsonProperty("birth_date")
    private String birthDate;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("birth_place")
    private String birthPlace;

    @JsonProperty("rookie_year")
    private Integer rookieYear;

    @JsonProperty("college_conf")
    private String collegeConf;

    @JsonProperty("jersey")
    private String jersey;

    @JsonProperty("draft")
    private Draft draft;

    @JsonProperty("name")
    private String name;

    @JsonProperty("high_school")
    private String highSchool;

    @JsonProperty("id")
    private String id;

    @JsonProperty("position")
    private String position;

    @JsonProperty("height")
    private Integer height;

    @JsonProperty("status")
    private String status;

    public Optional<String> getCollege() {
        return Optional.ofNullable(college);
    }

    public Optional<String> getLastName() {
        return Optional.ofNullable(lastName);
    }

    public Optional<String> getAbbrName() {
        return Optional.ofNullable(abbrName);
    }

    public Optional<Double> getWeight() {
        return Optional.ofNullable(weight);
    }

    public Optional<String> getNameSuffix() {
        return Optional.ofNullable(nameSuffix);
    }

    public Optional<Integer> getExperience() {
        return Optional.ofNullable(experience);
    }

    public Optional<String> getBirthDate() {
        return Optional.ofNullable(birthDate);
    }

    public Optional<String> getSrId() {
        return Optional.ofNullable(srId);
    }

    public Optional<String> getFirstName() {
        return Optional.ofNullable(firstName);
    }

    public Optional<String> getBirthPlace() {
        return Optional.ofNullable(birthPlace);
    }

    public Optional<Integer> getRookieYear() {
        return Optional.ofNullable(rookieYear);
    }

    public Optional<String> getCollegeConf() {
        return Optional.ofNullable(collegeConf);
    }

    public Optional<String> getJersey() {
        return Optional.ofNullable(jersey);
    }

    public Optional<Draft> getDraft() {
        return Optional.ofNullable(draft);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<String> getHighSchool() {
        return Optional.ofNullable(highSchool);
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
