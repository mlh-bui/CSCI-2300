package Wk2_ObjectPractice;// 1/26 In-class exercises
// Module 2x2
//
// COMP 313 - Marissa Bui

public class Television {
    private int channel;
    private int volume;

    private boolean mute; // true = on, false = off

    // range for volume
    private int lowestVol = 0;
    private int topVol = 10;

    // range for channels
    private int lowestChannel = 2;
    private int topChannel = 30;

    public Television() {
        this.channel = 2;
        this.volume = 5;
    }

    public Television(int ch, int vol, boolean mute) {
        this.channel = ch;
        this.volume = vol;
        this.mute = mute;
    }

    public void togglePower() {
        if(!this.mute) {
            this.mute = true;
        } else {
            this.mute = false;
        }
    }

    public void volumeUp() {
        if (this.volume < topVol) {
            this.volume += volume;
        }
    }

    public void volumeDown(int v) {
        if (lowestVol < this.volume) {
            this.volume -= v;
        }
    }

    public int getVolume() {
        return this.volume;
    }

    public int getChannel() {
        return this.channel;
    }

    public void setChannel(int num) {
        this.channel = num;
    }

    public void channelUp() {
        if (this.channel < topChannel) {
            this.channel += channel;
        }
    }

    public void channelDown() {
        if (lowestChannel < channel ) {
            this.channel -= channel;
        }
    }

    // similar to toggle power,
    // if the volume is muted --> turn on volume
    // if the volume is NOT muted --> mute volume

    public void mute() {
        if(!this.mute) {
            this.mute = true;
        } else {
            this.mute = false;
        }
    }

    public boolean isMuted() {
        boolean muteStatus = false;
        if(this.mute) {
            muteStatus = true;
        }
        return muteStatus;
    }

    public int jumpToPreviousChannel() {
        int oldChannel = this.channel;
        return oldChannel;
    }

} // class Wk2_ObjectPractice.Television
