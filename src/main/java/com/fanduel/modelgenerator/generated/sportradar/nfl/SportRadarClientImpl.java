package com.fanduel.modelgenerator.generated.sportradar.nfl;

import com.fanduel.modelgenerator.generated.sportradar.nfl.currentseasonschedule.CurrentSeasonScheduleResponse;
import com.fanduel.modelgenerator.generated.sportradar.nfl.currentweekschedule.CurrentWeekScheduleResponse;
import com.fanduel.modelgenerator.generated.sportradar.nfl.dailychangelog.DailyChangeLogResponse;
import com.fanduel.modelgenerator.generated.sportradar.nfl.dailytransactions.DailyTransactionsResponse;
import com.fanduel.modelgenerator.generated.sportradar.nfl.draftsummary.DraftSummaryResponse;
import com.fanduel.modelgenerator.generated.sportradar.nfl.gameboxscore.GameBoxscoreResponse;
import com.fanduel.modelgenerator.generated.sportradar.nfl.gameroster.GameRosterResponse;
import com.fanduel.modelgenerator.generated.sportradar.nfl.gamestatistics.GameStatisticsResponse;
import com.fanduel.modelgenerator.generated.sportradar.nfl.leaguehierarchy.LeagueHierarchyResponse;
import com.fanduel.modelgenerator.generated.sportradar.nfl.playbyplay.PlayByPlayResponse;
import com.fanduel.modelgenerator.generated.sportradar.nfl.playerprofile.PlayerProfileResponse;
import com.fanduel.modelgenerator.generated.sportradar.nfl.postgamestandings.PostgameStandingsResponse;
import com.fanduel.modelgenerator.generated.sportradar.nfl.prospects.ProspectsResponse;
import com.fanduel.modelgenerator.generated.sportradar.nfl.seasonalstatistics.SeasonalStatisticsResponse;
import com.fanduel.modelgenerator.generated.sportradar.nfl.seasons.SeasonsResponse;
import com.fanduel.modelgenerator.generated.sportradar.nfl.seasonschedule.SeasonScheduleResponse;
import com.fanduel.modelgenerator.generated.sportradar.nfl.teamdraftsummary.TeamDraftSummaryResponse;
import com.fanduel.modelgenerator.generated.sportradar.nfl.teamprofile.TeamProfileResponse;
import com.fanduel.modelgenerator.generated.sportradar.nfl.teamroster.TeamRosterResponse;
import com.fanduel.modelgenerator.generated.sportradar.nfl.topprospects.TopProspectsResponse;
import com.fanduel.modelgenerator.generated.sportradar.nfl.trades.TradesResponse;
import com.fanduel.modelgenerator.generated.sportradar.nfl.weeklydepthcharts.WeeklyDepthChartsResponse;
import com.fanduel.modelgenerator.generated.sportradar.nfl.weeklyinjuries.WeeklyInjuriesResponse;
import com.fanduel.modelgenerator.generated.sportradar.nfl.weeklyschedule.WeeklyScheduleResponse;
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

    private final String API_BASE_PATH = "https://api.sportradar.us/";

    private final String API_KEY = "your_key_here";

    private final String ACCESS_LEVEL = "trial";

    private final String VERSION = "v7";

    private final String LANGUAGE_CODE = "en";

    public Mono<CurrentSeasonScheduleResponse> getCurrentSeasonSchedule() {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nfl", "official", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "games", "current_season", "schedule.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), CurrentSeasonScheduleResponse.class);
    }

    public Mono<CurrentWeekScheduleResponse> getCurrentWeekSchedule() {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nfl", "official", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "games", "current_week", "schedule.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), CurrentWeekScheduleResponse.class);
    }

    public Mono<DailyChangeLogResponse> getDailyChangeLog(@NonNull Integer year,
            @NonNull Integer month, @NonNull Integer day) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nfl", "official", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "league", year.toString(), month.toString(), day.toString(), "changes.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), DailyChangeLogResponse.class);
    }

    public Mono<DailyTransactionsResponse> getDailyTransactions(@NonNull Integer year,
            @NonNull Integer month, @NonNull Integer day) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nfl", "official", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "league", year.toString(), month.toString(), day.toString(), "transactions.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), DailyTransactionsResponse.class);
    }

    public Mono<DraftSummaryResponse> getDraftSummary(@NonNull Integer year) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("draft", "nfl", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, year.toString(), "draft.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), DraftSummaryResponse.class);
    }

    public Mono<GameBoxscoreResponse> getGameBoxscore(@NonNull String gameId) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nfl", "official", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "games", gameId, "boxscore.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), GameBoxscoreResponse.class);
    }

    public Mono<GameRosterResponse> getGameRoster(@NonNull String gameId) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nfl", "official", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "games", gameId, "roster.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), GameRosterResponse.class);
    }

    public Mono<GameStatisticsResponse> getGameStatistics(@NonNull String gameId) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nfl", "official", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "games", gameId, "statistics.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), GameStatisticsResponse.class);
    }

    public Mono<LeagueHierarchyResponse> getLeagueHierarchy() {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nfl", "official", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "league", "hierarchy.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), LeagueHierarchyResponse.class);
    }

    public Mono<PlayByPlayResponse> getPlayByPlay(@NonNull String gameId) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nfl", "official", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "games", gameId, "pbp.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), PlayByPlayResponse.class);
    }

    public Mono<PlayerProfileResponse> getPlayerProfile(@NonNull String playerId) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nfl", "official", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "players", playerId, "profile.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), PlayerProfileResponse.class);
    }

    public Mono<PostgameStandingsResponse> getPostgameStandings(@NonNull Integer year,
            @NonNull String nflSeason) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nfl", "official", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "seasons", year.toString(), nflSeason, "standings", "season.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), PostgameStandingsResponse.class);
    }

    public Mono<ProspectsResponse> getProspects(@NonNull Integer year) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("draft", "nfl", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, year.toString(), "prospects.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), ProspectsResponse.class);
    }

    public Mono<SeasonScheduleResponse> getSeasonSchedule(@NonNull Integer year,
            @NonNull String nflSeason) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nfl", "official", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "games", year.toString(), nflSeason, "schedule.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), SeasonScheduleResponse.class);
    }

    public Mono<SeasonalStatisticsResponse> getSeasonalStatistics(@NonNull Integer year,
            @NonNull String nflSeason, @NonNull String teamId) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nfl", "official", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "seasons", year.toString(), nflSeason, "teams", teamId, "statistics.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), SeasonalStatisticsResponse.class);
    }

    public Mono<SeasonsResponse> getSeasons() {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nfl", "official", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "league", "seasons.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), SeasonsResponse.class);
    }

    public Mono<TeamDraftSummaryResponse> getTeamDraftSummary(@NonNull Integer year,
            @NonNull String teamId) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("draft", "nfl", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, year.toString(), "teams", teamId, "draft.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), TeamDraftSummaryResponse.class);
    }

    public Mono<TeamProfileResponse> getTeamProfile(@NonNull String teamId) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nfl", "official", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "teams", teamId, "profile.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), TeamProfileResponse.class);
    }

    public Mono<TeamRosterResponse> getTeamRoster(@NonNull String teamId) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nfl", "official", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "teams", teamId, "full_roster.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), TeamRosterResponse.class);
    }

    public Mono<TopProspectsResponse> getTopProspects(@NonNull Integer year) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("draft", "nfl", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, year.toString(), "top_prospects.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), TopProspectsResponse.class);
    }

    public Mono<TradesResponse> getTrades(@NonNull Integer year) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("draft", "nfl", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, year.toString(), "trades.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), TradesResponse.class);
    }

    public Mono<WeeklyDepthChartsResponse> getWeeklyDepthCharts(@NonNull Integer year,
            @NonNull String nflSeason, @NonNull String nflSeasonWeek) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nfl", "official", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "seasons", year.toString(), nflSeason, nflSeasonWeek, "depth_charts.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), WeeklyDepthChartsResponse.class);
    }

    public Mono<WeeklyInjuriesResponse> getWeeklyInjuries(@NonNull Integer year,
            @NonNull String nflSeason, @NonNull String nflSeasonWeek) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nfl", "official", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "seasons", year.toString(), nflSeason, nflSeasonWeek, "injuries.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), WeeklyInjuriesResponse.class);
    }

    public Mono<WeeklyScheduleResponse> getWeeklySchedule(@NonNull Integer year,
            @NonNull String nflSeason, @NonNull String nflSeasonWeek) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment("nfl", "official", ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "games", year.toString(), nflSeason, nflSeasonWeek, "schedule.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), WeeklyScheduleResponse.class);
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
