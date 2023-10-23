package flat.company.project.task11;

public class SunSystem {

    public enum Planet {
        MERCURY("Mercury", 0.330, 2439.7),
        VENUS("Venus", 4.87, 6051.8),
        EARTH("Earth", 5.97, 6371),
        MARS("Mars", 0.642, 3389.5),
        JUPITER("Jupiter", 1898, 69911),
        SATURN("Saturn", 568, 58232),
        URANUS("Uranus", 86.8, 25362),
        NEPTUNE("Neptune", 102, 24622);
        private String name;
        private Double weight;
        private Double radius;

        Planet(String name, double weight, double radius) {
            this.name = name;
            this.weight = weight;
            this.radius = radius;
        }
        public String getName() {
            return name;
        }

        public double getWeight() {
            return weight;
        }

        public double getRadius() {
            return radius;
        }
    }}
