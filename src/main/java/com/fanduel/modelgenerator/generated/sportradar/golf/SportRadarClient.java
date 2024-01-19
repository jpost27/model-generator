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
import javax.annotation.processing.Generated;
import reactor.core.publisher.Mono;

@Generated("fanduel-model-generator")
public interface SportRadarClient {
    /**
     * Documentation sample: https://api.sportradar.us/golf/trial/pga/v3/en/2021/02/05/changes.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/golf/{access_level}/{golf_tour}/{version}/{language_code}/{year}/{month}/{day}/changes.{format}?api_key={your_api_key}
     */
    Mono<DailyChangeLogResponse> getDailyChangeLog(String golfTour, Integer year, Integer month,
            Integer day);

    /**
     * Documentation sample: https://api.sportradar.us/golf/trial/v3/en/players/wgr/2021/rankings.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/golf/{access_level}/{version}/{language_code}/players/wgr/{year}/rankings.{format}?api_key={your_api_key}
     */
    Mono<OfficialWorldGolfRankingResponse> getOfficialWorldGolfRanking(Integer year);

    /**
     * Documentation sample: https://api.sportradar.us/golf/trial/v3/en/players/ce5a1cd5-bf8c-4f0d-9903-844ec3aa7e10/profile.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/golf/{access_level}/{version}/{language_code}/players/{player_id}/profile.{format}?api_key={your_api_key}
     */
    Mono<PlayerProfileResponse> getPlayerProfile(String playerId);

    /**
     * Documentation sample: https://api.sportradar.us/golf/trial/v3/en/players/ce5a1cd5-bf8c-4f0d-9903-844ec3aa7e10/live.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/golf/{access_level}/{version}/{language_code}/players/{player_id}/live.{format}?api_key={your_api_key}
     */
    Mono<PlayerProfileLiveResponse> getPlayerProfileLive(String playerId);

    /**
     * Documentation sample: https://api.sportradar.us/golf/trial/pga/v3/en/2021/players/statistics.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/golf/{access_level}/{golf_tour}/{version}/{language_code}/{year}/players/statistics.{format}?api_key={your_api_key}
     */
    Mono<PlayerStatisticsResponse> getPlayerStatistics(String golfTour, Integer year);

    /**
     * Documentation sample: https://api.sportradar.us/golf/trial/pga/v3/en/2021/players/profiles.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/golf/{access_level}/{golf_tour}/{version}/{language_code}/{year}/players/profiles.{format}?api_key={your_api_key}
     */
    Mono<PlayersResponse> getPlayers(String golfTour, Integer year);

    /**
     * Documentation sample: https://api.sportradar.us/golf/trial/pga/v3/en/2020/tournaments/6ba4893c-c82e-4269-a0ab-c99a05c854a8/rounds/1/scores.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/golf/{access_level}/{golf_tour}/{version}/{language_code}/{year}/tournaments/{tournament_id}/{scorecard_type}/{round_number}/scores.{format}?api_key={your_api_key}
     */
    Mono<ScorecardsPerRoundResponse> getScorecardsPerRound(String golfTour, Integer year,
            String tournamentId, String scorecardType, String roundNumber);

    /**
     * Documentation sample: https://api.sportradar.us/golf/trial/v3/en/seasons.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/golf/{access_level}/{version}/{language_code}/seasons.{format}?api_key={your_api_key}
     */
    Mono<SeasonsResponse> getSeasons();

    /**
     * Documentation sample: https://api.sportradar.us/golf/trial/pga/v3/en/2020/tournaments/6ba4893c-c82e-4269-a0ab-c99a05c854a8/rounds/1/teetimes.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/golf/{access_level}/{golf_tour}/{version}/{language_code}/{year}/tournaments/{tournament_id}/{teetime_type}/{round_number}/teetimes.{format}?api_key={your_api_key}
     */
    Mono<TeeTimesPerRoundResponse> getTeeTimesPerRound(String golfTour, Integer year,
            String tournamentId, String teetimeType, String roundNumber);

    /**
     * Documentation sample: https://api.sportradar.us/golf/trial/pga/v3/en/2020/tournaments/6ba4893c-c82e-4269-a0ab-c99a05c854a8/hole-statistics.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/golf/{access_level}/{golf_tour}/{version}/{language_code}/{year}/tournaments/{tournament_id}/hole-statistics.{format}?api_key={your_api_key}
     */
    Mono<TournamentHoleStatisticsResponse> getTournamentHoleStatistics(String golfTour,
            Integer year, String tournamentId);

    /**
     * Documentation sample: https://api.sportradar.us/golf/trial/pga/v3/en/2020/tournaments/6ba4893c-c82e-4269-a0ab-c99a05c854a8/leaderboard.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/golf/{access_level}/{golf_tour}/{version}/{language_code}/{year}/tournaments/{tournament_id}/leaderboard.{format}?api_key={your_api_key}
     */
    Mono<TournamentLeaderboardResponse> getTournamentLeaderboard(String golfTour, Integer year,
            String tournamentId);

    /**
     * Documentation sample: https://api.sportradar.us/golf/trial/pga/v3/en/2021/tournaments/schedule.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/golf/{access_level}/{golf_tour}/{version}/{language_code}/{year}/tournaments/schedule.{format}?api_key={your_api_key}
     */
    Mono<TournamentScheduleResponse> getTournamentSchedule(String golfTour, Integer year);

    /**
     * Documentation sample: https://api.sportradar.us/golf/trial/pga/v3/en/2020/tournaments/6ba4893c-c82e-4269-a0ab-c99a05c854a8/summary.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/golf/{access_level}/{golf_tour}/{version}/{language_code}/{year}/tournaments/{tournament_id}/summary.{format}?api_key={your_api_key}
     */
    Mono<TournamentSummaryResponse> getTournamentSummary(String golfTour, Integer year,
            String tournamentId);
}
