import java.util.Arrays;

class Dog {
  String breed;
  int age;

  public Dog(String dogBreed, int dogYears) {
    breed = dogBreed;
    age = dogYears;
  }

  public static void main(String[] args) {
    System.out.println("Is this working?");
    String[] items = {"these", "are", "the", "items", "apple"};
    Dog poochie = new Dog("Doberman", 75);
    System.out.println(poochie.toString());
  }

  public String toString(){
    return "This is a " + breed + " dog!";
}
}