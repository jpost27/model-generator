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
import javax.annotation.processing.Generated;
import reactor.core.publisher.Mono;

@Generated("fanduel-model-generator")
public interface SportRadarClient {
    /**
     * Documentation sample: null
     * Variable URL: https://api.sportradar.com/nba/simulation/{version}/{language_code}/games/2017/SIM/schedule.{format}?api_key={your_api_key}
     */
    Mono<NbaApiV7SimulationsResponse> getNbaApiV7Simulations();

    /**
     * Documentation sample: https://api.sportradar.com/nba/trial/v7/en/games/2021/PIT/schedule.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/nba/{access_level}/v7/{language_code}/series/{season_year}/PST/schedule.{format}?api_key={your_api_key}
     */
    Mono<PlayInTournamentResponse> getPlayInTournament(String seasonYear);

    /**
     * Documentation sample: https://api.sportradar.com/nba/trial/v7/en/league/2022/01/27/changes.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/nba/{access_level}/{version}/{language_code}/league/{year}/{month}/{day}/changes.{format}?api_key={your_api_key}
     */
    Mono<DailyChangeLogResponse> getDailyChangeLog(Integer year, Integer month, Integer day);

    /**
     * Documentation sample: https://api.sportradar.com/nba/trial/v7/en/games/2022/01/22/schedule.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/nba/{access_level}/{version}/{language_code}/games/{year}/{month}/{day}/schedule.{format}?api_key={your_api_key}
     */
    Mono<DailyScheduleResponse> getDailySchedule(Integer year, Integer month, Integer day);

    /**
     * Documentation sample: https://api.sportradar.com/nba/trial/v7/en/league/2022/01/22/transfers.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/nba/{access_level}/{version}/{language_code}/league/{year}/{month}/{day}/transfers.{format}?api_key={your_api_key}
     */
    Mono<DailyTransfersResponse> getDailyTransfers(Integer year, Integer month, Integer day);

    /**
     * Documentation sample: https://api.sportradar.com/draft/nba/trial/v1/en/2021/draft.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/draft/nba/{access_level}/{version}/{language_code}/{year}/draft.{format}?api_key={your_api_key}
     */
    Mono<DraftSummaryResponse> getDraftSummary(Integer year);

    /**
     * Documentation sample: https://api.sportradar.com/nba/trial/v7/en/league/free_agents.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/nba/{access_level}/{version}/{language_code}/league/free_agents.{format}?api_key={your_api_key}
     */
    Mono<FreeAgentsResponse> getFreeAgents();

    /**
     * Documentation sample: https://api.sportradar.com/nba/trial/v7/en/games/1af034f5-e46e-4b8a-9c82-f91b41f6098e/boxscore.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/nba/{access_level}/{version}/{language_code}/games/{game_id}/boxscore.{format}?api_key={your_api_key}
     */
    Mono<GameBoxscoreResponse> getGameBoxscore(String gameId);

    /**
     * Documentation sample: https://api.sportradar.com/nba/trial/v7/en/games/1af034f5-e46e-4b8a-9c82-f91b41f6098e/summary.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/nba/{access_level}/{version}/{language_code}/games/{game_id}/summary.{format}?api_key={your_api_key}
     */
    Mono<GameSummaryResponse> getGameSummary(String gameId);

    /**
     * Documentation sample: https://api.sportradar.com/nba/trial/v7/en/league/injuries.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/nba/{access_level}/{version}/{language_code}/league/injuries.{format}?api_key={your_api_key}
     */
    Mono<InjuriesResponse> getInjuries();

    /**
     * Documentation sample: https://api.sportradar.com/nba/trial/v7/en/league/hierarchy.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/nba/{access_level}/{version}/{language_code}/league/hierarchy.{format}?api_key={your_api_key}
     */
    Mono<LeagueHierarchyResponse> getLeagueHierarchy();

    /**
     * Documentation sample: https://api.sportradar.com/nba/trial/v7/en/seasons/2021/REG/leaders.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/nba/{access_level}/{version}/{language_code}/seasons/{season_year}/{nba_season}/leaders.{format}?api_key={your_api_key}
     */
    Mono<LeagueLeadersResponse> getLeagueLeaders(String seasonYear, String nbaSeason);

    /**
     * Documentation sample: https://api.sportradar.com/nba/trial/v7/en/games/1af034f5-e46e-4b8a-9c82-f91b41f6098e/pbp.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/nba/{access_level}/{version}/{language_code}/games/{game_id}/pbp.{format}?api_key={your_api_key}
     */
    Mono<PlayByPlayResponse> getPlayByPlay(String gameId);

    /**
     * Documentation sample: https://api.sportradar.com/nba/trial/v7/en/players/8ec91366-faea-4196-bbfd-b8fab7434795/profile.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/nba/{access_level}/{version}/{language_code}/players/{player_id}/profile.{format}?api_key={your_api_key}
     */
    Mono<PlayerProfileResponse> getPlayerProfile(String playerId);

    /**
     * Documentation sample: https://api.sportradar.com/draft/nba/trial/v1/en/2021/prospects.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/draft/nba/{access_level}/{version}/{language_code}/{year}/prospects.{format}?api_key={your_api_key}
     */
    Mono<ProspectsResponse> getProspects(Integer year);

    /**
     * Documentation sample: https://api.sportradar.com/nba/trial/v7/en/seasons/2021/REG/rankings.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/nba/{access_level}/{version}/{language_code}/seasons/{season_year}/{nba_season}/rankings.{format}?api_key={your_api_key}
     */
    Mono<RankingsResponse> getRankings(String seasonYear, String nbaSeason);

    /**
     * Documentation sample: https://api.sportradar.com/nba/trial/v7/en/games/2021/REG/schedule.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/nba/{access_level}/{version}/{language_code}/games/{season_year}/{nba_season}/schedule.{format}?api_key={your_api_key}
     */
    Mono<ScheduleResponse> getSchedule(String seasonYear, String nbaSeason);

    /**
     * Documentation sample: https://api.sportradar.com/nba/trial/v7/en/seasons/2021/REG/teams/583eca2f-fb46-11e1-82cb-f4ce4684ea4c/statistics.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/nba/{access_level}/{version}/{language_code}/seasons/{season_year}/{nba_season}/teams/{team_id}/statistics.{format}?api_key={your_api_key}
     */
    Mono<SeasonalStatisticsSeasonToDateResponse> getSeasonalStatisticsSeasonToDate(
            String seasonYear, String nbaSeason, String teamId);

    /**
     * Documentation sample: https://api.sportradar.com/nba/trial/v7/en/league/seasons.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/nba/{access_level}/{version}/{language_code}/league/seasons.{format}?api_key={your_api_key}
     */
    Mono<SeasonsResponse> getSeasons();

    /**
     * Documentation sample: https://api.sportradar.com/nba/trial/v7/en/series/2020/PST/schedule.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/nba/{access_level}/{version}/{language_code}/series/{season_year}/{nba_season}/schedule.{format}?api_key={your_api_key}
     */
    Mono<SeriesScheduleResponse> getSeriesSchedule(String seasonYear, String nbaSeason);

    /**
     * Documentation sample: https://api.sportradar.com/nba/trial/v7/en/series/ede9d891-2f05-4baf-82ea-f813221aa052/teams/583ecefd-fb46-11e1-82cb-f4ce4684ea4c/statistics.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/nba/{access_level}/{version}/{language_code}/series/{series_id}/teams/{team_id}/statistics.{format}?api_key={your_api_key}
     */
    Mono<SeriesStatisticsResponse> getSeriesStatistics(String seriesId, String teamId);

    /**
     * Documentation sample: https://api.sportradar.com/nba/trial/v7/en/seasons/2020/PST/teams/583ece50-fb46-11e1-82cb-f4ce4684ea4c/splits/game.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/nba/{access_level}/{version}/{language_code}/seasons/{season_year}/{nba_season}/teams/{team_id}/splits/game.{format}?api_key={your_api_key}
     */
    Mono<SplitsGameResponse> getSplitsGame(String seasonYear, String nbaSeason, String teamId);

    /**
     * Documentation sample: https://api.sportradar.com/nba/trial/v7/en/seasons/2021/REG/teams/583ec825-fb46-11e1-82cb-f4ce4684ea4c/splits/hierarchy.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/nba/{access_level}/{version}/{language_code}/seasons/{season_year}/{nba_season}/teams/{team_id}/splits/hierarchy.{format}?api_key={your_api_key}
     */
    Mono<SplitsHierarchyResponse> getSplitsHierarchy(String seasonYear, String nbaSeason,
            String teamId);

    /**
     * Documentation sample: https://api.sportradar.com/nba/trial/v7/en/seasons/2021/REG/teams/583ec825-fb46-11e1-82cb-f4ce4684ea4c/splits/ingame.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/nba/{access_level}/{version}/{language_code}/seasons/{season_year}/{nba_season}/teams/{team_id}/splits/ingame.{format}?api_key={your_api_key}
     */
    Mono<SplitsInGameResponse> getSplitsInGame(String seasonYear, String nbaSeason, String teamId);

    /**
     * Documentation sample: https://api.sportradar.com/nba/trial/v7/en/seasons/2021/REG/teams/583ec825-fb46-11e1-82cb-f4ce4684ea4c/splits/schedule.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/nba/{access_level}/{version}/{language_code}/seasons/{season_year}/{nba_season}/teams/{team_id}/splits/schedule.{format}?api_key={your_api_key}
     */
    Mono<SplitsScheduleResponse> getSplitsSchedule(String seasonYear, String nbaSeason,
            String teamId);

    /**
     * Documentation sample: https://api.sportradar.com/nba/trial/v7/en/seasons/2021/REG/standings.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/nba/{access_level}/{version}/{language_code}/seasons/{season_year}/{nba_season}/standings.{format}?api_key={your_api_key}
     */
    Mono<StandingsResponse> getStandings(String seasonYear, String nbaSeason);

    /**
     * Documentation sample: https://api.sportradar.com/draft/nba/trial/v1/en/2021/teams/583ecc9a-fb46-11e1-82cb-f4ce4684ea4c/draft.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/draft/nba/{access_level}/{version}/{language_code}/{year}/teams/{team_id}/draft.{format}?api_key={your_api_key}
     */
    Mono<TeamDraftSummaryResponse> getTeamDraftSummary(Integer year, String teamId);

    /**
     * Documentation sample: https://api.sportradar.com/nba/trial/v7/en/teams/583eca2f-fb46-11e1-82cb-f4ce4684ea4c/profile.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/nba/{access_level}/{version}/{language_code}/teams/{team_id}/profile.{format}?api_key={your_api_key}
     */
    Mono<TeamProfileRostersResponse> getTeamProfileRosters(String teamId);

    /**
     * Documentation sample: https://api.sportradar.com/draft/nba/trial/v1/en/2021/top_prospects.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/draft/nba/{access_level}/{version}/{language_code}/{year}/top_prospects.{format}?api_key={your_api_key}
     */
    Mono<TopProspectsResponse> getTopProspects(Integer year);

    /**
     * Documentation sample: https://api.sportradar.com/draft/nba/trial/v1/en/2021/trades.xml?api_key={your_api_key}
     * Variable URL: https://api.sportradar.com/draft/nba/{access_level}/{version}/{language_code}/{year}/trades.{format}?api_key={your_api_key}
     */
    Mono<TradesResponse> getTrades(Integer year);
}
