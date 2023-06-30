package com.fanduel.modelgenerator.generated.manual.scanattachments.scanattachments;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class AssociatedMarket {
    @JsonProperty("eventId")
    private Integer eventId;

    @JsonProperty("eventTypeId")
    private Integer eventTypeId;

    @JsonProperty("externalMarketId")
    private String externalMarketId;

    public Optional<Integer> getEventId() {
        return Optional.ofNullable(eventId);
    }

    public Optional<Integer> getEventTypeId() {
        return Optional.ofNullable(eventTypeId);
    }

    public Optional<String> getExternalMarketId() {
        return Optional.ofNullable(externalMarketId);
    }
}
