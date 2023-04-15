
package com.fanduel.modelgenerator.sportradar.nfl.draftsummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "source_id",
    "league_id",
    "first_name",
    "last_name",
    "name",
    "position",
    "team_name",
    "height",
    "weight",
    "experience",
    "birth_place",
    "top_prospect"
})
@Generated("jsonschema2pojo")
public class Prospect {

    @JsonProperty("id")
    public String id;
    @JsonProperty("source_id")
    public String sourceId;
    @JsonProperty("league_id")
    public String leagueId;
    @JsonProperty("first_name")
    public String firstName;
    @JsonProperty("last_name")
    public String lastName;
    @JsonProperty("name")
    public String name;
    @JsonProperty("position")
    public String position;
    @JsonProperty("team_name")
    public String teamName;
    @JsonProperty("height")
    public Integer height;
    @JsonProperty("weight")
    public Integer weight;
    @JsonProperty("experience")
    public String experience;
    @JsonProperty("birth_place")
    public String birthPlace;
    @JsonProperty("top_prospect")
    public Boolean topProspect;

}
