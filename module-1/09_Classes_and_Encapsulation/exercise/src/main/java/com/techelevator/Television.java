package com.techelevator;

public class Television {

    private boolean  isOn;
    private int currentChannel;
    private int currentVolume;

    public Television(){
        this.isOn = false;
        this.currentVolume = 2;
        this.currentChannel = 3;
    }


    public boolean isOn() {
        return isOn;
    }
    public int getCurrentChannel() {
        return currentChannel;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }


    public void turnOff() {
        isOn = false;
    }
    public void turnOn() {
        isOn = true;
        currentChannel = currentChannel;
        currentVolume = currentVolume;


    }
    public void changeChannel(int newChannel) {
        if(isOn && newChannel > 3 && newChannel<=18)
            currentChannel=newChannel;
    }
    public void channelUp() {
        if(isOn && currentChannel >= 3 && currentChannel <= 18)
        {
            currentChannel+=1;
            if(currentChannel>18)
                currentChannel=3;
        }
    }
    public void channelDown() {
        if(isOn && currentChannel <= 18 & currentChannel >= 3)
        {
            currentChannel-=1;
            if(currentChannel<3)
                currentChannel=18;
        }
    }
    public void raiseVolume() {
        if(isOn)
        {
            if(currentVolume >= 0 && currentVolume <=10)
                currentVolume+=1;
        }
    }
    public void lowerVolume() {
        if(isOn)
        {
            if(currentVolume<= 10 && currentVolume >0)
                currentVolume-=1;
        }
    }


}

