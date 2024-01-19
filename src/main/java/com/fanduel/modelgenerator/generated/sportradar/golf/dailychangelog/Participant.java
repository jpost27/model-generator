package com.fanduel.modelgenerator.generated.sportradar.golf.dailychangelog;

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
public class Participant {
    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("season")
    private Season season;

    @JsonProperty("id")
    private String id;

    @JsonProperty("last_modified")
    private String lastModified;

    public Optional<String> getFullName() {
        return Optional.ofNullable(fullName);
    }

    public Optional<Season> getSeason() {
        return Optional.ofNullable(season);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getLastModified() {
        return Optional.ofNullable(lastModified);
    }
}
