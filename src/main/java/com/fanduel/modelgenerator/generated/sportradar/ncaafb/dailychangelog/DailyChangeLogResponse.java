package com.fanduel.modelgenerator.generated.sportradar.ncaafb.dailychangelog;

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
public class DailyChangeLogResponse {
    @JsonProperty("league")
    private League league;

    @JsonProperty("start_time")
    private String startTime;

    @JsonProperty("_comment")
    private String comment;

    @JsonProperty("end_time")
    private String endTime;

    public Optional<League> getLeague() {
        return Optional.ofNullable(league);
    }

    public Optional<String> getStartTime() {
        return Optional.ofNullable(startTime);
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }

    public Optional<String> getEndTime() {
        return Optional.ofNullable(endTime);
    }
}
