package com.fanduel.modelgenerator.generated.sportradar.mlb.gameextendedsummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
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
public class Runner {
    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("starting_base")
    private Integer startingBase;

    @JsonProperty("jersey_number")
    private String jerseyNumber;

    @JsonProperty("description")
    private String description;

    @JsonProperty("outcome_id")
    private String outcomeId;

    @JsonProperty("preferred_name")
    private String preferredName;

    @JsonProperty("id")
    private String id;

    @JsonProperty("fielders")
    private List<Fielder> fielders;

    @JsonProperty("ending_base")
    private Integer endingBase;

    @JsonProperty("out")
    private Boolean out;

    public Optional<String> getFirstName() {
        return Optional.ofNullable(firstName);
    }

    public Optional<String> getLastName() {
        return Optional.ofNullable(lastName);
    }

    public Optional<Integer> getStartingBase() {
        return Optional.ofNullable(startingBase);
    }

    public Optional<String> getJerseyNumber() {
        return Optional.ofNullable(jerseyNumber);
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }

    public Optional<String> getOutcomeId() {
        return Optional.ofNullable(outcomeId);
    }

    public Optional<String> getPreferredName() {
        return Optional.ofNullable(preferredName);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public List<Fielder> getFielders() {
        return Optional.ofNullable(fielders).orElse(Collections.emptyList());
    }

    public Optional<Integer> getEndingBase() {
        return Optional.ofNullable(endingBase);
    }

    public Optional<Boolean> getOut() {
        return Optional.ofNullable(out);
    }
}
