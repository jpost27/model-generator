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
    Mono<CurrentSeasonScheduleResponse> getCurrentSeasonSchedule();

    Mono<CurrentWeekScheduleResponse> getCurrentWeekSchedule();

    Mono<DailyChangeLogResponse> getDailyChangeLog(Integer year, Integer month, Integer day);

    Mono<DailyTransactionsResponse> getDailyTransactions(Integer year, Integer month, Integer day);

    Mono<DraftSummaryResponse> getDraftSummary(Integer year);

    Mono<GameBoxscoreResponse> getGameBoxscore(String gameId);

    Mono<GameRosterResponse> getGameRoster(String gameId);

    Mono<GameStatisticsResponse> getGameStatistics(String gameId);

    Mono<LeagueHierarchyResponse> getLeagueHierarchy();

    Mono<PlayByPlayResponse> getPlayByPlay(String gameId);

    Mono<PlayerProfileResponse> getPlayerProfile(String playerId);

    Mono<PostgameStandingsResponse> getPostgameStandings(Integer year, String nflSeason);

    Mono<ProspectsResponse> getProspects(Integer year);

    Mono<SeasonScheduleResponse> getSeasonSchedule(Integer year, String nflSeason);

    Mono<SeasonalStatisticsResponse> getSeasonalStatistics(Integer year, String nflSeason,
            String teamId);

    Mono<SeasonsResponse> getSeasons();

    Mono<TeamDraftSummaryResponse> getTeamDraftSummary(Integer year, String teamId);

    Mono<TeamProfileResponse> getTeamProfile(String teamId);

    Mono<TeamRosterResponse> getTeamRoster(String teamId);

    Mono<TopProspectsResponse> getTopProspects(Integer year);

    Mono<TradesResponse> getTrades(Integer year);

    Mono<WeeklyDepthChartsResponse> getWeeklyDepthCharts(Integer year, String nflSeason,
            String nflSeasonWeek);

    Mono<WeeklyInjuriesResponse> getWeeklyInjuries(Integer year, String nflSeason,
            String nflSeasonWeek);

    Mono<WeeklyScheduleResponse> getWeeklySchedule(Integer year, String nflSeason,
            String nflSeasonWeek);
}
