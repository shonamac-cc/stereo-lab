public class CDPlayer extends Component{

    private int numOfCds;

    public CDPlayer(String make, String model, int numOfCds) {
        super(make, model);
        this.numOfCds = numOfCds;
    }

    public int getNumOfCds(){
        return this.numOfCds;
    }
}
