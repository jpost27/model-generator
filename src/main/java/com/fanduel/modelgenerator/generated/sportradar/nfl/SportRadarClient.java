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
import javax.annotation.processing.Generated;
import reactor.core.publisher.Mono;

@Generated("fanduel-model-generator")
public interface SportRadarClient {
    /**
     * Documentation sample: https://api.sportradar.us/nfl/official/trial/v7/en/games/current_season/schedule.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/nfl/official/{access_level}/{version}/{language_code}/games/current_season/schedule.{format}?api_key={your_api_key}
     */
    Mono<CurrentSeasonScheduleResponse> getCurrentSeasonSchedule();

    /**
     * Documentation sample: https://api.sportradar.us/nfl/official/trial/v7/en/games/current_week/schedule.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/nfl/official/{access_level}/{version}/{language_code}/games/current_week/schedule.{format}?api_key={your_api_key}
     */
    Mono<CurrentWeekScheduleResponse> getCurrentWeekSchedule();

    /**
     * Documentation sample: https://api.sportradar.us/nfl/official/trial/v7/en/league/2021/08/31/changes.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/nfl/official/{access_level}/{version}/{language_code}/league/{year}/{month}/{day}/changes.{format}?api_key={your_api_key}
     */
    Mono<DailyChangeLogResponse> getDailyChangeLog(Integer year, Integer month, Integer day);

    /**
     * Documentation sample: https://api.sportradar.us/nfl/official/trial/v7/en/league/2022/07/14/transactions.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/nfl/official/{access_level}/{version}/{language_code}/league/{year}/{month}/{day}/transactions.{format}?api_key={your_api_key}
     */
    Mono<DailyTransactionsResponse> getDailyTransactions(Integer year, Integer month, Integer day);

    /**
     * Documentation sample: https://api.sportradar.us/draft/nfl/trial/v1/en/2021/draft.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/draft/nfl/{access_level}/{version}/{language_code}/{year}/draft.{format}?api_key={your_api_key}
     */
    Mono<DraftSummaryResponse> getDraftSummary(Integer year);

    /**
     * Documentation sample: https://api.sportradar.us/nfl/official/trial/v7/en/games/7d06369a-382a-448a-b295-6da9eab53245/boxscore.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/nfl/official/{access_level}/{version}/{language_code}/games/{game_id}/boxscore.{format}?api_key={your_api_key}
     */
    Mono<GameBoxscoreResponse> getGameBoxscore(String gameId);

    /**
     * Documentation sample: https://api.sportradar.us/nfl/official/trial/v7/en/games/7d06369a-382a-448a-b295-6da9eab53245/roster.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/nfl/official/{access_level}/{version}/{language_code}/games/{game_id}/roster.{format}?api_key={your_api_key}
     */
    Mono<GameRosterResponse> getGameRoster(String gameId);

    /**
     * Documentation sample: https://api.sportradar.us/nfl/official/trial/v7/en/games/7d06369a-382a-448a-b295-6da9eab53245/statistics.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/nfl/official/{access_level}/{version}/{language_code}/games/{game_id}/statistics.{format}?api_key={your_api_key}
     */
    Mono<GameStatisticsResponse> getGameStatistics(String gameId);

    /**
     * Documentation sample: https://api.sportradar.us/nfl/official/trial/v7/en/league/hierarchy.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/nfl/official/{access_level}/{version}/{language_code}/league/hierarchy.{format}?api_key={your_api_key}
     */
    Mono<LeagueHierarchyResponse> getLeagueHierarchy();

    /**
     * Documentation sample: https://api.sportradar.us/nfl/official/trial/v7/en/games/7d06369a-382a-448a-b295-6da9eab53245/pbp.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/nfl/official/{access_level}/{version}/{language_code}/games/{game_id}/pbp.{format}?api_key={your_api_key}
     */
    Mono<PlayByPlayResponse> getPlayByPlay(String gameId);

    /**
     * Documentation sample: https://api.sportradar.us/nfl/official/trial/v7/en/players/0acdcd3b-5442-4311-a139-ae7c506faf88/profile.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/nfl/official/{access_level}/{version}/{language_code}/players/{player_id}/profile.{format}?api_key={your_api_key}
     */
    Mono<PlayerProfileResponse> getPlayerProfile(String playerId);

    /**
     * Documentation sample: https://api.sportradar.us/nfl/official/trial/v7/en/seasons/2021/REG/standings/season.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/nfl/official/{access_level}/{version}/{language_code}/seasons/{year}/{nfl_season}/standings/season.{format}?api_key={your_api_key}
     */
    Mono<PostgameStandingsResponse> getPostgameStandings(Integer year, String nflSeason);

    /**
     * Documentation sample: https://api.sportradar.us/draft/nfl/trial/v1/en/2021/prospects.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/draft/nfl/{access_level}/{version}/{language_code}/{year}/prospects.{format}?api_key={your_api_key}
     */
    Mono<ProspectsResponse> getProspects(Integer year);

    /**
     * Documentation sample: https://api.sportradar.us/nfl/official/trial/v7/en/games/2021/reg/schedule.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/nfl/official/{access_level}/{version}/{language_code}/games/{year}/{nfl_season}/schedule.{format}?api_key={your_api_key}
     */
    Mono<SeasonScheduleResponse> getSeasonSchedule(Integer year, String nflSeason);

    /**
     * Documentation sample: https://api.sportradar.us/nfl/official/trial/v7/en/seasons/2021/REG/teams/0d855753-ea21-4953-89f9-0e20aff9eb73/statistics.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/nfl/official/{access_level}/{version}/{language_code}/seasons/{year}/{nfl_season}/teams/{team_id}/statistics.{format}?api_key={your_api_key}
     */
    Mono<SeasonalStatisticsResponse> getSeasonalStatistics(Integer year, String nflSeason,
            String teamId);

    /**
     * Documentation sample: https://api.sportradar.us/nfl/official/trial/v7/en/league/seasons.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/nfl/official/{access_level}/{version}/{language_code}/league/seasons.{format}?api_key={your_api_key}
     */
    Mono<SeasonsResponse> getSeasons();

    /**
     * Documentation sample: https://api.sportradar.us/draft/nfl/trial/v1/en/2021/teams/d5a2eb42-8065-4174-ab79-0a6fa820e35e/draft.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/draft/nfl/{access_level}/{version}/{language_code}/{year}/teams/{team_id}/draft.{format}?api_key={your_api_key}
     */
    Mono<TeamDraftSummaryResponse> getTeamDraftSummary(Integer year, String teamId);

    /**
     * Documentation sample: https://api.sportradar.us/nfl/official/trial/v7/en/teams/0d855753-ea21-4953-89f9-0e20aff9eb73/profile.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/nfl/official/{access_level}/{version}/{language_code}/teams/{team_id}/profile.{format}?api_key={your_api_key}
     */
    Mono<TeamProfileResponse> getTeamProfile(String teamId);

    /**
     * Documentation sample: https://api.sportradar.us/nfl/official/trial/v7/en/teams/0d855753-ea21-4953-89f9-0e20aff9eb73/full_roster.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/nfl/official/{access_level}/{version}/{language_code}/teams/{team_id}/full_roster.{format}?api_key={your_api_key}
     */
    Mono<TeamRosterResponse> getTeamRoster(String teamId);

    /**
     * Documentation sample: https://api.sportradar.us/draft/nfl/trial/v1/en/2021/top_prospects.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/draft/nfl/{access_level}/{version}/{language_code}/{year}/top_prospects.{format}?api_key={your_api_key}
     */
    Mono<TopProspectsResponse> getTopProspects(Integer year);

    /**
     * Documentation sample: https://api.sportradar.us/draft/nfl/trial/v1/en/2021/trades.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/draft/nfl/{access_level}/{version}/{language_code}/{year}/trades.{format}?api_key={your_api_key}
     */
    Mono<TradesResponse> getTrades(Integer year);

    /**
     * Documentation sample: https://api.sportradar.us/nfl/official/trial/v7/en/seasons/2021/REG/01/depth_charts.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/nfl/official/{access_level}/{version}/{language_code}/seasons/{year}/{nfl_season}/{nfl_season_week}/depth_charts.{format}?api_key={your_api_key}
     */
    Mono<WeeklyDepthChartsResponse> getWeeklyDepthCharts(Integer year, String nflSeason,
            String nflSeasonWeek);

    /**
     * Documentation sample: https://api.sportradar.us/nfl/official/trial/v7/en/seasons/2021/REG/01/injuries.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/nfl/official/{access_level}/{version}/{language_code}/seasons/{year}/{nfl_season}/{nfl_season_week}/injuries.{format}?api_key={your_api_key}
     */
    Mono<WeeklyInjuriesResponse> getWeeklyInjuries(Integer year, String nflSeason,
            String nflSeasonWeek);

    /**
     * Documentation sample: https://api.sportradar.us/nfl/official/trial/v7/en/games/2021/REG/01/schedule.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.us/nfl/official/{access_level}/{version}/{language_code}/games/{year}/{nfl_season}/{nfl_season_week}/schedule.{format}?api_key={your_api_key}
     */
    Mono<WeeklyScheduleResponse> getWeeklySchedule(Integer year, String nflSeason,
            String nflSeasonWeek);
}
