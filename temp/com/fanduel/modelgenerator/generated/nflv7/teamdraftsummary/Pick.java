package com.fanduel.modelgenerator.generated.nflv7.teamdraftsummary;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
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
public class Pick {
    @JsonProperty("prospect")
    private Prospect prospect;

    @JsonProperty("number")
    private Integer number;

    @JsonProperty("traded")
    private Boolean traded;

    @JsonProperty("overall")
    private Integer overall;

    @JsonProperty("trades")
    private List<Trade> trades;

    @JsonProperty("id")
    private String id;

    @JsonProperty("team")
    private Team team;

    public Optional<Prospect> getProspect() {
        return Optional.ofNullable(prospect);
    }

    public Optional<Integer> getNumber() {
        return Optional.ofNullable(number);
    }

    public Optional<Boolean> getTraded() {
        return Optional.ofNullable(traded);
    }

    public Optional<Integer> getOverall() {
        return Optional.ofNullable(overall);
    }

    public List<Trade> getTrades() {
        return Optional.ofNullable(trades).orElse(Collections.emptyList());
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Team> getTeam() {
        return Optional.ofNullable(team);
    }
}