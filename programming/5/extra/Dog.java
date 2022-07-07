public class Dog{

  //class variables
  private String name;
  private int age;
  private String breed;
  private boolean isHungry;
  private String gender;

  //constructor
  public Dog(String n, int a, String b, boolean h, String g){
    //set all the given paramaters to the class variables
    name = n;
    age = a;
    breed = b;
    isHungry = h;
    gender = g;
  }

  //class methods
  public void bark(){
    System.out.println("Ruff Ruff");
  }

  //this is a "setter"
  public void eat(){
    if(isHungry == true){
      isHungry = false;
    }
  }
} 
