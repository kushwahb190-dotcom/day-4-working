public abstract class Animal {
    public abstract void makeSound();
    public void sleep() {
        System.out.println("zzz..."); 
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("woof");
    }
}

class Bird extends Animal { 
    public void makeSound() {
        System.out.println("tweet!");
    }
}

public class Main { 
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        
        dog.makeSound();
        dog.sleep();
        bird.makeSound();
        bird.sleep();
    }
}    

