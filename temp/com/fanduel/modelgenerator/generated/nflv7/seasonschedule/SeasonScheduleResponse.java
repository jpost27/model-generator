package com.fanduel.modelgenerator.generated.nflv7.seasonschedule;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.List;
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
public class SeasonScheduleResponse {
    @JsonProperty("weeks")
    private List<Week> weeks;

    @JsonProperty("year")
    private Integer year;

    @JsonProperty("name")
    private String name;

    @JsonProperty("_comment")
    private String comment;

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type;

    public List<Week> getWeeks() {
        return Optional.ofNullable(weeks).orElse(Collections.emptyList());
    }

    public Optional<Integer> getYear() {
        return Optional.ofNullable(year);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }
}
