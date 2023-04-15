
package com.fanduel.modelgenerator.sportradar.mlb.glossary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "desc"
})
@Generated("jsonschema2pojo")
public class PostSeasonGame {

    @JsonProperty("id")
    public String id;
    @JsonProperty("desc")
    public String desc;

}
