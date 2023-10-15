package flat.company.project;

public class Cat {
    private String name;
    private double weight;
    private int victories;

    public Cat() {
        this.name = "Мурзик";
        this.weight = 1.0;
        this.victories = 0;
    }

    public void setName(String name) { // Setter
        // if (name == null) return;
        if (name.length() <= 3) {
            this.name = name;
        }

    }

    public void setWeight(double weight) { // Setter
        // if (name == null) return;
        if (weight >= 1 && weight < 9) {
            this.weight = weight;
        }

    }

    public boolean attack(Cat opponent) {
        if (opponent != null) {
            if (this.weight > opponent.weight) {

                this.victories++;
                return true;
            } else {
                opponent.victories++;
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.setName("Мурзик");
        cat1.setWeight(2.5);

        cat2.setName("Барсик");
        cat2.setWeight(1.0);

        boolean result = cat1.attack(cat2);
        System.out.println("Результат атаки: " + result);
    }

}
