package com.fanduel.modelgenerator.generated.nbav8.teamdraftsummary;

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
public class Pick {
    @JsonProperty("prospect")
    private Prospect prospect;

    @JsonProperty("number")
    private Integer number;

    @JsonProperty("overall")
    private Integer overall;

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

    public Optional<Integer> getOverall() {
        return Optional.ofNullable(overall);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Team> getTeam() {
        return Optional.ofNullable(team);
    }
}
