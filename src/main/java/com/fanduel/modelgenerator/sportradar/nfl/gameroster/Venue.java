
package com.fanduel.modelgenerator.sportradar.nfl.gameroster;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "city",
    "state",
    "country",
    "zip",
    "address",
    "capacity",
    "surface",
    "roof_type",
    "sr_id",
    "location"
})
@Generated("jsonschema2pojo")
public class Venue {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("city")
    public String city;
    @JsonProperty("state")
    public String state;
    @JsonProperty("country")
    public String country;
    @JsonProperty("zip")
    public String zip;
    @JsonProperty("address")
    public String address;
    @JsonProperty("capacity")
    public Integer capacity;
    @JsonProperty("surface")
    public String surface;
    @JsonProperty("roof_type")
    public String roofType;
    @JsonProperty("sr_id")
    public String srId;
    @JsonProperty("location")
    public Location location;

}
