import java.util.List;

class Animal {
    public String getName() {
        return "Animal";
    }
}

public class Zoo<T extends Animal> {
    public void transferAnimals(List<? extends T> source, List<? super T> destination) {
        for (T animal : source) {
            destination.add(animal);
        }
        source.clear(); 
    }
}
