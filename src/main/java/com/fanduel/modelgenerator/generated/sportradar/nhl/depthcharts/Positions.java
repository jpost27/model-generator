package com.fanduel.modelgenerator.generated.sportradar.nhl.depthcharts;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Positions {
    @JsonProperty("PP1")
    private Pp1 pp1;

    @JsonProperty("RD")
    private Rd rd;

    @JsonProperty("C")
    private C c;

    @JsonProperty("PP2")
    private Pp2 pp2;

    @JsonProperty("RW")
    private Rw rw;

    @JsonProperty("G")
    private G g;

    @JsonProperty("LD")
    private Ld ld;

    @JsonProperty("LW")
    private Lw lw;
}
