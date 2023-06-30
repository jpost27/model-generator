package com.fanduel.modelgenerator.generated.sportradar.nfl.seasonalstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
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

    public Optional<Integer> getOwnRec() {
        return Optional.ofNullable(ownRec);
    }

    public Optional<Integer> getLostFumbles() {
        return Optional.ofNullable(lostFumbles);
    }

    public Optional<Integer> getOwnRecYards() {
        return Optional.ofNullable(ownRecYards);
    }

    public Optional<Integer> getEzRecTds() {
        return Optional.ofNullable(ezRecTds);
    }

    public Optional<Integer> getForcedFumbles() {
        return Optional.ofNullable(forcedFumbles);
    }

    public Optional<Integer> getFumbles() {
        return Optional.ofNullable(fumbles);
    }

    public Optional<Integer> getOppRecTds() {
        return Optional.ofNullable(oppRecTds);
    }

    public Optional<Integer> getOppRec() {
        return Optional.ofNullable(oppRec);
    }

    public Optional<Integer> getOwnRecTds() {
        return Optional.ofNullable(ownRecTds);
    }

    public Optional<Integer> getOppRecYards() {
        return Optional.ofNullable(oppRecYards);
    }

    public Optional<Integer> getOutOfBounds() {
        return Optional.ofNullable(outOfBounds);
    }
}
