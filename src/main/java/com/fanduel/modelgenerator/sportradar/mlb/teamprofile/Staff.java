
package com.fanduel.modelgenerator.sportradar.mlb.teamprofile;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "full_name",
    "first_name",
    "last_name",
    "position",
    "id"
})
@Generated("jsonschema2pojo")
public class Staff {

    @JsonProperty("full_name")
    public String fullName;
    @JsonProperty("first_name")
    public String firstName;
    @JsonProperty("last_name")
    public String lastName;
    @JsonProperty("position")
    public String position;
    @JsonProperty("id")
    public String id;

}
