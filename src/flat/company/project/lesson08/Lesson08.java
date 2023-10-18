package flat.company.project.lesson08;

public class Lesson08 {
    public static void main(String[] args) {
        Bicycle bicycle01 = new Bicycle("1v", 60);
        bicycle01.incLevelOfWare(3);
        bicycle01.repair();
        Train train01 = new Train("123P", 130, 13, true);
        train01.incLevelOfWare(3);
        train01.repair();
        Car car01 = new Car("1",210,"Blue");
        Scooter scooter01 = new Scooter("Городской",2,24,true);
        // доступно объявление переменных через общий тип,
        // тогда доступ к методам и свойствам осуществляется согласно типу (слева)
        Vehicle vehicle = new Bicycle("1vh", 30);
        car01.updateColor("Black");
        // возможно приведение типов
        Bicycle bVehicle02 = (Bicycle) vehicle;
        // приведение к неверному типу приведет к ClassCastException
        // Train bVehicle01 = (Train) vehicle; // ClassCastException
    }
}
