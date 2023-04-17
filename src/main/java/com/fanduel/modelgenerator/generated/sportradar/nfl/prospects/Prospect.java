package com.fanduel.modelgenerator.generated.sportradar.nfl.prospects;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Prospect {
    @JsonProperty("source_id")
    private String sourceId;

    @JsonProperty("team_name")
    private String teamName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("top_prospect")
    private Boolean topProspect;

    @JsonProperty("conference")
    private Conference conference;

    @JsonProperty("weight")
    private Integer weight;

    @JsonProperty("team")
    private Team team;

    @JsonProperty("experience")
    private String experience;

    @JsonProperty("division")
    private Division division;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("birth_place")
    private String birthPlace;

    @JsonProperty("league_id")
    private String leagueId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private String id;

    @JsonProperty("position")
    private String position;

    @JsonProperty("height")
    private Integer height;
}
