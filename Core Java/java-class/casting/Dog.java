package casting;

class Animal {
  int a = 10;
}

public class Dog extends Animal {
  int b = 90;

  public static void main(String[] args) {
    // Dog myDog = new Dog(); //normal
    Animal myAnimal = new Dog(); // upcasting(child to parent )
    Dog myDog = (Dog) myAnimal; // downcasting

  }

}
