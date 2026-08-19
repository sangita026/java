public class Animal {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.sound();
        c.sound();
    }
}

interface Sound {
    void sound();
}

class Dog implements Sound {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Sound {
    public void sound() {
        System.out.println("Cat meows");
    }
}