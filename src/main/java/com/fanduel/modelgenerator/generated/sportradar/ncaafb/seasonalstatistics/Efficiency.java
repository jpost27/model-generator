package com.fanduel.modelgenerator.generated.sportradar.ncaafb.seasonalstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Efficiency {
    @JsonProperty("fourthdown")
    private Fourthdown fourthdown;

    @JsonProperty("redzone")
    private Redzone redzone;

    @JsonProperty("thirddown")
    private Thirddown thirddown;

    @JsonProperty("goaltogo")
    private Goaltogo goaltogo;

    public Optional<Fourthdown> getFourthdown() {
        return Optional.ofNullable(fourthdown);
    }

    public Optional<Redzone> getRedzone() {
        return Optional.ofNullable(redzone);
    }

    public Optional<Thirddown> getThirddown() {
        return Optional.ofNullable(thirddown);
    }

    public Optional<Goaltogo> getGoaltogo() {
        return Optional.ofNullable(goaltogo);
    }
}
