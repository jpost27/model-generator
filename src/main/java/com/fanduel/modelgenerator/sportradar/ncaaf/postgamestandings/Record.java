
package com.fanduel.modelgenerator.sportradar.ncaaf.postgamestandings;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "category",
    "wins",
    "losses",
    "ties",
    "win_pct",
    "points_for",
    "points_against"
})
@Generated("jsonschema2pojo")
public class Record {

    @JsonProperty("category")
    public String category;
    @JsonProperty("wins")
    public Integer wins;
    @JsonProperty("losses")
    public Integer losses;
    @JsonProperty("ties")
    public Integer ties;
    @JsonProperty("win_pct")
    public Double winPct;
    @JsonProperty("points_for")
    public Integer pointsFor;
    @JsonProperty("points_against")
    public Integer pointsAgainst;

}
