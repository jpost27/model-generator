package com.fanduel.modelgenerator.generated.sportradar.mlb.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Month {
    @JsonProperty("bb")
    private Integer bb;

    @JsonProperty("ab")
    private Integer ab;

    @JsonProperty("d")
    private Integer d;

    @JsonProperty("ibb")
    private Integer ibb;

    @JsonProperty("h")
    private Integer h;

    @JsonProperty("hr")
    private Integer hr;

    @JsonProperty("sb")
    private Integer sb;

    @JsonProperty("slg")
    private Double slg;

    @JsonProperty("cs")
    private Integer cs;

    @JsonProperty("s")
    private Integer s;

    @JsonProperty("ops")
    private Double ops;

    @JsonProperty("avg")
    private String avg;

    @JsonProperty("t")
    private Integer t;

    @JsonProperty("ktotal")
    private Integer ktotal;

    @JsonProperty("hbp")
    private Integer hbp;

    @JsonProperty("rbi")
    private Integer rbi;

    @JsonProperty("obp")
    private Double obp;

    @JsonProperty("value")
    private String value;

    @JsonProperty("runs")
    private Integer runs;
}
