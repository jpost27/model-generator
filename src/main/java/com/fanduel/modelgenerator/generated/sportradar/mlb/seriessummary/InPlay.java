package com.fanduel.modelgenerator.generated.sportradar.mlb.seriessummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class InPlay {
    @JsonProperty("linedrive")
    private Integer linedrive;

    @JsonProperty("popup")
    private Integer popup;

    @JsonProperty("groundball")
    private Integer groundball;

    @JsonProperty("flyball")
    private Integer flyball;

    public Optional<Integer> getLinedrive() {
        return Optional.ofNullable(linedrive);
    }

    public Optional<Integer> getPopup() {
        return Optional.ofNullable(popup);
    }

    public Optional<Integer> getGroundball() {
        return Optional.ofNullable(groundball);
    }

    public Optional<Integer> getFlyball() {
        return Optional.ofNullable(flyball);
    }
}
