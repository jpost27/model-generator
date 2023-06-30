package com.fanduel.modelgenerator.generated.sportradar.mlb.seriesschedule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Object;
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
public class SeriesScheduleResponse {
    @JsonProperty("series")
    private List<Object> series;

    @JsonProperty("league")
    private League league;

    @JsonProperty("season")
    private Season season;

    @JsonProperty("_comment")
    private String comment;

    public List<Object> getSeries() {
        return Optional.ofNullable(series).orElse(Collections.emptyList());
    }

    public Optional<League> getLeague() {
        return Optional.ofNullable(league);
    }

    public Optional<Season> getSeason() {
        return Optional.ofNullable(season);
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }
}
