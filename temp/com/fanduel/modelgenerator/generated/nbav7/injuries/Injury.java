package com.fanduel.modelgenerator.generated.nbav7.injuries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Injury {
    @JsonProperty("update_date")
    private String updateDate;

    @JsonProperty("comment")
    private String comment;

    @JsonProperty("id")
    private String id;

    @JsonProperty("start_date")
    private String startDate;

    @JsonProperty("desc")
    private String desc;

    @JsonProperty("status")
    private String status;

    public Optional<String> getUpdateDate() {
        return Optional.ofNullable(updateDate);
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getStartDate() {
        return Optional.ofNullable(startDate);
    }

    public Optional<String> getDesc() {
        return Optional.ofNullable(desc);
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }
}
