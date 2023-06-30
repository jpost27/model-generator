package com.fanduel.modelgenerator.generated.manual.NfNflPlayerStatlines.nfnflplayerstatlines;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class NfNflPlayerStatlinesResponse {
    @JsonProperty("number_of_games")
    private String numberOfGames;

    @JsonProperty("week")
    private String week;

    @JsonProperty("data")
    private List<Datum> data;

    @JsonProperty("season")
    private String season;

    public Optional<String> getNumberOfGames() {
        return Optional.ofNullable(numberOfGames);
    }

    public Optional<String> getWeek() {
        return Optional.ofNullable(week);
    }

    public List<Datum> getData() {
        return Optional.ofNullable(data).orElse(Collections.emptyList());
    }

    public Optional<String> getSeason() {
        return Optional.ofNullable(season);
    }
}
