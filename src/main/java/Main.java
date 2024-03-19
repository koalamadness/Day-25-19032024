// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    
    Rabbit rabbit = new Rabbit();
    rabbit.flee();

    Hawk hawk = new Hawk();
    hawk.hunt();

    Fish fish = new Fish();
    fish.hunt();

    Dog dog = new Dog();
    dog.makeNoise();
    dog.name = "Gonorrea";
    dog.printName();

    dog.hunt();
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}