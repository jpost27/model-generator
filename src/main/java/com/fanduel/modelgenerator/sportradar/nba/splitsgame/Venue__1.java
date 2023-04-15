
package com.fanduel.modelgenerator.sportradar.nba.splitsgame;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "capacity",
    "address",
    "city",
    "state",
    "zip",
    "country",
    "sr_id"
})
@Generated("jsonschema2pojo")
public class Venue__1 {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("capacity")
    public Integer capacity;
    @JsonProperty("address")
    public String address;
    @JsonProperty("city")
    public String city;
    @JsonProperty("state")
    public String state;
    @JsonProperty("zip")
    public String zip;
    @JsonProperty("country")
    public String country;
    @JsonProperty("sr_id")
    public String srId;

}
