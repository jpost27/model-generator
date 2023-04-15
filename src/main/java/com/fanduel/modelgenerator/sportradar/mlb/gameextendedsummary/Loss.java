
package com.fanduel.modelgenerator.sportradar.mlb.gameextendedsummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "preferred_name",
    "first_name",
    "last_name",
    "jersey_number",
    "status",
    "position",
    "primary_position",
    "id",
    "win",
    "loss",
    "save",
    "hold",
    "blown_save"
})
@Generated("jsonschema2pojo")
public class Loss {

    @JsonProperty("preferred_name")
    public String preferredName;
    @JsonProperty("first_name")
    public String firstName;
    @JsonProperty("last_name")
    public String lastName;
    @JsonProperty("jersey_number")
    public String jerseyNumber;
    @JsonProperty("status")
    public String status;
    @JsonProperty("position")
    public String position;
    @JsonProperty("primary_position")
    public String primaryPosition;
    @JsonProperty("id")
    public String id;
    @JsonProperty("win")
    public Integer win;
    @JsonProperty("loss")
    public Integer loss;
    @JsonProperty("save")
    public Integer save;
    @JsonProperty("hold")
    public Integer hold;
    @JsonProperty("blown_save")
    public Integer blownSave;

}
