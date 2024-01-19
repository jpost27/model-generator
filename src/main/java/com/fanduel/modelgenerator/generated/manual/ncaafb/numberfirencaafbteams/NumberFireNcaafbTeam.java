package com.fanduel.modelgenerator.generated.manual.ncaafb.numberfirencaafbteams;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
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
public class NumberFireNcaafbTeam {
    @JsonProperty("division")
    private String division;

    @JsonProperty("conference")
    private String conference;

    @JsonProperty("espn_id")
    private Integer espnId;

    @JsonProperty("team_id")
    private Integer teamId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("abbrev")
    private String abbrev;

    @JsonProperty("short")
    private String _short;

    @JsonProperty("is_active")
    private Integer isActive;

    @JsonProperty("slug")
    private String slug;

    public Optional<String> getDivision() {
        return Optional.ofNullable(division);
    }

    public Optional<String> getConference() {
        return Optional.ofNullable(conference);
    }

    public Optional<Integer> getEspnId() {
        return Optional.ofNullable(espnId);
    }

    public Optional<Integer> getTeamId() {
        return Optional.ofNullable(teamId);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<Integer> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getAbbrev() {
        return Optional.ofNullable(abbrev);
    }

    public Optional<String> get_short() {
        return Optional.ofNullable(_short);
    }

    public Optional<Integer> getIsActive() {
        return Optional.ofNullable(isActive);
    }

    public Optional<String> getSlug() {
        return Optional.ofNullable(slug);
    }
}
