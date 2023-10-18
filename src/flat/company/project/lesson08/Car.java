package flat.company.project.lesson08;

public class Car extends Vehicle {
    private String color = "White";

    public Car(String number, int maxSpeed,String color) {
        super(number, maxSpeed); // вызов конструктора родителя
        this.maxSpeed = 240;
        this.color = color;
        this.levelOfWare = 7;
    }

    public void updateColor(String newColorValue) {
        this.color = newColorValue;
    }
    @Override
    public void repair(){
     while (levelOfWare >0){
         levelOfWare--;
     }
    }
}
