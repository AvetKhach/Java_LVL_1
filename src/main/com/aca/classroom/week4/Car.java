package com.aca.classroom.week4;

public class Car {
    private AudioPlayer audioPlayer;

    public Car(){

    }

    public Car(AudioPlayer audioPlayer){

    }

    public static void main(String[] args) {

    }

    public  void setAudioPlayer(AudioPlayer play){
        this.audioPlayer = play;
    }


    public void openDoor(){
        if(audioPlayer!= null){
            audioPlayer.play();
            wait3Second();
            audioPlayer.stop();

        }
    }
    public void wait3Second(){
        long start = System.currentTimeMillis()/1000;
        while(start<3){
            System.out.println(System.currentTimeMillis()/3000);
            start= System.currentTimeMillis()/1000;
        }


    }



}
