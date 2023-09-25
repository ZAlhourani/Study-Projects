package com.techelevator;

public class Television {

    boolean  isOn;
    int currentChannel;
    int currentVolume;


    public boolean isOn() {
        return isOn = false;
    }
    public int getCurrentChannel() {
        return currentChannel = 3;
    }
    public int getCurrentVolume() {
        return currentVolume = 2;
    }


    void turnOff() {
        isOn = false;
    }
    void turnOn() {
        if(!isOn)
            currentChannel = currentChannel;
            currentVolume = currentChannel;

    }
    void changeChannel(int newChannel) {
        if(isOn && newChannel > 3 && newChannel<=18)
            currentChannel=newChannel;
    }
    void channelUp() {
        if(isOn && currentChannel >= 3 && currentChannel <= 18)
        {
            currentChannel+=1;
            if(currentChannel>18)
                currentChannel=3;
        }
    }
    void channelDown() {
        if(isOn && currentChannel <= 18 & currentChannel >= 3)
        {
            currentChannel-=1;
            if(currentChannel<3)
                currentChannel=18;
        }
    }
    void raiseVolume() {
        if(isOn)
        {
            if(currentVolume >= 0 && currentVolume <=10)
                currentVolume+=1;
        }
    }
    void lowerVolume() {
        if(isOn)
        {
            if(currentVolume<= 10 && currentVolume >=0)
                currentVolume-=1;
        }
    }


}

