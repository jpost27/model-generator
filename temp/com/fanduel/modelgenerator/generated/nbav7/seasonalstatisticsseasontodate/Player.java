package com.fanduel.modelgenerator.generated.nbav7.seasonalstatisticsseasontodate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("reference")
    private String reference;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("average")
    private Average average;

    @JsonProperty("total")
    private Total total;

    @JsonProperty("jersey_number")
    private String jerseyNumber;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("name_suffix")
    private String nameSuffix;

    @JsonProperty("id")
    private String id;

    @JsonProperty("position")
    private String position;

    @JsonProperty("primary_position")
    private String primaryPosition;

    @JsonProperty("sr_id")
    private String srId;

    public Optional<String> getReference() {
        return Optional.ofNullable(reference);
    }

    public Optional<String> getFirstName() {
        return Optional.ofNullable(firstName);
    }

    public Optional<String> getLastName() {
        return Optional.ofNullable(lastName);
    }

    public Optional<Average> getAverage() {
        return Optional.ofNullable(average);
    }

    public Optional<Total> getTotal() {
        return Optional.ofNullable(total);
    }

    public Optional<String> getJerseyNumber() {
        return Optional.ofNullable(jerseyNumber);
    }

    public Optional<String> getFullName() {
        return Optional.ofNullable(fullName);
    }

    public Optional<String> getNameSuffix() {
        return Optional.ofNullable(nameSuffix);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getPosition() {
        return Optional.ofNullable(position);
    }

    public Optional<String> getPrimaryPosition() {
        return Optional.ofNullable(primaryPosition);
    }

    public Optional<String> getSrId() {
        return Optional.ofNullable(srId);
    }
}
