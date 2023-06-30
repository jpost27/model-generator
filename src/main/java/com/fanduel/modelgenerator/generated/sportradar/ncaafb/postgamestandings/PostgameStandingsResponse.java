package com.fanduel.modelgenerator.generated.sportradar.ncaafb.postgamestandings;

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
public class PostgameStandingsResponse {
    @JsonProperty("season")
    private Season season;

    @JsonProperty("_comment")
    private String comment;

    @JsonProperty("divisions")
    private List<Division> divisions;

    public Optional<Season> getSeason() {
        return Optional.ofNullable(season);
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }

    public List<Division> getDivisions() {
        return Optional.ofNullable(divisions).orElse(Collections.emptyList());
    }
}
