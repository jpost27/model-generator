package com.fanduel.modelgenerator.generated.sportradar.nfl.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Fumbles {
    @JsonProperty("own_rec")
    private Integer ownRec;

    @JsonProperty("lost_fumbles")
    private Integer lostFumbles;

    @JsonProperty("own_rec_yards")
    private Integer ownRecYards;

    @JsonProperty("ez_rec_tds")
    private Integer ezRecTds;

    @JsonProperty("forced_fumbles")
    private Integer forcedFumbles;

    @JsonProperty("fumbles")
    private Integer fumbles;

    @JsonProperty("opp_rec_tds")
    private Integer oppRecTds;

    @JsonProperty("opp_rec")
    private Integer oppRec;

    @JsonProperty("own_rec_tds")
    private Integer ownRecTds;

    @JsonProperty("opp_rec_yards")
    private Integer oppRecYards;

    @JsonProperty("out_of_bounds")
    private Integer outOfBounds;
}
