package com.fanduel.modelgenerator.generated.golfv3.teetimesperround;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.List;
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
public class Course {
    @JsonProperty("par")
    private Integer par;

    @JsonProperty("name")
    private String name;

    @JsonProperty("yardage")
    private Integer yardage;

    @JsonProperty("id")
    private String id;

    @JsonProperty("pairings")
    private List<Pairing> pairings;

    public Optional<Integer> getPar() {
        return Optional.ofNullable(par);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<Integer> getYardage() {
        return Optional.ofNullable(yardage);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public List<Pairing> getPairings() {
        return Optional.ofNullable(pairings).orElse(Collections.emptyList());
    }
}