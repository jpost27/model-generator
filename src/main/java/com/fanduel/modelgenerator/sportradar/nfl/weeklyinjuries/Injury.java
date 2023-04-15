
package com.fanduel.modelgenerator.sportradar.nfl.weeklyinjuries;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status",
    "status_date",
    "practice",
    "primary",
    "secondary"
})
@Generated("jsonschema2pojo")
public class Injury {

    @JsonProperty("status")
    public String status;
    @JsonProperty("status_date")
    public String statusDate;
    @JsonProperty("practice")
    public Practice practice;
    @JsonProperty("primary")
    public String primary;
    @JsonProperty("secondary")
    public String secondary;

}
