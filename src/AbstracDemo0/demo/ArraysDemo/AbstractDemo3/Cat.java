package AbstracDemo0.demo.ArraysDemo.AbstractDemo3;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("eat fis");
    }
}
