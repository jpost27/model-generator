package com.fanduel.modelgenerator.generated.sportradar.nfl.weeklyinjuries;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Injury {
    @JsonProperty("status_date")
    private String statusDate;

    @JsonProperty("secondary")
    private String secondary;

    @JsonProperty("practice")
    private Practice practice;

    @JsonProperty("status")
    private String status;

    @JsonProperty("primary")
    private String primary;

    public Optional<String> getStatusDate() {
        return Optional.ofNullable(statusDate);
    }

    public Optional<String> getSecondary() {
        return Optional.ofNullable(secondary);
    }

    public Optional<Practice> getPractice() {
        return Optional.ofNullable(practice);
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }

    public Optional<String> getPrimary() {
        return Optional.ofNullable(primary);
    }
}
