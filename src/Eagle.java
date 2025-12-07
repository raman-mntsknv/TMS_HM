public class Eagle extends Animal implements Moveable, Flyable{
    public Eagle(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Screech!");
    }

    public void move() {
        System.out.println(name + " is moving");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying");

    }
}
