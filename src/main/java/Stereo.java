public class Stereo {

    private String name;
    private int volume;
    private Radio radio;
    private RPlayer rPlayer;
    private CDPlayer cdPlayer;

    public Stereo(String name, Radio radio, RPlayer rPlayer, CDPlayer cdPlayer){
        this.radio = radio;
        this.rPlayer = rPlayer;
        this.cdPlayer = cdPlayer;
        this.name = name;
        this.volume = 0;
    }

    public String tuneRadio() {
        return this.radio.getTune();
    }

    public String getName(){
        return this.name;
    }


    public int getVolume() {
        return volume;
    }

    public void increaseVolume(int volume) {
        if (volume > 0) {
            this.volume += volume;
        }
    }

    public void decreaseVolume(int volume) {
        if (volume > 0) {
            this.volume -= volume;
        }
    }
}
