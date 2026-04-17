package w3schools.superkeyword;

class Animal {
  String type = "Animal";
}

class Dog extends Animal {
  String type = "Dog";

  public void printType() {
    System.out.println(super.type); // Access parent attribute
  }
}

public class Main2 {
  public static void main(String[] args) {
    Dog myDog = new Dog();
    myDog.printType();
  }
}