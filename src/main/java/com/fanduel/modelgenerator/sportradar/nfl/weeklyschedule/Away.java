
package com.fanduel.modelgenerator.sportradar.nfl.weeklyschedule;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "alias",
    "game_number",
    "sr_id"
})
@Generated("jsonschema2pojo")
public class Away {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("alias")
    public String alias;
    @JsonProperty("game_number")
    public Integer gameNumber;
    @JsonProperty("sr_id")
    public String srId;

}
