package com.fanduel.modelgenerator.generated.sportradar.mlb.dailychangelog;

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
public class Result {
    @JsonProperty("season_id")
    private String seasonId;

    @JsonProperty("id")
    private String id;

    @JsonProperty("last_modified")
    private String lastModified;

    @JsonProperty("title")
    private String title;

    public Optional<String> getSeasonId() {
        return Optional.ofNullable(seasonId);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getLastModified() {
        return Optional.ofNullable(lastModified);
    }

    public Optional<String> getTitle() {
        return Optional.ofNullable(title);
    }
}
