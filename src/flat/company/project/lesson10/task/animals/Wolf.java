package flat.company.project.lesson10.task.animals;
import java.util.Arrays;
public class Wolf extends WildAnimal{
    private final String[] likeToEat;
    private final String color;

    public Wolf(String[] likeToEat, String color) {
        this.likeToEat = likeToEat;
        this.color = color;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Wolf wolf = (Wolf) o;
        return Arrays.equals(likeToEat, wolf.likeToEat) && color.equals(wolf.color)
                && this.getStrength() == wolf.getStrength() && this.getAge() == wolf.getAge()&&
                this.getName().equals(wolf.getName());
    }
}
