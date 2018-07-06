public class CheckAnimalShelter {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();
        try {
            shelter.enqueue("dog");
            shelter.enqueue("cat");
            shelter.enqueue("dog");
            shelter.enqueue("dog");
            shelter.dequeueCat();
            shelter.enqueue("cat");
            shelter.dequeueCat();
            shelter.dequeueAny();
            shelter.dequeueDog();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
