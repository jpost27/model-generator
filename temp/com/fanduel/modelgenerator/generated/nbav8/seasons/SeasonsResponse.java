package com.fanduel.modelgenerator.generated.nbav8.seasons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class SeasonsResponse {
    @JsonProperty("seasons")
    private List<Season> seasons;

    @JsonProperty("league")
    private League league;

    public List<Season> getSeasons() {
        return Optional.ofNullable(seasons).orElse(Collections.emptyList());
    }

    public Optional<League> getLeague() {
        return Optional.ofNullable(league);
    }
}
