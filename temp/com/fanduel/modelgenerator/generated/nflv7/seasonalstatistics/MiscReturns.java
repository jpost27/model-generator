package com.fanduel.modelgenerator.generated.nflv7.seasonalstatistics;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Setter
@Accessors(
        chain = true
)
@JsonIgnoreProperties(
        ignoreUnknown = true
)
@EqualsAndHashCode
@ToString
@Generated("fanduel-model-generator")
public class MiscReturns {
    @JsonProperty("touchdowns")
    private Integer touchdowns;

    @JsonProperty("longest_touchdown")
    private Integer longestTouchdown;

    @JsonProperty("fg_return_touchdowns")
    private Integer fgReturnTouchdowns;

    @JsonProperty("ez_rec_touchdowns")
    private Integer ezRecTouchdowns;

    @JsonProperty("returns")
    private Integer returns;

    @JsonProperty("blk_fg_touchdowns")
    private Integer blkFgTouchdowns;

    @JsonProperty("blk_punt_touchdowns")
    private Integer blkPuntTouchdowns;

    @JsonProperty("yards")
    private Integer yards;

    public Optional<Integer> getTouchdowns() {
        return Optional.ofNullable(touchdowns);
    }

    public Optional<Integer> getLongestTouchdown() {
        return Optional.ofNullable(longestTouchdown);
    }

    public Optional<Integer> getFgReturnTouchdowns() {
        return Optional.ofNullable(fgReturnTouchdowns);
    }

    public Optional<Integer> getEzRecTouchdowns() {
        return Optional.ofNullable(ezRecTouchdowns);
    }

    public Optional<Integer> getReturns() {
        return Optional.ofNullable(returns);
    }

    public Optional<Integer> getBlkFgTouchdowns() {
        return Optional.ofNullable(blkFgTouchdowns);
    }

    public Optional<Integer> getBlkPuntTouchdowns() {
        return Optional.ofNullable(blkPuntTouchdowns);
    }

    public Optional<Integer> getYards() {
        return Optional.ofNullable(yards);
    }
}
