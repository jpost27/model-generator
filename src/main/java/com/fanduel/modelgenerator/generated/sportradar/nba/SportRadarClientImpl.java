package com.fanduel.modelgenerator.generated.sportradar.nba;

import com.fanduel.modelgenerator.generated.sportradar.nba.dailychangelog.DailyChangeLogResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.dailyschedule.DailyScheduleResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.dailytransfers.DailyTransfersResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.draftsummary.DraftSummaryResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.freeagents.FreeAgentsResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.gameboxscore.GameBoxscoreResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.gamesummary.GameSummaryResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.injuries.InjuriesResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.leaguehierarchy.LeagueHierarchyResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.leagueleaders.LeagueLeadersResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.nbaapiv7simulations.NbaApiV7SimulationsResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.playbyplay.PlayByPlayResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.playerprofile.PlayerProfileResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.playintournament.PlayInTournamentResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.prospects.ProspectsResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.rankings.RankingsResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.schedule.ScheduleResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.seasonalstatisticsseasontodate.SeasonalStatisticsSeasonToDateResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.seasons.SeasonsResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.seriesschedule.SeriesScheduleResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.seriesstatistics.SeriesStatisticsResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.splitsgame.SplitsGameResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.splitshierarchy.SplitsHierarchyResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.splitsingame.SplitsInGameResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.splitsschedule.SplitsScheduleResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.standings.StandingsResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.teamdraftsummary.TeamDraftSummaryResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.teamprofilerosters.TeamProfileRostersResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.topprospects.TopProspectsResponse;
import com.fanduel.modelgenerator.generated.sportradar.nba.trades.TradesResponse;
import java.lang.Integer;
import java.lang.String;
import java.lang.reflect.Type;
import java.net.URI;
import javax.annotation.processing.Generated;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.lang.NonNull;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import reactor.core.publisher.Mono;

@Generated("fanduel-model-generator")
@RequiredArgsConstructor
public class SportRadarClientImpl {
    private final WebClient webClient;

    private final String API_BASE_PATH = "https://api.sportradar.com/";

    private final String API_KEY = "your_key_here";

    private final String ACCESS_LEVEL = "trial";

    private final String VERSION = "v7";

    private final String LANGUAGE_CODE = "en";

    public Mono<NbaApiV7SimulationsResponse> getNbaApiV7Simulations() {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nba", "simulation", VERSION, LANGUAGE_CODE, "games", "2017", "SIM", "schedule.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), NbaApiV7SimulationsResponse.class);
    }

    public Mono<PlayInTournamentResponse> getPlayInTournament(@NonNull String seasonYear) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nba", ACCESS_LEVEL, "v7", LANGUAGE_CODE, "series", seasonYear, "PST", "schedule.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), PlayInTournamentResponse.class);
    }

    public Mono<DailyChangeLogResponse> getDailyChangeLog(@NonNull Integer year,
            @NonNull Integer month, @NonNull Integer day) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nba", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "league", year.toString(), month.toString(), day.toString(), "changes.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), DailyChangeLogResponse.class);
    }

    public Mono<DailyScheduleResponse> getDailySchedule(@NonNull Integer year,
            @NonNull Integer month, @NonNull Integer day) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nba", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "games", year.toString(), month.toString(), day.toString(), "schedule.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), DailyScheduleResponse.class);
    }

    public Mono<DailyTransfersResponse> getDailyTransfers(@NonNull Integer year,
            @NonNull Integer month, @NonNull Integer day) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nba", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "league", year.toString(), month.toString(), day.toString(), "transfers.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), DailyTransfersResponse.class);
    }

    public Mono<DraftSummaryResponse> getDraftSummary(@NonNull Integer year) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("draft", "nba", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, year.toString(), "draft.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), DraftSummaryResponse.class);
    }

    public Mono<FreeAgentsResponse> getFreeAgents() {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nba", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "league", "free_agents.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), FreeAgentsResponse.class);
    }

    public Mono<GameBoxscoreResponse> getGameBoxscore(@NonNull String gameId) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nba", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "games", gameId, "boxscore.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), GameBoxscoreResponse.class);
    }

    public Mono<GameSummaryResponse> getGameSummary(@NonNull String gameId) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nba", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "games", gameId, "summary.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), GameSummaryResponse.class);
    }

    public Mono<InjuriesResponse> getInjuries() {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nba", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "league", "injuries.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), InjuriesResponse.class);
    }

    public Mono<LeagueHierarchyResponse> getLeagueHierarchy() {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nba", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "league", "hierarchy.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), LeagueHierarchyResponse.class);
    }

    public Mono<LeagueLeadersResponse> getLeagueLeaders(@NonNull String seasonYear,
            @NonNull String nbaSeason) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nba", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "seasons", seasonYear, nbaSeason, "leaders.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), LeagueLeadersResponse.class);
    }

    public Mono<PlayByPlayResponse> getPlayByPlay(@NonNull String gameId) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nba", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "games", gameId, "pbp.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), PlayByPlayResponse.class);
    }

    public Mono<PlayerProfileResponse> getPlayerProfile(@NonNull String playerId) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nba", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "players", playerId, "profile.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), PlayerProfileResponse.class);
    }

    public Mono<ProspectsResponse> getProspects(@NonNull Integer year) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("draft", "nba", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, year.toString(), "prospects.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), ProspectsResponse.class);
    }

    public Mono<RankingsResponse> getRankings(@NonNull String seasonYear,
            @NonNull String nbaSeason) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nba", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "seasons", seasonYear, nbaSeason, "rankings.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), RankingsResponse.class);
    }

    public Mono<ScheduleResponse> getSchedule(@NonNull String seasonYear,
            @NonNull String nbaSeason) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nba", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "games", seasonYear, nbaSeason, "schedule.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), ScheduleResponse.class);
    }

    public Mono<SeasonalStatisticsSeasonToDateResponse> getSeasonalStatisticsSeasonToDate(
            @NonNull String seasonYear, @NonNull String nbaSeason, @NonNull String teamId) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nba", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "seasons", seasonYear, nbaSeason, "teams", teamId, "statistics.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), SeasonalStatisticsSeasonToDateResponse.class);
    }

    public Mono<SeasonsResponse> getSeasons() {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nba", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "league", "seasons.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), SeasonsResponse.class);
    }

    public Mono<SeriesScheduleResponse> getSeriesSchedule(@NonNull String seasonYear,
            @NonNull String nbaSeason) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nba", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "series", seasonYear, nbaSeason, "schedule.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), SeriesScheduleResponse.class);
    }

    public Mono<SeriesStatisticsResponse> getSeriesStatistics(@NonNull String seriesId,
            @NonNull String teamId) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nba", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "series", seriesId, "teams", teamId, "statistics.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), SeriesStatisticsResponse.class);
    }

    public Mono<SplitsGameResponse> getSplitsGame(@NonNull String seasonYear,
            @NonNull String nbaSeason, @NonNull String teamId) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nba", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "seasons", seasonYear, nbaSeason, "teams", teamId, "splits", "game.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), SplitsGameResponse.class);
    }

    public Mono<SplitsHierarchyResponse> getSplitsHierarchy(@NonNull String seasonYear,
            @NonNull String nbaSeason, @NonNull String teamId) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nba", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "seasons", seasonYear, nbaSeason, "teams", teamId, "splits", "hierarchy.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), SplitsHierarchyResponse.class);
    }

    public Mono<SplitsInGameResponse> getSplitsInGame(@NonNull String seasonYear,
            @NonNull String nbaSeason, @NonNull String teamId) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nba", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "seasons", seasonYear, nbaSeason, "teams", teamId, "splits", "ingame.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), SplitsInGameResponse.class);
    }

    public Mono<SplitsScheduleResponse> getSplitsSchedule(@NonNull String seasonYear,
            @NonNull String nbaSeason, @NonNull String teamId) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nba", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "seasons", seasonYear, nbaSeason, "teams", teamId, "splits", "schedule.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), SplitsScheduleResponse.class);
    }

    public Mono<StandingsResponse> getStandings(@NonNull String seasonYear,
            @NonNull String nbaSeason) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nba", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "seasons", seasonYear, nbaSeason, "standings.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), StandingsResponse.class);
    }

    public Mono<TeamDraftSummaryResponse> getTeamDraftSummary(@NonNull Integer year,
            @NonNull String teamId) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("draft", "nba", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, year.toString(), "teams", teamId, "draft.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), TeamDraftSummaryResponse.class);
    }

    public Mono<TeamProfileRostersResponse> getTeamProfileRosters(@NonNull String teamId) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nba", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "teams", teamId, "profile.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), TeamProfileRostersResponse.class);
    }

    public Mono<TopProspectsResponse> getTopProspects(@NonNull Integer year) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("draft", "nba", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, year.toString(), "top_prospects.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), TopProspectsResponse.class);
    }

    public Mono<TradesResponse> getTrades(@NonNull Integer year) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("draft", "nba", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, year.toString(), "trades.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), TradesResponse.class);
    }

    <T> Mono<T> fetch(URI uri, Class<T> returnType) {
        return fetch(uri, new ParameterizedTypeReference<>() {
                    @Override
                    public Type getType() {
                        return super.getType();
                    }
                });
    }

    <T> Mono<T> fetch(URI uri, ParameterizedTypeReference<T> returnType) {
        return webClient.get()
                        .uri(uri)
                        .retrieve()
                        .bodyToMono(returnType);
    }
}
