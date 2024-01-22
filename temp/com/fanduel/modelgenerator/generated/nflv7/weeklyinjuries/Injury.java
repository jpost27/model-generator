package com.fanduel.modelgenerator.generated.nflv7.weeklyinjuries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
