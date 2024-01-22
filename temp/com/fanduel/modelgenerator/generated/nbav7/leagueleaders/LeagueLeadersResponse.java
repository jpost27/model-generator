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
public class LeagueLeadersResponse {
    @JsonProperty("name")
    private String name;

    @JsonProperty("season")
    private Season season;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("id")
    private String id;

    @JsonProperty("categories")
    private List<Category> categories;

    @JsonProperty("type")
    private String type;

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<Season> getSeason() {
        return Optional.ofNullable(season);
    }

    public Optional<String> getAlias() {
        return Optional.ofNullable(alias);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public List<Category> getCategories() {
        return Optional.ofNullable(categories).orElse(Collections.emptyList());
    }

    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }
}
