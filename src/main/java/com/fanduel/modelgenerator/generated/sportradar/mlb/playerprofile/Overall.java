package com.fanduel.modelgenerator.generated.sportradar.mlb.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
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
public class Overall {
    @JsonProperty("gofo")
    private Double gofo;

    @JsonProperty("brwar")
    private Double brwar;

    @JsonProperty("iso")
    private Double iso;

    @JsonProperty("ab_risp")
    private Integer abRisp;

    @JsonProperty("seca")
    private Double seca;

    @JsonProperty("bip")
    private Integer bip;

    @JsonProperty("fpct")
    private Double fpct;

    @JsonProperty("dp")
    private Integer dp;

    @JsonProperty("wraa")
    private Double wraa;

    @JsonProperty("pitch_count")
    private Integer pitchCount;

    @JsonProperty("generated_speed")
    private GeneratedSpeed generatedSpeed;

    @JsonProperty("home_away")
    private List<HomeAway> homeAway;

    @JsonProperty("onbase")
    private Onbase onbase;

    @JsonProperty("opponent")
    private List<Opponent> opponent;

    @JsonProperty("team_lob")
    private Integer teamLob;

    @JsonProperty("games")
    private Games games;

    @JsonProperty("pitches")
    private Pitches pitches;

    @JsonProperty("lob_risp_2out")
    private Integer lobRisp2out;

    @JsonProperty("c_wp")
    private Integer cWp;

    @JsonProperty("bbpa")
    private Double bbpa;

    @JsonProperty("woba")
    private Double woba;

    @JsonProperty("ab")
    private Integer ab;

    @JsonProperty("linedrive")
    private Integer linedrive;

    @JsonProperty("travel_time")
    private TravelTime travelTime;

    @JsonProperty("surface")
    private List<Surface> surface;

    @JsonProperty("bbk")
    private Double bbk;

    @JsonProperty("barreled_ball")
    private BarreledBall barreledBall;

    @JsonProperty("flyball")
    private Integer flyball;

    @JsonProperty("slg")
    private Double slg;

    @JsonProperty("ap")
    private Integer ap;

    @JsonProperty("ops")
    private Double ops;

    @JsonProperty("month")
    private List<Month> month;

    @JsonProperty("rf")
    private Double rf;

    @JsonProperty("rbi_2out")
    private Integer rbi2out;

    @JsonProperty("rbi")
    private Integer rbi;

    @JsonProperty("hit_risp")
    private Integer hitRisp;

    @JsonProperty("errors")
    private Errors errors;

    @JsonProperty("lob")
    private Integer lob;

    @JsonProperty("xbh")
    private Integer xbh;

    @JsonProperty("venue")
    private List<Venue> venue;

    @JsonProperty("groundball")
    private Integer groundball;

    @JsonProperty("distance")
    private Distance distance;

    @JsonProperty("steal")
    private Steal steal;

    @JsonProperty("abhr")
    private Double abhr;

    @JsonProperty("launch_speed")
    private LaunchSpeed launchSpeed;

    @JsonProperty("error")
    private Integer error;

    @JsonProperty("outs")
    private Outs outs;

    @JsonProperty("total")
    private List<Total> total;

    @JsonProperty("avg")
    private String avg;

    @JsonProperty("assists")
    private Assists assists;

    @JsonProperty("max_height")
    private MaxHeight maxHeight;

    @JsonProperty("inn_2")
    private Double inn2;

    @JsonProperty("inn_1")
    private Integer inn1;

    @JsonProperty("travel_distance")
    private TravelDistance travelDistance;

    @JsonProperty("outcome")
    private Outcome outcome;

    @JsonProperty("a")
    private Integer a;

    @JsonProperty("hang_time")
    private HangTime hangTime;

    @JsonProperty("homerun_distance")
    private HomerunDistance homerunDistance;

    @JsonProperty("bwar")
    private Double bwar;

    @JsonProperty("launch_spin_rate")
    private LaunchSpinRate launchSpinRate;

    @JsonProperty("war")
    private Double war;

    @JsonProperty("abk")
    private Double abk;

    @JsonProperty("wgdp")
    private Double wgdp;

    @JsonProperty("tc")
    private Integer tc;

    @JsonProperty("pitcher_hand")
    private List<PitcherHand> pitcherHand;

    @JsonProperty("pb")
    private Integer pb;

    @JsonProperty("popup")
    private Integer popup;

    @JsonProperty("fwar")
    private Double fwar;

    @JsonProperty("day_night")
    private List<DayNight> dayNight;

    @JsonProperty("babip")
    private Double babip;

    @JsonProperty("tp")
    private Integer tp;

    @JsonProperty("obp")
    private Double obp;

    @JsonProperty("runs")
    private Runs runs;

    @JsonProperty("po")
    private Integer po;

    @JsonProperty("launch_angle")
    private LaunchAngle launchAngle;

    public Optional<Double> getGofo() {
        return Optional.ofNullable(gofo);
    }

    public Optional<Double> getBrwar() {
        return Optional.ofNullable(brwar);
    }

    public Optional<Double> getIso() {
        return Optional.ofNullable(iso);
    }

    public Optional<Integer> getAbRisp() {
        return Optional.ofNullable(abRisp);
    }

    public Optional<Double> getSeca() {
        return Optional.ofNullable(seca);
    }

    public Optional<Integer> getBip() {
        return Optional.ofNullable(bip);
    }

    public Optional<Double> getFpct() {
        return Optional.ofNullable(fpct);
    }

    public Optional<Integer> getDp() {
        return Optional.ofNullable(dp);
    }

    public Optional<Double> getWraa() {
        return Optional.ofNullable(wraa);
    }

    public Optional<Integer> getPitchCount() {
        return Optional.ofNullable(pitchCount);
    }

    public Optional<GeneratedSpeed> getGeneratedSpeed() {
        return Optional.ofNullable(generatedSpeed);
    }

    public List<HomeAway> getHomeAway() {
        return Optional.ofNullable(homeAway).orElse(Collections.emptyList());
    }

    public Optional<Onbase> getOnbase() {
        return Optional.ofNullable(onbase);
    }

    public List<Opponent> getOpponent() {
        return Optional.ofNullable(opponent).orElse(Collections.emptyList());
    }

    public Optional<Integer> getTeamLob() {
        return Optional.ofNullable(teamLob);
    }

    public Optional<Games> getGames() {
        return Optional.ofNullable(games);
    }

    public Optional<Pitches> getPitches() {
        return Optional.ofNullable(pitches);
    }

    public Optional<Integer> getLobRisp2out() {
        return Optional.ofNullable(lobRisp2out);
    }

    public Optional<Integer> getCWp() {
        return Optional.ofNullable(cWp);
    }

    public Optional<Double> getBbpa() {
        return Optional.ofNullable(bbpa);
    }

    public Optional<Double> getWoba() {
        return Optional.ofNullable(woba);
    }

    public Optional<Integer> getAb() {
        return Optional.ofNullable(ab);
    }

    public Optional<Integer> getLinedrive() {
        return Optional.ofNullable(linedrive);
    }

    public Optional<TravelTime> getTravelTime() {
        return Optional.ofNullable(travelTime);
    }

    public List<Surface> getSurface() {
        return Optional.ofNullable(surface).orElse(Collections.emptyList());
    }

    public Optional<Double> getBbk() {
        return Optional.ofNullable(bbk);
    }

    public Optional<BarreledBall> getBarreledBall() {
        return Optional.ofNullable(barreledBall);
    }

    public Optional<Integer> getFlyball() {
        return Optional.ofNullable(flyball);
    }

    public Optional<Double> getSlg() {
        return Optional.ofNullable(slg);
    }

    public Optional<Integer> getAp() {
        return Optional.ofNullable(ap);
    }

    public Optional<Double> getOps() {
        return Optional.ofNullable(ops);
    }

    public List<Month> getMonth() {
        return Optional.ofNullable(month).orElse(Collections.emptyList());
    }

    public Optional<Double> getRf() {
        return Optional.ofNullable(rf);
    }

    public Optional<Integer> getRbi2out() {
        return Optional.ofNullable(rbi2out);
    }

    public Optional<Integer> getRbi() {
        return Optional.ofNullable(rbi);
    }

    public Optional<Integer> getHitRisp() {
        return Optional.ofNullable(hitRisp);
    }

    public Optional<Errors> getErrors() {
        return Optional.ofNullable(errors);
    }

    public Optional<Integer> getLob() {
        return Optional.ofNullable(lob);
    }

    public Optional<Integer> getXbh() {
        return Optional.ofNullable(xbh);
    }

    public List<Venue> getVenue() {
        return Optional.ofNullable(venue).orElse(Collections.emptyList());
    }

    public Optional<Integer> getGroundball() {
        return Optional.ofNullable(groundball);
    }

    public Optional<Distance> getDistance() {
        return Optional.ofNullable(distance);
    }

    public Optional<Steal> getSteal() {
        return Optional.ofNullable(steal);
    }

    public Optional<Double> getAbhr() {
        return Optional.ofNullable(abhr);
    }

    public Optional<LaunchSpeed> getLaunchSpeed() {
        return Optional.ofNullable(launchSpeed);
    }

    public Optional<Integer> getError() {
        return Optional.ofNullable(error);
    }

    public Optional<Outs> getOuts() {
        return Optional.ofNullable(outs);
    }

    public List<Total> getTotal() {
        return Optional.ofNullable(total).orElse(Collections.emptyList());
    }

    public Optional<String> getAvg() {
        return Optional.ofNullable(avg);
    }

    public Optional<Assists> getAssists() {
        return Optional.ofNullable(assists);
    }

    public Optional<MaxHeight> getMaxHeight() {
        return Optional.ofNullable(maxHeight);
    }

    public Optional<Double> getInn2() {
        return Optional.ofNullable(inn2);
    }

    public Optional<Integer> getInn1() {
        return Optional.ofNullable(inn1);
    }

    public Optional<TravelDistance> getTravelDistance() {
        return Optional.ofNullable(travelDistance);
    }

    public Optional<Outcome> getOutcome() {
        return Optional.ofNullable(outcome);
    }

    public Optional<Integer> getA() {
        return Optional.ofNullable(a);
    }

    public Optional<HangTime> getHangTime() {
        return Optional.ofNullable(hangTime);
    }

    public Optional<HomerunDistance> getHomerunDistance() {
        return Optional.ofNullable(homerunDistance);
    }

    public Optional<Double> getBwar() {
        return Optional.ofNullable(bwar);
    }

    public Optional<LaunchSpinRate> getLaunchSpinRate() {
        return Optional.ofNullable(launchSpinRate);
    }

    public Optional<Double> getWar() {
        return Optional.ofNullable(war);
    }

    public Optional<Double> getAbk() {
        return Optional.ofNullable(abk);
    }

    public Optional<Double> getWgdp() {
        return Optional.ofNullable(wgdp);
    }

    public Optional<Integer> getTc() {
        return Optional.ofNullable(tc);
    }

    public List<PitcherHand> getPitcherHand() {
        return Optional.ofNullable(pitcherHand).orElse(Collections.emptyList());
    }

    public Optional<Integer> getPb() {
        return Optional.ofNullable(pb);
    }

    public Optional<Integer> getPopup() {
        return Optional.ofNullable(popup);
    }

    public Optional<Double> getFwar() {
        return Optional.ofNullable(fwar);
    }

    public List<DayNight> getDayNight() {
        return Optional.ofNullable(dayNight).orElse(Collections.emptyList());
    }

    public Optional<Double> getBabip() {
        return Optional.ofNullable(babip);
    }

    public Optional<Integer> getTp() {
        return Optional.ofNullable(tp);
    }

    public Optional<Double> getObp() {
        return Optional.ofNullable(obp);
    }

    public Optional<Runs> getRuns() {
        return Optional.ofNullable(runs);
    }

    public Optional<Integer> getPo() {
        return Optional.ofNullable(po);
    }

    public Optional<LaunchAngle> getLaunchAngle() {
        return Optional.ofNullable(launchAngle);
    }
}
