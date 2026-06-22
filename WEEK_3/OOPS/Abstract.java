import java.util.Random;

// Abstract class
abstract class Compartment {
    public abstract String notice();
}

// FirstClass class
class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "Notice: This is First Class Compartment.";
    }
}

// Ladies class
class Ladies extends Compartment {
    @Override
    public String notice() {
        return "Notice: Reserved for Ladies.";
    }
}

// General class
class General extends Compartment {
    @Override
    public String notice() {
        return "Notice: General Compartment.";
    }
}

// Luggage class
class Luggage extends Compartment {
    @Override
    public String notice() {
        return "Notice: Luggage Compartment.";
    }
}

// Test class
public class TestCompartment {
    public static void main(String[] args) {

        Compartment[] compartments = new Compartment[10];
        Random random = new Random();

        // Create 10 compartments randomly
        for (int i = 0; i < compartments.length; i++) {
            int n = random.nextInt(4) + 1; // Random number between 1 and 4

            switch (n) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }

        // Demonstrate polymorphism
        for (int i = 0; i < compartments.length; i++) {
            System.out.println("Compartment " + (i + 1) + ": "
                    + compartments[i].notice());
        }
    }
}
