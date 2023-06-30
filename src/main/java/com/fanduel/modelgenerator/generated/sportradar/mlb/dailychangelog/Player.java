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
public class Player {
    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("id")
    private String id;

    @JsonProperty("preferred_name")
    private String preferredName;

    @JsonProperty("last_modified")
    private String lastModified;

    public Optional<String> getFirstName() {
        return Optional.ofNullable(firstName);
    }

    public Optional<String> getLastName() {
        return Optional.ofNullable(lastName);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getPreferredName() {
        return Optional.ofNullable(preferredName);
    }

    public Optional<String> getLastModified() {
        return Optional.ofNullable(lastModified);
    }
}
