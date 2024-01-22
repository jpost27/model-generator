package com.fanduel.modelgenerator.generated.nbav7.splitshierarchy;

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
public class Split {
    @JsonProperty("division")
    private Division division;

    @JsonProperty("average")
    private Average average;

    @JsonProperty("total")
    private Total total;

    @JsonProperty("conference")
    private Conference conference;

    @JsonProperty("own_record")
    private OwnRecord ownRecord;

    @JsonProperty("opponents")
    private Opponents opponents;

    @JsonProperty("category")
    private String category;

    public Optional<Division> getDivision() {
        return Optional.ofNullable(division);
    }

    public Optional<Average> getAverage() {
        return Optional.ofNullable(average);
    }

    public Optional<Total> getTotal() {
        return Optional.ofNullable(total);
    }

    public Optional<Conference> getConference() {
        return Optional.ofNullable(conference);
    }

    public Optional<OwnRecord> getOwnRecord() {
        return Optional.ofNullable(ownRecord);
    }

    public Optional<Opponents> getOpponents() {
        return Optional.ofNullable(opponents);
    }

    public Optional<String> getCategory() {
        return Optional.ofNullable(category);
    }
}
