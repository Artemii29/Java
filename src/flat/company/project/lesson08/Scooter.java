package flat.company.project.lesson08;

public class Scooter extends Bicycle{
    private  boolean isElectric;

    public Scooter(String type,int numberOfWheels,int maxSpeed,boolean isElectric){
        super(type,numberOfWheels,maxSpeed);
        this.maxSpeed = 25;
        this.isElectric= true;

    }

}
