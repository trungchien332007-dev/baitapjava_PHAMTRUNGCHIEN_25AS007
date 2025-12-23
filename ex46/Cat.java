package ex46;

public class Cat extends Mammal{
    public Cat(String name){
      super(name);
    }
     public void greets(){
        System.out.printf("Meow");
     }

    @Override
    public String toString() {
        return "Cat{}";
    }
}
