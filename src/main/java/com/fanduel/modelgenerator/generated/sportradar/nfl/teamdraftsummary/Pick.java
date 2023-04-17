package com.fanduel.modelgenerator.generated.sportradar.nfl.teamdraftsummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Pick {
    @JsonProperty("prospect")
    private Prospect prospect;

    @JsonProperty("number")
    private Integer number;

    @JsonProperty("traded")
    private Boolean traded;

    @JsonProperty("overall")
    private Integer overall;

    @JsonProperty("trades")
    private List<Trade> trades;

    @JsonProperty("id")
    private String id;

    @JsonProperty("team")
    private Team team;
}
