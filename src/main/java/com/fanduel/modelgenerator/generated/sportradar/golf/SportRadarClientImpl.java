package com.fanduel.modelgenerator.generated.sportradar.golf;

import com.fanduel.modelgenerator.generated.sportradar.golf.dailychangelog.DailyChangeLogResponse;
import com.fanduel.modelgenerator.generated.sportradar.golf.officialworldgolfranking.OfficialWorldGolfRankingResponse;
import com.fanduel.modelgenerator.generated.sportradar.golf.playerprofile.PlayerProfileResponse;
import com.fanduel.modelgenerator.generated.sportradar.golf.playerprofilelive.PlayerProfileLiveResponse;
import com.fanduel.modelgenerator.generated.sportradar.golf.players.PlayersResponse;
import com.fanduel.modelgenerator.generated.sportradar.golf.playerstatistics.PlayerStatisticsResponse;
import com.fanduel.modelgenerator.generated.sportradar.golf.scorecardsperround.ScorecardsPerRoundResponse;
import com.fanduel.modelgenerator.generated.sportradar.golf.seasons.SeasonsResponse;
import com.fanduel.modelgenerator.generated.sportradar.golf.teetimesperround.TeeTimesPerRoundResponse;
import com.fanduel.modelgenerator.generated.sportradar.golf.tournamentholestatistics.TournamentHoleStatisticsResponse;
import com.fanduel.modelgenerator.generated.sportradar.golf.tournamentleaderboard.TournamentLeaderboardResponse;
import com.fanduel.modelgenerator.generated.sportradar.golf.tournamentschedule.TournamentScheduleResponse;
import com.fanduel.modelgenerator.generated.sportradar.golf.tournamentsummary.TournamentSummaryResponse;
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

    private final String API_BASE_PATH = "https://api.sportradar.us/golf/";

    private final String API_KEY = "your_key_here";

    private final String ACCESS_LEVEL = "trial";

    private final String VERSION = "v7";

    private final String LANGUAGE_CODE = "en";

    public Mono<DailyChangeLogResponse> getDailyChangeLog(@NonNull String golfTour,
            @NonNull Integer year, @NonNull Integer month, @NonNull Integer day) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment(ACCESS_LEVEL, golfTour, VERSION, LANGUAGE_CODE, year.toString(), month.toString(), day.toString(), "changes.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), DailyChangeLogResponse.class);
    }

    public Mono<OfficialWorldGolfRankingResponse> getOfficialWorldGolfRanking(
            @NonNull Integer year) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment(ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "players", "wgr", year.toString(), "rankings.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), OfficialWorldGolfRankingResponse.class);
    }

    public Mono<PlayerProfileResponse> getPlayerProfile(@NonNull String playerId) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment(ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "players", playerId, "profile.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), PlayerProfileResponse.class);
    }

    public Mono<PlayerProfileLiveResponse> getPlayerProfileLive(@NonNull String playerId) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment(ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "players", playerId, "live.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), PlayerProfileLiveResponse.class);
    }

    public Mono<PlayerStatisticsResponse> getPlayerStatistics(@NonNull String golfTour,
            @NonNull Integer year) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment(ACCESS_LEVEL, golfTour, VERSION, LANGUAGE_CODE, year.toString(), "players", "statistics.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), PlayerStatisticsResponse.class);
    }

    public Mono<PlayersResponse> getPlayers(@NonNull String golfTour, @NonNull Integer year) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment(ACCESS_LEVEL, golfTour, VERSION, LANGUAGE_CODE, year.toString(), "players", "profiles.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), PlayersResponse.class);
    }

    public Mono<ScorecardsPerRoundResponse> getScorecardsPerRound(@NonNull String golfTour,
            @NonNull Integer year, @NonNull String tournamentId, @NonNull String scorecardType,
            @NonNull String roundNumber) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment(ACCESS_LEVEL, golfTour, VERSION, LANGUAGE_CODE, year.toString(), "tournaments", tournamentId, scorecardType, roundNumber, "scores.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), ScorecardsPerRoundResponse.class);
    }

    public Mono<SeasonsResponse> getSeasons() {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment(ACCESS_LEVEL, VERSION, LANGUAGE_CODE, "seasons.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), SeasonsResponse.class);
    }

    public Mono<TeeTimesPerRoundResponse> getTeeTimesPerRound(@NonNull String golfTour,
            @NonNull Integer year, @NonNull String tournamentId, @NonNull String teetimeType,
            @NonNull String roundNumber) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment(ACCESS_LEVEL, golfTour, VERSION, LANGUAGE_CODE, year.toString(), "tournaments", tournamentId, teetimeType, roundNumber, "teetimes.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), TeeTimesPerRoundResponse.class);
    }

    public Mono<TournamentHoleStatisticsResponse> getTournamentHoleStatistics(
            @NonNull String golfTour, @NonNull Integer year, @NonNull String tournamentId) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment(ACCESS_LEVEL, golfTour, VERSION, LANGUAGE_CODE, year.toString(), "tournaments", tournamentId, "hole-statistics.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), TournamentHoleStatisticsResponse.class);
    }

    public Mono<TournamentLeaderboardResponse> getTournamentLeaderboard(@NonNull String golfTour,
            @NonNull Integer year, @NonNull String tournamentId) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment(ACCESS_LEVEL, golfTour, VERSION, LANGUAGE_CODE, year.toString(), "tournaments", tournamentId, "leaderboard.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), TournamentLeaderboardResponse.class);
    }

    public Mono<TournamentScheduleResponse> getTournamentSchedule(@NonNull String golfTour,
            @NonNull Integer year) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment(ACCESS_LEVEL, golfTour, VERSION, LANGUAGE_CODE, year.toString(), "tournaments", "schedule.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), TournamentScheduleResponse.class);
    }

    public Mono<TournamentSummaryResponse> getTournamentSummary(@NonNull String golfTour,
            @NonNull Integer year, @NonNull String tournamentId) {
        UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)
        .pathSegment(ACCESS_LEVEL, golfTour, VERSION, LANGUAGE_CODE, year.toString(), "tournaments", tournamentId, "summary.json")
        .queryParam("api_key", API_KEY)
        .build();
        return fetch(uri.toUri(), TournamentSummaryResponse.class);
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
