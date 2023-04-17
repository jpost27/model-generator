package com.fanduel.modelgenerator.generated.sportradar.mlb.dailysummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Pitching {
    @JsonProperty("loss")
    private Loss loss;

    @JsonProperty("blown_save")
    private List<BlownSave> blownSave;

    @JsonProperty("bullpen")
    private Bullpen bullpen;

    @JsonProperty("starters")
    private Starters starters;

    @JsonProperty("save")
    private Save save;

    @JsonProperty("overall")
    private Overall overall;

    @JsonProperty("win")
    private Win win;

    @JsonProperty("hold")
    private List<Hold> hold;
}
