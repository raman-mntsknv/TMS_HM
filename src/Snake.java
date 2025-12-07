public class Snake extends Animal implements Moveable{
    public Snake(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Hsssss");
    }

    public void move() {
        System.out.println(name + " is moving");
    }

}
