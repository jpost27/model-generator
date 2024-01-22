package com.fanduel.modelgenerator.generated.golfv3.playerstatistics;

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
    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("country")
    private String country;

    @JsonProperty("abbr_name")
    private String abbrName;

    @JsonProperty("id")
    private String id;

    @JsonProperty("statistics")
    private Statistics statistics;

    public Optional<String> getFirstName() {
        return Optional.ofNullable(firstName);
    }

    public Optional<String> getLastName() {
        return Optional.ofNullable(lastName);
    }

    public Optional<String> getCountry() {
        return Optional.ofNullable(country);
    }

    public Optional<String> getAbbrName() {
        return Optional.ofNullable(abbrName);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Statistics> getStatistics() {
        return Optional.ofNullable(statistics);
    }
}
