class Animal {
  String name;

}

class Cat extends Animal {
  public void play() {
    System.out.println("meow");
  }
}

class Dog extends Animal {
  public void play() {
    System.out.println("woof");
  }
}

public class Main {

  public static void sound(Animal animal) {  // 다형성 개념 구현
    if (animal instanceof Cat) {
      Cat cat = (Cat) animal;
      cat.play();
    }
    else if (animal instanceof Dog) {
      Dog dog = (Dog) animal;
      dog.play();
    }
  }

  public static void main(String[] args) {
    sound(new Cat());  // Animal animal = new Cat();
    sound(new Dog());
  }

}
