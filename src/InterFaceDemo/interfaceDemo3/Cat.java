package InterFaceDemo.interfaceDemo3;

public class Cat extends Animal implements Jumpping{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("eat fis");
    }

    @Override
    public void jump() {
        System.out.println("cat jump");
    }
}
