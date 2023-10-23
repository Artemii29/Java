package flat.company.project.lesson08;

public class Scooter extends Bicycle{
    private  boolean isElectric;

    public Scooter(int maxSpeed,boolean isElectric){
        super("Scooter01",maxSpeed);
        this.maxSpeed = 25;
        this.isElectric= true;

    }

}
