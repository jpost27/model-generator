package com.fanduel.modelgenerator.generated.manual.scanattachments.scanattachments;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class ScanAttachmentsResponse {
    @JsonProperty("topLevelEventId")
    private Integer topLevelEventId;

    @JsonProperty("marketTypeName")
    private String marketTypeName;

    @JsonProperty("marketType")
    private String marketType;

    @JsonProperty("marketId")
    private String marketId;

    @JsonProperty("numberOfWinners")
    private Integer numberOfWinners;

    @JsonProperty("inPlay")
    private Boolean inPlay;

    @JsonProperty("betDelay")
    private Integer betDelay;

    @JsonProperty("associatedMarkets")
    private List<AssociatedMarket> associatedMarkets;

    @JsonProperty("key")
    private String key;

    @JsonProperty("bspMarket")
    private Boolean bspMarket;

    @JsonProperty("numberOfActiveRunners")
    private Integer numberOfActiveRunners;

    @JsonProperty("bettingType")
    private String bettingType;

    @JsonProperty("productType")
    private String productType;

    @JsonProperty("canTurnInPlay")
    private Boolean canTurnInPlay;

    @JsonProperty("eventId")
    private Integer eventId;

    @JsonProperty("competitionId")
    private Integer competitionId;

    @JsonProperty("runners")
    private List<Runner> runners;

    @JsonProperty("marketLevels")
    private List<String> marketLevels;

    @JsonProperty("eventTypeId")
    private Integer eventTypeId;

    @JsonProperty("marketName")
    private String marketName;

    @JsonProperty("sortPriority")
    private Integer sortPriority;

    @JsonProperty("marketStatus")
    private String marketStatus;

    @JsonProperty("sgmMarket")
    private Boolean sgmMarket;

    @JsonProperty("upperLevelEventId")
    private Integer upperLevelEventId;

    @JsonProperty("numberOfUpperLevels")
    private Integer numberOfUpperLevels;

    @JsonProperty("marketTime")
    private String marketTime;

    @JsonProperty("numberOfRunners")
    private Integer numberOfRunners;

    public Optional<Integer> getTopLevelEventId() {
        return Optional.ofNullable(topLevelEventId);
    }

    public Optional<String> getMarketTypeName() {
        return Optional.ofNullable(marketTypeName);
    }

    public Optional<String> getMarketType() {
        return Optional.ofNullable(marketType);
    }

    public Optional<String> getMarketId() {
        return Optional.ofNullable(marketId);
    }

    public Optional<Integer> getNumberOfWinners() {
        return Optional.ofNullable(numberOfWinners);
    }

    public Optional<Boolean> getInPlay() {
        return Optional.ofNullable(inPlay);
    }

    public Optional<Integer> getBetDelay() {
        return Optional.ofNullable(betDelay);
    }

    public List<AssociatedMarket> getAssociatedMarkets() {
        return Optional.ofNullable(associatedMarkets).orElse(Collections.emptyList());
    }

    public Optional<String> getKey() {
        return Optional.ofNullable(key);
    }

    public Optional<Boolean> getBspMarket() {
        return Optional.ofNullable(bspMarket);
    }

    public Optional<Integer> getNumberOfActiveRunners() {
        return Optional.ofNullable(numberOfActiveRunners);
    }

    public Optional<String> getBettingType() {
        return Optional.ofNullable(bettingType);
    }

    public Optional<String> getProductType() {
        return Optional.ofNullable(productType);
    }

    public Optional<Boolean> getCanTurnInPlay() {
        return Optional.ofNullable(canTurnInPlay);
    }

    public Optional<Integer> getEventId() {
        return Optional.ofNullable(eventId);
    }

    public Optional<Integer> getCompetitionId() {
        return Optional.ofNullable(competitionId);
    }

    public List<Runner> getRunners() {
        return Optional.ofNullable(runners).orElse(Collections.emptyList());
    }

    public List<String> getMarketLevels() {
        return Optional.ofNullable(marketLevels).orElse(Collections.emptyList());
    }

    public Optional<Integer> getEventTypeId() {
        return Optional.ofNullable(eventTypeId);
    }

    public Optional<String> getMarketName() {
        return Optional.ofNullable(marketName);
    }

    public Optional<Integer> getSortPriority() {
        return Optional.ofNullable(sortPriority);
    }

    public Optional<String> getMarketStatus() {
        return Optional.ofNullable(marketStatus);
    }

    public Optional<Boolean> getSgmMarket() {
        return Optional.ofNullable(sgmMarket);
    }

    public Optional<Integer> getUpperLevelEventId() {
        return Optional.ofNullable(upperLevelEventId);
    }

    public Optional<Integer> getNumberOfUpperLevels() {
        return Optional.ofNullable(numberOfUpperLevels);
    }

    public Optional<String> getMarketTime() {
        return Optional.ofNullable(marketTime);
    }

    public Optional<Integer> getNumberOfRunners() {
        return Optional.ofNullable(numberOfRunners);
    }
}
