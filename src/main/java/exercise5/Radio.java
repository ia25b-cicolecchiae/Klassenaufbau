package exercise5;

public class Radio {

    public boolean isOn;
    public int volume;
    public double frequency;


    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public Radio(boolean isOn, int volume, double frequency) {
        this.isOn = isOn;
        this.volume = volume;
        this.frequency = frequency;
    }
    public void on(){
        isOn = true;
    }
    public void off(){
        isOn = false;
    }
    public void increaseVolume(){
        volume++;
    }
    public void decreaseVolume(){
        volume--;
    }
    public void selectChannel(double frequency){
        this.frequency = frequency;
    }
    public String toString(){
        return "isOn: " + isOn + ", volume: " + volume + ", frequency: " + frequency;
    }



}
