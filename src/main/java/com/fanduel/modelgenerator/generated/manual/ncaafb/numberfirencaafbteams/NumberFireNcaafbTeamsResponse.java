package com.fanduel.modelgenerator.generated.manual.ncaafb.numberfirencaafbteams;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
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
public class NumberFireNcaafbTeamsResponse {
    @JsonProperty("meta")
    private Meta meta;

    @JsonProperty("body")
    private List<NumberFireNcaafbTeam> body;

    @JsonProperty("status_code")
    private Integer statusCode;

    public Optional<Meta> getMeta() {
        return Optional.ofNullable(meta);
    }

    public List<NumberFireNcaafbTeam> getBody() {
        return Optional.ofNullable(body).orElse(Collections.emptyList());
    }

    public Optional<Integer> getStatusCode() {
        return Optional.ofNullable(statusCode);
    }
}
