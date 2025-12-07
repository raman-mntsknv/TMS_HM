public class Cat extends Animal implements Moveable{
    public Cat(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void move() {
        System.out.println(name + " is moving");
    }
}
