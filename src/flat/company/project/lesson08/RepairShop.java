package flat.company.project.lesson08;

import java.util.Random;

public class RepairShop {
    // в массив можно добавить тип Vehicle и все его подтипы
    private Vehicle[] vehicles;
    private String[] colors = {"красный", "жёлтый", "оранжевый", "чёрный"};

    public void addToVehicles(Vehicle vehicle){

    }
    public void addCar(Car NewCar ){
        Vehicle[] newVehicles = new Vehicle[vehicles.length + 1];
        for(int i=0;i<vehicles.length;i++){
            newVehicles[i] = vehicles[i];
            newVehicles[newVehicles.length - 1] = NewCar;
        }
    }

    public void repairAll(){
        for (Vehicle vehicle : vehicles) {
            // для вызова доступны только методы супертипа, т.е. Vehicle
            // но будет использована реализация конкретного подтипа
            vehicle.repair();
            // оператор instanceof вернет true,
            // если экземпляр (слева) принадлежит указанному справа типу
            /*if (vehicle instanceof Train) {
                Train t = (Train) vehicle;
                t.changeClimateControl();
            }*/
            // проверка на принадлежность типу + приведение
            // аналогично предыдущей записи
            if (vehicle instanceof Train train) {
                train.changeClimateControl();
            }
            if(vehicle instanceof Car car){
                String randomColor = colors[(int) (Math.random() * colors.length)];
                car.updateColor(randomColor);
            }

        }

    }
}
