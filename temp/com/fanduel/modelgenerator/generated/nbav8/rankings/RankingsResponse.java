package com.fanduel.modelgenerator.generated.nbav8.rankings;

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
public class RankingsResponse {
    @JsonProperty("league")
    private League league;

    @JsonProperty("season")
    private Season season;

    @JsonProperty("conferences")
    private List<Conference> conferences;

    public Optional<League> getLeague() {
        return Optional.ofNullable(league);
    }

    public Optional<Season> getSeason() {
        return Optional.ofNullable(season);
    }

    public List<Conference> getConferences() {
        return Optional.ofNullable(conferences).orElse(Collections.emptyList());
    }
}
