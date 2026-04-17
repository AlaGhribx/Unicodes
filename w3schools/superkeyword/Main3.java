package w3schools.superkeyword;

class Animal {
  Animal() {
    System.out.println("Animal is created");
  }
}

class Dog extends Animal {
  Dog() {
    super(); // Call parent constructor
    System.out.println("Dog is created");
  }
}

public class Main3 {
  public static void main(String[] args) {
    Dog myDog = new Dog();
  }
}

