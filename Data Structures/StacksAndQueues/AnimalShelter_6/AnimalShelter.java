import java.util.LinkedList;

//TODO Try to create two queues for dogs and cats. dequeueDog and dequeueCats can run in O(1)
public class AnimalShelter {

    private LinkedList<Animal> list;
    private static final String DOG = "dog";

    AnimalShelter() {
        list = new LinkedList<>();
    }

    void enqueue(String type) {
        Animal animal;
        if (DOG.equals(type)){
            animal = new Dog();
        } else {
            animal = new Cat();
        }
        list.addLast(animal);
    }

    Animal dequeueAny() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("Shelter is empty");
        }
        return list.getFirst();
    }

    Dog dequeueDog() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("Shelter is empty");
        }
        for (Animal iterator: list) {
            if (iterator instanceof Dog) {
                list.remove(iterator);
                return (Dog) iterator;
            }
        }
        return null;
    }

    Cat dequeueCat() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("Shelter is empty");
        }
        for (Animal iterator: list) {
            if (iterator instanceof Cat) {
                list.remove(iterator);
                return (Cat) iterator;
            }
        }
        return null;
    }
}
