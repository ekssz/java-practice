package practice;

abstract class Pet {
    abstract void voice();
}

class Dog extends Pet {
    void voice() {
        System.out.println("Gav-gav!");
    }
}

class Cat extends Pet {
    void voice() {
        System.out.println("Miaou!");
    }
}

class Cow extends Pet {
    void voice() {
        System.out.println("Mu-u-u!");
    }
}

public class Pr_10_2 {
    public static void main(String[] args) {
        Pet[] pets = new Pet[3];
        pets[0] = new Dog();
        pets[1] = new Cat();
        pets[2] = new Cow();
        
        for (int i = 0; i < pets.length; i++) {
            pets[i].voice();
        }
    }
}
