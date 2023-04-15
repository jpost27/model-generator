
package com.fanduel.modelgenerator.sportradar.nfl.gamestatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "market",
    "alias",
    "sr_id",
    "used_timeouts",
    "remaining_timeouts",
    "points",
    "used_challenges",
    "remaining_challenges",
    "record"
})
@Generated("jsonschema2pojo")
public class Home {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("market")
    public String market;
    @JsonProperty("alias")
    public String alias;
    @JsonProperty("sr_id")
    public String srId;
    @JsonProperty("used_timeouts")
    public Integer usedTimeouts;
    @JsonProperty("remaining_timeouts")
    public Integer remainingTimeouts;
    @JsonProperty("points")
    public Integer points;
    @JsonProperty("used_challenges")
    public Integer usedChallenges;
    @JsonProperty("remaining_challenges")
    public Integer remainingChallenges;
    @JsonProperty("record")
    public Record record;

}
