package com.fanduel.modelgenerator.generated.sportradar.nba.seasons;

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
public class Season {
    @JsonProperty("year")
    private Integer year;

    @JsonProperty("end_date")
    private String endDate;

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private Type type;

    @JsonProperty("start_date")
    private String startDate;

    @JsonProperty("status")
    private String status;

    public Optional<Integer> getYear() {
        return Optional.ofNullable(year);
    }

    public Optional<String> getEndDate() {
        return Optional.ofNullable(endDate);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Type> getType() {
        return Optional.ofNullable(type);
    }

    public Optional<String> getStartDate() {
        return Optional.ofNullable(startDate);
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }
}
