package lec11_Encapsulation.Example;

public class Person {

    public String name;
    private double weight;

    public void setWeight(double weight) {
        if (this.weight < 0) {
            System.out.println("Weight can not negative");
        } else {
            this.weight = weight;
        }
    }
}

public class EncapsulationExistpage7 {

    public static void main(String[] args) {
        Person a = new Person();
        a.name = "trang";
        a.setWeight(-10);
    }
}
