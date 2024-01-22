package com.fanduel.modelgenerator.generated.nbav8.trades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Transaction {
    @JsonProperty("from_team")
    private FromTeam fromTeam;

    @JsonProperty("id")
    private String id;

    @JsonProperty("items")
    private List<Item> items;

    @JsonProperty("to_team")
    private ToTeam toTeam;

    public Optional<FromTeam> getFromTeam() {
        return Optional.ofNullable(fromTeam);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public List<Item> getItems() {
        return Optional.ofNullable(items).orElse(Collections.emptyList());
    }

    public Optional<ToTeam> getToTeam() {
        return Optional.ofNullable(toTeam);
    }
}
