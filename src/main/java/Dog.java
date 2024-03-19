public class Dog extends Animal implements Predator{
  public void makeNoise(){
    System.out.println("Woof");
  }

  public void hunt(){
    System.out.println(name + "is hunting*");
  }
}