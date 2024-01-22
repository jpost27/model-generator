package com.fanduel.modelgenerator.generated.nflv7.trades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
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
    @JsonProperty("number")
    private Integer number;

    @JsonProperty("round")
    private Round round;

    @JsonProperty("supplemental")
    private Boolean supplemental;

    @JsonProperty("overall")
    private Integer overall;

    @JsonProperty("id")
    private String id;

    public Optional<Integer> getNumber() {
        return Optional.ofNullable(number);
    }

    public Optional<Round> getRound() {
        return Optional.ofNullable(round);
    }

    public Optional<Boolean> getSupplemental() {
        return Optional.ofNullable(supplemental);
    }

    public Optional<Integer> getOverall() {
        return Optional.ofNullable(overall);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }
}
