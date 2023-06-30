package com.fanduel.modelgenerator.generated.sportradar.nba.splitsschedule;

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
public class Split {
    @JsonProperty("average")
    private Average average;

    @JsonProperty("total")
    private Total total;

    @JsonProperty("day_of_week")
    private String dayOfWeek;

    @JsonProperty("week")
    private String week;

    @JsonProperty("month")
    private String month;

    @JsonProperty("own_record")
    private OwnRecord ownRecord;

    @JsonProperty("opponents")
    private Opponents opponents;

    @JsonProperty("category")
    private String category;

    @JsonProperty("days_of_rest")
    private String daysOfRest;

    public Optional<Average> getAverage() {
        return Optional.ofNullable(average);
    }

    public Optional<Total> getTotal() {
        return Optional.ofNullable(total);
    }

    public Optional<String> getDayOfWeek() {
        return Optional.ofNullable(dayOfWeek);
    }

    public Optional<String> getWeek() {
        return Optional.ofNullable(week);
    }

    public Optional<String> getMonth() {
        return Optional.ofNullable(month);
    }

    public Optional<OwnRecord> getOwnRecord() {
        return Optional.ofNullable(ownRecord);
    }

    public Optional<Opponents> getOpponents() {
        return Optional.ofNullable(opponents);
    }

    public Optional<String> getCategory() {
        return Optional.ofNullable(category);
    }

    public Optional<String> getDaysOfRest() {
        return Optional.ofNullable(daysOfRest);
    }
}
