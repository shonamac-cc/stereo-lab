public class RPlayer extends Component{

    private int speed;

    public RPlayer(String make, String model, int speed) {
        super(make, model);
        this.speed = speed;
    }

    public int getSpeed(){
        return this.speed;
    }

}
