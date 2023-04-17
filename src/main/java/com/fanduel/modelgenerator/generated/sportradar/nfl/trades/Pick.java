package com.fanduel.modelgenerator.generated.sportradar.nfl.trades;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Pick {
    @JsonProperty("number")
    private Integer number;

    @JsonProperty("round")
    private Round round;

    @JsonProperty("supplemental")
    private Boolean supplemental;

    @JsonProperty("overall")
    private Integer overall;

    @JsonProperty("id")
    private String id;
}
