package com.fanduel.modelgenerator.generated.sportradar.golf.tournamentsummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
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
public class Course {
    @JsonProperty("par")
    private Integer par;

    @JsonProperty("name")
    private String name;

    @JsonProperty("yardage")
    private Integer yardage;

    @JsonProperty("id")
    private String id;

    @JsonProperty("holes")
    private List<Hole> holes;

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

    public List<Hole> getHoles() {
        return Optional.ofNullable(holes).orElse(Collections.emptyList());
    }
}
