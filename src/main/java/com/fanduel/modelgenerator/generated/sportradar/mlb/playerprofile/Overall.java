package com.fanduel.modelgenerator.generated.sportradar.mlb.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
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
}
