public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal animal1 = animalFactory.getAnimal("faline");
        System.out.println("animal1 sound: " + animal1.makeSound());

        Animal animal2 = animalFactory.getAnimal("canine");
        System.out.println("animal2 sound: " + animal2.makeSound());
    }
}