//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Pluto", 4);
        dog.makeSound();
        dog.move();

        Cat cat = new Cat("Leo", 7);
        cat.makeSound();
        cat.move();

        Eagle eagle = new Eagle("Eddie", 15);
        eagle.makeSound();
        eagle.move();
        eagle.fly();

        Duck duck = new Duck("Donald", 35);
        duck.makeSound();
        duck.fly();
        duck.move();
        duck.eat();
        duck.swim();

        Fish fish = new Fish("Nemo", 1);
        fish.makeSound();
        fish.swim();

        Snake snake = new Snake("Kaa", 50);
        snake.makeSound();
        snake.move();
    }
}