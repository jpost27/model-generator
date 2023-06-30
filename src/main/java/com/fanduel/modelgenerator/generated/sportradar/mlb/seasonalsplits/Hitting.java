package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalsplits;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Hitting {
    @JsonProperty("overall")
    private List<Overall> overall;

    public List<Overall> getOverall() {
        return Optional.ofNullable(overall).orElse(Collections.emptyList());
    }
}
