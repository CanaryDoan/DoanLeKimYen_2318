package Lec9_Inheritance.Super.Example2;

public class Processor {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        System.out.println("Cat's ID: " + cat.catID);
        cat.catchMouse();
    }
}
