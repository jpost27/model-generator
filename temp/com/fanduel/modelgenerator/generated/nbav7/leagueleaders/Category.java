package com.fanduel.modelgenerator.generated.nbav7.leagueleaders;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Category {
    @JsonProperty("ranks")
    private List<Rank> ranks;

    @JsonProperty("name")
    private String name;

    @JsonProperty("type")
    private String type;

    public List<Rank> getRanks() {
        return Optional.ofNullable(ranks).orElse(Collections.emptyList());
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }
}
