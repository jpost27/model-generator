package com.fanduel.modelgenerator.generated.sportradar.mlb.gameextendedsummary;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Fielding {
    @JsonProperty("seasontd")
    private Seasontd seasontd;

    @JsonProperty("overall")
    private Overall overall;

    @JsonProperty("positions")
    private List<Position> positions;

    public Optional<Seasontd> getSeasontd() {
        return Optional.ofNullable(seasontd);
    }

    public Optional<Overall> getOverall() {
        return Optional.ofNullable(overall);
    }

    public List<Position> getPositions() {
        return Optional.ofNullable(positions).orElse(Collections.emptyList());
    }
}
