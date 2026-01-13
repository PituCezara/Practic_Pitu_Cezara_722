package model;

import model.StrafeGrund;
public class Strafe {
    private int id;
    private int fahrerId;
    private StrafeGrund grund;
    private int seconds;
    private int lap;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getFahrerId() { return fahrerId; }
    public void setFahrerId(int fahrerId) { this.fahrerId = fahrerId; }
    public StrafeGrund getGrund() { return grund; }
    public void setGrund(StrafeGrund grund) { this.grund = grund; }
    public int getSeconds() { return seconds; }
    public void setSeconds(int seconds) { this.seconds = seconds; }
    public int getLap() { return lap; }
    public void setLap(int lap) { this.lap = lap; }
}
