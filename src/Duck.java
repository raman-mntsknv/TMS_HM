public class Duck extends Animal implements Moveable, Flyable, Swimmable{
    public Duck(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Quack!");
    }

    public void move() {
        System.out.println(name + " is moving");
    }

    public void fly() {
        System.out.println(name + " is flying");

    };

    public void swim() {
        System.out.println(name + " is swimming");

    }


}
