import java.util.*;

class Lion extends Animal {
    @Override
    public String getName() {
        return "Арслан";
    }
}

class Crane extends Animal {
    @Override
    public String getName() {
        return "Тогоруу";
    }
}

public class Main {
    public static void main(String[] args) {
        List<Lion> lions = new ArrayList<>();
        lions.add(new Lion());

        List<Animal> animals = new ArrayList<>();
        animals.add(new Crane());

        Zoo<Animal> zoo = new Zoo<>();
        zoo.transferAnimals(lions, animals);

        for (Animal a : animals) {
            System.out.println(a.getName());
        }
    }
}
