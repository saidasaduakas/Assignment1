package com.company;

public abstract class Transport {

    private DriveBehaviour driveBehaviour;
    private VoiceBehaviour voiceBehaviour;

    public Transport(DriveBehaviour driveBehaviour,VoiceBehaviour voiceBehaviour){
        this.driveBehaviour=driveBehaviour;
        this.voiceBehaviour=voiceBehaviour;
    }

    public void performdrive(){
        this.driveBehaviour.drive();
    }
    public void performvoice(){
        this.voiceBehaviour.voice();
    }

    public DriveBehaviour getDriveBehaviour() {
        return driveBehaviour;
    }

    public void setDriveBehaviour(DriveBehaviour driveBehaviour) {
        this.driveBehaviour = driveBehaviour;
    }

    public VoiceBehaviour getVoiceBehaviour() {
        return voiceBehaviour;
    }

    public void setVoiceBehaviour(VoiceBehaviour voiceBehaviour) {
        this.voiceBehaviour = voiceBehaviour;
    }

    public abstract void display();

}
