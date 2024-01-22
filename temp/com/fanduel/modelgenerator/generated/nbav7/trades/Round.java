package com.fanduel.modelgenerator.generated.nbav7.trades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
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
public class Round {
    @JsonProperty("number")
    private Integer number;

    @JsonProperty("end_date")
    private String endDate;

    @JsonProperty("id")
    private String id;

    @JsonProperty("start_date")
    private String startDate;

    public Optional<Integer> getNumber() {
        return Optional.ofNullable(number);
    }

    public Optional<String> getEndDate() {
        return Optional.ofNullable(endDate);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getStartDate() {
        return Optional.ofNullable(startDate);
    }
}
