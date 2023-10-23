package flat.company.project.lesson10.task.animals;

public class Main {
    public static void main(String[] args) {
        String[] likeToEat = {"Rabbits", "Deers"};
        String color = "Black";
        Wolf wolf01 = new Wolf(likeToEat, color);
        Wolf wolf02 = new Wolf(likeToEat, color);
        wolf02.setName("Mark");
        wolf01.setName("Mark");
        Boolean l = wolf01.equals(wolf02);
    }
}