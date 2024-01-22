package com.fanduel.modelgenerator.generated.nbav7.playerprofile;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Draft {
    @JsonProperty("round")
    private String round;

    @JsonProperty("year")
    private Integer year;

    @JsonProperty("pick")
    private String pick;

    @JsonProperty("team_id")
    private String teamId;

    public Optional<String> getRound() {
        return Optional.ofNullable(round);
    }

    public Optional<Integer> getYear() {
        return Optional.ofNullable(year);
    }

    public Optional<String> getPick() {
        return Optional.ofNullable(pick);
    }

    public Optional<String> getTeamId() {
        return Optional.ofNullable(teamId);
    }
}
