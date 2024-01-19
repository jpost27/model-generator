package com.fanduel.modelgenerator.generated.manual.ncaafb.numberfirencaafbteams;

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
public class Meta {
    @JsonProperty("objects_returned")
    private Integer objectsReturned;

    public Optional<Integer> getObjectsReturned() {
        return Optional.ofNullable(objectsReturned);
    }
}
