package Lec9_Inheritance.Super.Example5;

public class Processor {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());
        int dogCount = 0, catCount = 0;
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                dogCount++;
            } else if (animal instanceof Cat) {
                catCount++;
            }
        }
        System.out.println("cat: " + catCount + "\ndog: " + dogCount);
    }

}
