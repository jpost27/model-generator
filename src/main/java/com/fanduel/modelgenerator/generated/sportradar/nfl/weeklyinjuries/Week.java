package com.fanduel.modelgenerator.generated.sportradar.nfl.weeklyinjuries;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Week {
    @JsonProperty("sequence")
    private Integer sequence;

    @JsonProperty("id")
    private String id;

    @JsonProperty("title")
    private String title;
}
