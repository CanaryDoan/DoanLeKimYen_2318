package lec11_Encapsulation.StaticVariable;

public class person {
    private String name;
    private int count = 0;

    public person(String n) {
        name = n;
        count++;
        System.out.println(count);



    public static void main(String[] args) {
        person p1 = new Person("Trang");
        Person p2 = new Person("Duong");
        Person p3 = new Person("Luong");

    }
