
package com.fanduel.modelgenerator.sportradar.mlb.dailychangelog;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "first_name",
    "last_name",
    "preferred_name",
    "last_modified"
})
@Generated("jsonschema2pojo")
public class Player {

    @JsonProperty("id")
    public String id;
    @JsonProperty("first_name")
    public String firstName;
    @JsonProperty("last_name")
    public String lastName;
    @JsonProperty("preferred_name")
    public String preferredName;
    @JsonProperty("last_modified")
    public String lastModified;

}
